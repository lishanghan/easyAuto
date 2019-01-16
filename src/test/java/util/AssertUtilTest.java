package util;

import com.haier.enums.AssertTypeEnum;
import com.haier.util.AssertUtil;
import com.haier.util.JSONUtil;
import org.testng.annotations.Test;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/9/5 17:10
 */
public class AssertUtilTest {
    @Test
    public void isMatchTest(){
        String expected="{\"RSP_BODY\":{},\"TRAN_SUCCESS\":true}";
        String actual="{\"RSP_BODY\":{},\"RSP_HEAD\":{\"TRAN_SUCCESS\":true}}";
        AssertUtil.isMatch(JSONUtil.str2JSONObj(actual),JSONUtil.str2JSONObj(expected));
    }
    @Test
    public void superAssertTest(){
        String expected="{\"RSP_BODY\":{}}";
        String actual="{\"RSP_BODY\":{},\"RSP_HEAD\":{\"TRAN_SUCCESS\":true}}";
        AssertUtil.supperAssert(AssertTypeEnum.KEY_VALUE.getId(),expected,actual,1);
    }
}
