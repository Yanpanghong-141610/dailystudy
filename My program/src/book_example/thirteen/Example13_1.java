package book_example.thirteen;

/**
 * @ClassName Example13_1
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/11
 **/

public class Example13_1 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        //使用限定符号"?"限定实现接口
        Cone<? extends Computable> cone = new Cone<Circle>(circle);
        cone.setHeight(16);
        System.out.println(cone.computerVolume());

        Rect rect = new Rect(15,23);
        cone = new Cone<Rect>(rect);
        cone.setHeight(98);
        System.out.println(cone.computerVolume());

        Cone<Rect> coneRect = new Cone<Rect>(rect);
        coneRect.setHeight(198);
        System.out.println(coneRect.computerVolume());

        Cone<?>coneCircle = new Cone<Circle>(circle);
        coneCircle.setHeight(100);
        System.out.println(coneCircle.computerVolume());
    }
}
