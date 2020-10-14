package book_example.four;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/14
 **/

public class Circle {
    double radius;
    Circle(double r)
    {radius=r;}
    double getArea()
    {return 3.14*radius*radius;}
    void setRadius(double r)
    {radius=r;}
    double getRadius()
    {return radius;}
}
