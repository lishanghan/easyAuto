package com.haier.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.haier.config.SpringContextHolder;
import com.haier.config.ZdyProperty;
import com.haier.enums.AssertTypeEnum;
import com.haier.enums.RegexEnum;
import com.haier.po.HryTest;
import com.haier.po.Tcase;
import com.haier.po.Ti;
import com.haier.service.TiService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.testng.Reporter;

import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @Description: 实际结果与期望结果比较器
 * @Author: luqiwei
 * @Date: 2018/5/2 17:09
 */
@Slf4j
public class AssertUtil {
    public static void supperAssert(Integer assertType, String expected, String actual, Integer actualType) {
        Reporter.log("断言类型 : " + AssertTypeEnum.getValue(assertType));
        Reporter.log("期望结果 :" + expected);
        Reporter.log("实际结果 :" + actual);
        if (expected == null || actual == null) {
            if (expected == null && actual == null) {
                return;
            } else {
                throw new AssertionError("断言失败:期望值与实际值一个null,一个非null!");
            }
        }
        switch (assertType) {
            //1.assertType=equal,完全相等
            case 1:
                if (!StringUtils.equalsIgnoreCase(actual, expected)) {
                    throw new AssertionError("断言失败:忽略大小写比较不相等!");
                }
                break;
            //2.assertType=contain,实际值中包含期望值
            case 2:
                if (!StringUtils.containsIgnoreCase(actual, expected)) {
                    throw new AssertionError("断言失败:实际值中不包含期望值(忽略大小写)");
                }
                break;
            //3.assertType=key-value,实际值中抽取出的key-value与指定值中提取的key-value相等,包含,或者正则匹配
            //注意,此种情况时,期望值必须是以json格式存储于数据库中
            case 3:
                if (Objects.isNull(actualType)) {
                    throw new AssertionError("断言失败:不明确的返回值类型,请检查tcase.iResponseType字段是否填写!");
                }
                switch (actualType) {
                    //actualType=json,对于实际返回值类型为json的处理
                    case 1:
                        JSONObject actualJsonObj = JSONUtil.str2JSONObj(actual);
                        if (actualJsonObj == null) {
                            Reporter.log("实际值尝试转换为JSON对象时失败,系统视实际值为null");
                        }
                        JSONObject expectJsonObj = JSONUtil.str2JSONObj(expected);
                        if (expectJsonObj == null) {
                            Reporter.log("期望值尝试转换为JSON对象时失败,系统视期望值为null");
                        }
                        if (actualJsonObj == null || expectJsonObj == null) {
                            if (actualJsonObj == null && expectJsonObj == null) {
                                return;
                            } else {
                                throw new AssertionError("断言失败:实际值与期望值一个为null,一个非null");
                            }
                        }
                        if (!isMatch(actualJsonObj, expectJsonObj)) {
                            throw new AssertionError("断言失败:实际值中未找到期望值中的key,或者实际值中找到了期望值中的key,"
                                    + "但是对应key中实际值的value与期望值value不相等,忽略大小写比较仍不相等,去除空字符比较([ \\t\\n\\x0B\\f\\r])仍不相等,实际值包含期望值比较仍不相等,"
                                    + "实际值匹配期望值的正则比较仍不相等!!!");
                        }
                        break;
                    case 2:
                        throw new AssertionError("断言失败:暂时不支持返回值类型ti.iResponseType=2的断言逻辑,请联系很容易平台管理员!");
                    default:
                        throw new AssertionError("断言失败:当断言类型为3:key-value时,暂时只支持返回值类型ti.iResponseType=1的断言逻辑,请联系很容易平台管理员!");
                }
                break;
            //assert-type=match
            case 4:
                try {
/*                    if (!actual.matches(expected)) {
                        throw new AssertionError("断言失败:实际值中未匹配到期望的正则表达式");
                    }*/
                    Pattern p = Pattern.compile(expected);
                    Matcher m = p.matcher(actual);
                    Boolean flag = false;
                    while (m.find()) {//实际值匹配到期望的正则表达式
                        flag = true;
                        break;
                    }
                    if (!flag) {
                        throw new AssertionError("断言失败:实际值中未匹配到期望的正则表达式");
                    }
                } catch (PatternSyntaxException e) {
                    throw new AssertionError("期望值中的正则表达式填写错误", e);
                }
                break;
            //assert-type=excuted
            case 5:
                try {
                    Pattern p = Pattern.compile(expected);
                    Matcher m = p.matcher(actual);
                    if (m.find()) {
                        throw new AssertionError("实际值中匹配到不期望出现的期望值");
                    }
                } catch (PatternSyntaxException e) {
                    throw new AssertionError("期望值中的正则表达式填写错误", e);
                }

                break;


            //以上情况都未匹配
            default:
                throw new AssertionError("断言失败:断言类型未指定,不能提供断言!!!");
        }
    }

    public static void supperAssert(String actual, Tcase tcase) {
        TiService tiService = SpringContextHolder.getBean(TiService.class);
        Ti ti = tiService.selectOne(tcase.getIid());
        supperAssert(tcase.getAsserttype(), tcase.getExpected(), actual, ti.getIresponsetype());
    }

