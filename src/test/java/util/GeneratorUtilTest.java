package util;

import com.haier.util.GenerateUtil;
import org.testng.annotations.Test;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2019/1/3 16:06
 */
public class GeneratorUtilTest {
    @Test
    public void generateChineseNameTest() {
        for (int i = 0; i < 1; i++) {
            System.out.println(GenerateUtil.generateChineseName());
        }

        for (int i = 0; i < 1; i++) {
            System.out.println(GenerateUtil.generateID());
        }
    }
}
