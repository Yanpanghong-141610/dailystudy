package book_example.thirteen;

/**
 * @ClassName Rect
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/11
 **/

public class Rect implements Computable {
    double sideA, sideB,area;
    Rect(double a ,double b)
    {
        sideA = a;
        sideB = b;
    }
    public String toString()
    {
        area = sideA * sideB;
        return ""+area;
    }
}
