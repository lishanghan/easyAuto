package com.haier.util;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2019/1/3 15:52
 */
public class GenerateUtil {

    public static String generateChineseName() {
        return getFirstName() + getChinese();
    }

    //获取姓氏
    private static String getFirstName() {
        String[] surname = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨"
                , "朱", "秦", "尤", "许", "何", "吕", "施", "张", "孔", "曹", "严", "金", "魏", "陶", "姜", "谢", "邹"
                , "窦", "苏", "潘", "葛", "奚", "范", "彭", "鲁", "韦", "昌", "马", "苗", "方", "俞", "任", "袁", "柳"
                , "鲍", "唐", "岑", "薛", "雷", "贺", "倪", "汤", "罗", "毕", "常", "于", "傅", "余", "卜", "孟", "黄"
                , "穆", "萧", "尹", "姚", "邵", "湛", "汪", "毛", "臧", "戴", "谈", "宋", "茅", "庞", "熊", "纪", "舒"
                , "项", "祝", "董", "梁", "杜", "阮", "贾", "江", "颜", "郭", "梅", "林", "钟", "徐", "邱", "骆", "高"
                , "夏", "蔡", "田", "樊", "胡", "霍", "万", "柯", "卢", "莫", "裘", "缪", "干", "丁", "邓", "程", "刘"
                , "詹", "龙", "卓", "乔", "翟", "谭", "尚", "瞿", "充", "慕", "习", "宦", "艾", "鱼", "向", "古", "易"
                , "廖", "欧", "冷", "司马", "上官", "欧阳", "夏侯", "诸葛", "东方", "尉迟", "淳于", "单于", "太叔", "公孙"
                , "仲孙", "轩辕", "令狐", "钟离", "宇文", "长孙", "慕容", "闾丘", "司徒", "司空", "南门", "呼延", "颛孙"
                , "东郭", "左丘", "东门", "西门", "太史", "仲长", "叔孙", "贺兰", "独孤", "王孙"};
        int firstNameIndex = RandomUtils.nextInt(0, surname.length);
        return Arrays.asList(surname).get(firstNameIndex);
    }

    //获取名字
    private static String getChinese() {
        String girlsStr = "秀、娟、英、慧、巧、美、娜、静、淑、惠、珠、翠、雅、芝、玉、萍、红、娥、玲、" +
                "芬、芳、燕、彩、春、兰、凤、洁、梅、琳、素、云、雪、荣、爱、" +
                "霞、香、月、莺、媛、艳、佳、琼、珍、贞、莉、娣、清、璐、" +
                "娅、琦、晶、妍、茜、秋、珊、莎、黛、青、倩、婷、姣、婉、娴、瑾、颖、露、瑶、" +
                "怡、婵、蓓、仪、荷、丹、蓉、君、琴、蕊、薇、菁、梦、岚、苑、婕、馨、" +
                "瑗、琰、韵、融、园、咏、卿、澜、纯、毓、悦、昭、冰、琬、茗、羽、希、" +
                "欣、飘、滢、馥、筠、柔、霭、凝、晓、霄、枫、芸、菲、寒、伊、亚、" +
                "姬、影、思、丽、宁、萌";
        String boysStr = "瑞、佳、贞、鸿、焕、风、朗、浩、亮、政、谦、震、振、诚、敬、彪、" +
                "贵、龙、全、胜、学、祥、才、发、武、新、亨、奇、滕、炅、炜、" +
                "伟、刚、勇、毅、俊、峰、强、平、东、文、辉、之、殿、" +
                "利、清、飞、彬、顺、信、子、杰、涛、昌、成、康、星、翰、晸、博、坚、和、" +
                "若、鸣、斌、梁、栋、维、克、伦、翔、旭、鹏、泽、朗、伯、昮、晋、晟、" +
                "诚、敬、震、振、思、群、豪、心、邦、承、宏、旲、旻、昊、" +
                "光、天、达、安、中、茂、进、林、坚、博、盛、振、挺、掣、" +
                "明、永、健、世、广、志、义、兴、良、海、仁、波、宁、志、忠、思、" +
                "绍、功、松、善、庆、磊、友、裕、哲、江、超、炎、德、彰、征、律、" +
                "晨、辰、士、煜、煊、波、贵、生、龙、元、全、国、" +
                "胜、祥、哲、亦" +
                "康、星、光、天、达、安、岩、中、茂、进、林";


        //名字长度,1-2个字
        int len = RandomUtils.nextInt(1, 3);
        //0为女,1为男
        int gender = RandomUtils.nextInt(0, 2);

        String[] nameChar;
        if (gender == 0) {
            nameChar = girlsStr.split("、");
        } else {
            nameChar = boysStr.split("、");
        }
        List<String> nameCharList = Arrays.asList(nameChar);

        if (len == 1) {
            return nameCharList.get(RandomUtils.nextInt(0, nameCharList.size()));
        } else {
            return nameCharList.get(RandomUtils.nextInt(0, nameCharList.size())) + nameCharList.get(RandomUtils.nextInt(0, nameCharList.size()));
        }
    }

    public static String generateID() {
        StringBuilder generater = new StringBuilder();
        generater.append(randomAreaCode());
        generater.append(generateBirthday());
        generater.append(randomCode());
        generater.append(calcTrailingNumber(generater.toString().toCharArray()));
        return generater.toString();
    }

    private static int randomAreaCode() {
        int index = (int) (Math.random() * AreaCode.areaCode.size());
        Collection<Integer> values = AreaCode.areaCode.values();
        Iterator<Integer> it = values.iterator();
        int i = 0;
        int code = 0;
        while (i < index && it.hasNext()) {
            i++;
            code = it.next();
        }
        return code;
    }

    /**
     * 随机一个生日,此生日大于18岁,小于120岁,格式:yyyyMMdd
     */
    public static String generateBirthday() {
        //回到18年前
        Date eighteenYearsAgo = DateUtils.addYears(new Date(), -18);
        //18年之前还活了多少天(最多不超过102*365天,即此人不超过120岁)
        int live = RandomUtils.nextInt(1, (120 - 18) * 365);
        Date birthday = DateUtils.addDays(eighteenYearsAgo, 0 - live);
        return new SimpleDateFormat("yyyyMMdd").format(birthday);
    }

    /*
     * <p>18位身份证验证</p>
     * 根据〖中华人民共和国国家标准 GB 11643-1999〗中有关公民身份号码的规定，公民身份号码是特征组合码，由十七位数字本体码和一位数字校验码组成。
     * 排列顺序从左至右依次为：六位数字地址码，八位数字出生日期码，三位数字顺序码和一位数字校验码。
     * 第十八位数字(校验码)的计算方法为：
     * 1.将前面的身份证号码17位数分别乘以不同的系数。从第一位到第十七位的系数分别为：7 9 10 5 8 4 2 1 6 3 7 9 10 5 8 4 2
     * 2.将这17位数字和系数相乘的结果相加。
     * 3.用加出来和除以11，看余数是多少？
     * 4.余数只可能有0 1 2 3 4 5 6 7 8 9 10这11个数字。其分别对应的最后一位身份证的号码为1 0 X 9 8 7 6 5 4 3 2。
     * 5.通过上面得知如果余数是2，就会在身份证的第18位数字上出现罗马数字的Ⅹ。如果余数是10，身份证的最后一位号码就是2。
     */
    public static char calcTrailingNumber(char[] chars) {
        if (chars.length < 17) {
            return ' ';
        }
        int[] c = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] r = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int[] n = new int[17];
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(chars[i] + "");
        }
        for (int i = 0; i < n.length; i++) {
            result += c[i] * n[i];
        }
        return r[result % 11];
    }

    public static String randomCode() {
        int code = (int) (Math.random() * 1000);
        if (code < 10) {
            return "00" + code;
        } else if (code < 100) {
            return "0" + code;
        } else {
            return "" + code;
        }
    }
}
