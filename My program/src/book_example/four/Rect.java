package book_example.four;

/**
 * @ClassName Rect
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/14
 **/

public class Rect {
    double width,height,area;
    void setWidth(double width)
    {
        if(width>0)
        {this.width = width;}
    }
    void setHeight(double height)
    {
        if (height>0)
        {this.height = height;}
    }
    double getWidth(){
        return width;
    }

    double getHeight()
    {
        return height;
    }

    double getArea()
    {
        return area;
    }
}
