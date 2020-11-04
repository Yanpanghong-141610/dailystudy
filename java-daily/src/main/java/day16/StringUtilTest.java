package day16;

/**
 * @ClassName StringUtilTest
 * @Description TODO
 * @Author YPH
 * @Date 2020/11/4
 **/
public class StringUtilTest {
    public static void main(String[] args) {
        String s = "qwda3e12qwdsa3ee";
        String a = "a";
        String email = "qnenbu@qq.com";
        System.out.println("字符串s为：" + s);
        System.out.println("-------------");
        System.out.println("判断字符是否为空：" +  StringUtil.isEmpty(s));
        System.out.println("-------------");
        System.out.println("隐藏邮件地址前缀:" + StringUtil.getHideEmailPrefix(email));
        System.out.println("-------------");
        System.out.println("截取字符串s左侧指定长度为4的字符串:" + StringUtil.left(s, 4));
        System.out.println("-------------");
        System.out.println("获取子符串a在s中出现的次数:" + StringUtil.countSubStr(s,a));
    }
}
