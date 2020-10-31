package day12;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

/**
 * @ClassName Student
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/31
 **/
public class Student {
    private String name;
    private Integer age;
    private Integer height;
    private Integer MAX_HEIGHT = 180;

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public int getStature() {
        if(this.height< MAX_HEIGHT)
        {
            return this.age;
        }
        return 0;
    }
    public void addList(List<Student> students) {

    }

    public int getAge() {
        if(this.age< 45)
        {
            return this.age;
        }
        return 0;
    }
}
