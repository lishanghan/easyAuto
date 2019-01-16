package com.haier.enums;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/11/12 15:56
 */
public enum GenEnum {
    BRACE_LEFT("{\n", ""),
    BRACE_RIGHT("}\n", ""),

    PACKAGE("package com.haier.testng.base;\n", "包名"),
    IMPORT("import com.haier.anno.SKey;\n" +
            "import com.haier.po.HryTest;\n" +
            "import com.haier.testng.base.Base;\n" +
            "import com.haier.util.HryHttpClientUtil;\n" +
            "import org.testng.annotations.Parameters;\n" +
            "import org.testng.annotations.Test;\n" +
            "\n" +
            "import static com.haier.util.AssertUtil.supperAssert;\n\n", "base类导包"),
    CLASS_ANNOTATION("@SKey(\"" + GenReplaceKWEnum.SKEY.getSample() + "\")\n", "@SKey"),
    CLASS_NAME("public class " + GenReplaceKWEnum.CLASS_NAME.getSample() + " extends Base\n", "测试类名"),
    CONSTRUCTOR_ANNOTATION("    @Parameters({\"serviceId\", \"envId\", \"caseDesigner\", \"i_c\", \"i_c_zdy\", \"testingId\"})\n","测试类构造器注解"),
    CONSTRUCTOR("    public "+GenReplaceKWEnum.CLASS_NAME.getSample()+"(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {\n" +
            "        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);\n" +
            "    }\n", "测试类构造器"),
    METHOD_ANNOTATION("    @Test(testName = \""+GenReplaceKWEnum.URI.getSample()+"\", dataProvider = \""+GenReplaceKWEnum.PROVIDER.getSample()+"\", description = \""+GenReplaceKWEnum.DESC.getSample()+"\")\n", "测试类中方法注解"),
    METHOD("    public void "+GenReplaceKWEnum.METHOD_NAME.getSample()+"(HryTest test) {\n" +
            "        String actual = HryHttpClientUtil.send(test, this);\n" +
            "        supperAssert(actual, test);\n" +
            "    }\n\n", "测试类方法"),;

    private String code;
    private String desc;

    GenEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
