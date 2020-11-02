package day14;


import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @ClassName Person
 * @Description TODO
 * @Author WL
 * @Date 2020/11/2
 **/
@Data
@ToString
@Accessors(chain = true)
public class  Person {
    private String name;
    private Integer age;
    private String gander;
}
