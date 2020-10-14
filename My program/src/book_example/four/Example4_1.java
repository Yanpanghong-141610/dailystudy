package book_example.four;

/**
 * @ClassName Example4_1
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/14
 **/

public class Example4_1 {


    public static void main(String args[])
    {
        XiyouRenwu zhubajie,sunwukong;//声明对象
        zhubajie = new XiyouRenwu();//为对象分配变量（使用new 和默认的构造方法）
        sunwukong = new XiyouRenwu();
    }
}
  class XiyouRenwu{
    float height,weight;
    String head,ear;
    void speak(String s){
        System.out.println(s);
    }

  }
