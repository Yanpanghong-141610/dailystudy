package book_example.four;

/**
 * @ClassName Example4_2
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/14
 **/


public class Example4_2 {
    public enum PersonName{
        唐僧,悟空,八戒,沙僧
    }
    static public class XiyoujiRenwu{
        PersonName name;
        float height,weight;
        String head;
        void speak(String s){
            if(name == PersonName.八戒){
                head = "美男头";
            }
            else if(name == PersonName.悟空){
                head = "美女头";
            }
            System.out.println(s);
        }
    }
    public static void main(String args[]){
        XiyoujiRenwu zhubajie = null,sunwukong  = null;
        zhubajie = new XiyoujiRenwu();
        sunwukong = new XiyoujiRenwu();
        zhubajie.name = PersonName.八戒;
        zhubajie.height = 1.83f;
        zhubajie.weight = 86f;
        zhubajie.head ="猪头";
        sunwukong.name = PersonName.悟空;
        sunwukong.height = 1.66f;
        sunwukong.weight = 1000f;
        sunwukong.head = "猴头";
        System.out.println(zhubajie.name + "的身高:" + zhubajie.height);
        System.out.println(zhubajie.name + "的体重:" + zhubajie.weight);
        System.out.println(zhubajie.name + "的头:" + zhubajie.head);
        System.out.println(sunwukong.name + "的身高:" + sunwukong.height);
        System.out.println(sunwukong.name + "的体重:" + sunwukong.weight);
        System.out.println(sunwukong.name + "的头:" + sunwukong.head);
        zhubajie.speak(zhubajie.name + "我想娶媳妇");
        System.out.println(zhubajie.name + "现在的头：" + zhubajie.head);
        sunwukong.speak(sunwukong.name + "我重" + sunwukong.weight + "公斤，想骗八戒背我");
        System.out.println(sunwukong.name + "现在的头:" + sunwukong.head);
    }
}