    public static void supperAssert(String actual, HryTest test) {
        log.info("---4.断言-开始");
        ZdyProperty bean = SpringContextHolder.getBean(ZdyProperty.class);
        if (bean.getDebug()) {
            Reporter.log("debug模式时直接断言通过!");
            return;
        }
        if (test.getTi().getIuri().matches(RegexEnum.VIRTUAL_INTERFACE.getRegex())) {
            Reporter.log("虚拟接口直接断言通过!");
            return;
        }
        supperAssert(test.getTcase().getAsserttype(), test.getTcase().getExpected(), actual, test.getTi().getIresponsetype());
        log.info("---4.断言-结束");
        log.info("+++++++++++++++++++++++++++++++++++++");
    }

    public static Boolean isMatch(JSONObject actual, Map<String, Object> expected) {
        if (expected == null || expected.size() == 0) {
            return false;
        }
        for (Map.Entry<String, Object> entry : expected.entrySet()) {
            if (!isMatch(entry.getKey(), entry.getValue(), actual)) {
                return false;
            }
        }
        //所有key-value都已经通过校验,则返回true
        return true;
    }

    public static Boolean isMatch(JSONObject actual, JSONObject expected) {
        return isMatch(actual, expected.toJavaObject(Map.class));
    }

    /**
     * 将JSONObject解析到不能再解析为止,如果发现key相同,则比较Value的值
     *
     * @param key
     * @param value
     * @param actual
     * @return
     */
    public static Boolean isMatch(String key, Object value, JSONObject actual) {
        /**
         * 迭代解析JSONObject
         */
        for (Map.Entry<String, Object> entry : actual.entrySet()) {
            String actualKey = entry.getKey();
            Object actualValue = entry.getValue();

            /**
             * 如果actualValue是JSONObject
             */

            if (actualValue instanceof JSONObject) {//如果值是一个JSONObject,则迭代

                //兼容期望值为{},实际值也为{}的情况
                if (key.equals(actualKey) && value instanceof JSONObject) {
                    if (((JSONObject) value).size() == 0 && ((JSONObject) actualValue).size() == 0) {
                        return true;
                    }
                }

                //否则,嵌套执行,解析到不是JSONObject为止
                if (isMatch(key, value, (JSONObject) actualValue)) {
                    return true;
                }


                /**
                 * 如果actualValue是JSONArray
                 */
            } else if (actualValue instanceof JSONArray) {//如果值是一个JSONArray,
                JSONArray jsonArray = (JSONArray) actualValue;
                if (jsonArray.size() > 0) {//首先判断JSONArray的长度
                    //判断jsonArray的第一个元素,看其是否是对象,
                    //注意这里可能不妥,如果JSONArray中元素类型不一致,则只判断第一个元素的类型,是不够严谨的
                    //但是从实际实践中来看,暂时还没有发现JSONArray中元素类型不一致的情况
                    Object o = jsonArray.get(0);

                    if (o instanceof JSONObject) {//如果JsonArray中的类型为JSONObject,则迭代
                        for (int i = 0; i < jsonArray.size(); i++) {
                            if (isMatch(key, value, (JSONObject) jsonArray.get(i))) {
                                return true;
                            }
                        }
                    } else {//JSONArray中的类型不是JSONObject,此种情况其实绝大情况都是基本类型
                        if (key.equals(actualKey)) {
                            if (isMatch(value, jsonArray.toJSONString())) {
                                return true;
                            }
                        }
                    }
                } else {//如果jsonArray的长度为0,则jsonArray=[]
                    if (key.equals(actualKey)) {
                        if (isMatch(value, jsonArray.toJSONString())) {
                            return true;
                        }
                    }
                }

                /**
                 * actualValue不是JSON对象
                 */
            } else {
                if (key.equals(actualKey)) {
                    if (isMatch(value, actualValue)) {
                        return true;
                    }
                }
            }
        }
        /**
         * 所有迭代都走完了,没有匹配到结果,则返回false
         */
        return false;
    }

    /**
     * 比较对象
     *
     * @param expected
     * @param actual
     * @return
     */
    private static Boolean isMatch(Object expected, Object actual) {
        if (expected == null || actual == null) {
            if (expected == null && actual == null) {
                return true;
            } else {
                return false;
            }
        }
        if (actual.equals(expected)) {//两个对象相等
            return true;
        }
        String actualStr = actual.toString().trim();
        String expectedStr = expected.toString().trim();
        if (actualStr.equalsIgnoreCase(expectedStr)) {//转换String后忽略大小写相等
            return true;
        }

        if (actualStr.replaceAll("\\s", "").equalsIgnoreCase(expectedStr.replaceAll("\\s", ""))) {
            log.debug("替换所有空字符串后再比较相等");
            return true;
        }

        if (actualStr.contains(expectedStr)) {//实际值包含期望值
            return true;
        }

        if (actualStr.matches(expectedStr)) {//实际值匹配到期望的正则
            return true;
        }

        return false;//以上都不是,返回false
    }


}
