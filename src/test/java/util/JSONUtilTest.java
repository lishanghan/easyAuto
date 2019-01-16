package util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.haier.util.JSONUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/10/9 19:15
 */
public class JSONUtilTest {
    String jsonStr="{\n" +
            "  \"responseCode\": 0,\n" +
            "  \"responseMessage\": null,\n" +
            "  \"queryInvestByCondResultItemDtoPagination\": {\n" +
            "    \"totalCount\": 0,\n" +
            "    \"resultList\": [\n" +
            "      {\n" +
            "        \"id\": 1,\n" +
            "        \"name\": \"zhangsan\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 2,\n" +
            "        \"name\": \"lisi\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"id\": 3,\n" +
            "        \"name\": \"wangwu\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  \"success\": true\n" +
            "}";
    @Test
    public void json2MapTest(){

        JSONObject jsonObj= JSON.parseObject(jsonStr, Feature.OrderedField);
        Map<String,String> map=new HashMap<>();
        JSONUtil.json2Map(jsonObj,map);
    }
    @Test
    public void getValueTest(){
        String exp="$success";
        String exp2="${queryInvestByCondResultItemDtoPagination{resultList[1{name";
        String value = JSONUtil.getValue(jsonStr, exp);
        String value2=JSONUtil.getValue(jsonStr,exp2);
        Assert.assertEquals(value,"true");
        Assert.assertEquals(value2,"lisi");
    }
}
