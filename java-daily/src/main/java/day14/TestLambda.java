package day14;

import org.junit.Test;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @ClassName TestLambda
 * @Description Lambda 表达式的书写
 * @Author WL
 * @Date 2020/11/2
 **/
public class TestLambda {
    private List<Person> getPersonList() {
        Person p1 = new Person().setName("liu").setAge(22).setGander("male");
        Person p2 = new Person().setName("zhao").setAge(21).setGander("male");
        Person p3 = new Person().setName("li").setAge(18).setGander("female");
        Person p4 = new Person().setName("wang").setAge(21).setGander("male");
        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        return list;
    }

    /**
     * 使用forEach方法，直接通过一行代码即可完成对集合的遍历
     */
    public void test1() {
        List<Person> list = getPersonList();
        list.forEach(person -> System.out.println(person.toString()));
    }
    @Test
    public void test2() {
        List<Person> list = getPersonList();
        Consumer<Person> changeAge = e -> e.setAge(e.getAge() + 3);
        list.forEach(changeAge);
        //:: 表示方法引用，可以引用其他方法
        list.forEach(System.out::println);
    }
    @Test
    /**
     * filter对集合进行过滤
     * filter 可以根据传入的Predicate对象，对集合进行过滤操作，predicate实质就是描述了过滤的条件
     */
    public void test3() {
        List<Person> list = getPersonList();
        list.stream().filter(e -> e.getAge() > 20)
                .forEach(e -> System.out.println(e.toString()));
    }

    /**
     * 1.可以通过多次调用filter通过传入不同的Predicate对象来进行过滤
     * 2. 也可以通过Predicate对象的and or 方法，对多个Predicate 对象进行且或操作
     */
    @Test
    public void test4() {
        List<Person> list = getPersonList();
        Predicate<Person> ageFilter = e -> e.getAge() > 20;
        Predicate<Person> ganderFilter = e -> e.getGander().equals("male");

        //多条件过滤
        list.stream().filter(ageFilter)
                .filter(ganderFilter)
                .forEach(e -> System.out.println(e.toString()));
        System.out.println("------------------");
        //Predicate : and or
        list.stream().filter(ageFilter.and(ganderFilter))
                .forEach(e -> System.out.println(e.toString()));
    }

    /**
     * limit 限制结果集的数据量
     * limit 可以控制结果集返回的数据条数：返回三条数据，返回年龄>20的前两条数据
     */
    @Test
    public void test5() {
        List<Person> list = getPersonList();
        list.stream().limit(3).forEach(e -> System.out.println(e.toString()));

        System.out.println("------------------------");
        list.stream().limit(2).filter(e -> e.getAge() > 20)
                .forEach(e -> System.out.println(e.toString()));
    }
    /**
     * sorted 排序
     * 通过sorted，可以按自定义的规则，对数据进行排序，可以用两种写法
     * 分别按年龄和姓名排序
     */
    @Test
    public void test6() {
        List<Person> list = getPersonList();
        //年龄排序
        list.stream().sorted((p1,p2) -> (p1.getAge() - p2.getAge()))
                .forEach(e -> System.out.println(e.toString()));
        //姓名排序
        System.out.println("--------------------");
        list.stream().sorted(Comparator.comparing(Person::getName))
                .forEach(e -> System.out.println(e.toString()));
    }
    /**
     * max min 获取结果中摸个最大最小的对象
     *  max min 可以按指定的条件，获取到最大、最小的对象，
     *  当集合里有多个满足条件的最大最小值时，只会返回一个对象。
     */
    @Test
    public void test7 () {
        List<Person> list = getPersonList();
        //如果 最大值最小值 对应的对象有多个 只会返回第一个
        Person oldest = list.stream().max(Comparator.comparing(Person::getAge)).get();
        System.out.println(oldest.toString());
    }
    /**
     * map 与 reduce 也是两个十分重要的方法
     * map：对集合中的每个元素进行遍历，并且可以对其进行操作，转化为其他对象，
     * 如将集合中的每个人的年龄增加3岁
     */
    @Test
    public void test8() {
        List<Person> list = getPersonList();
        //将 每人的年龄 + 3
        System.out.println("修改前：");
        list.forEach(e -> System.out.println(e.toString()));
        System.out.println("修改后：");
        list.stream().map(e -> e.setAge(e.getAge() + 3))
                .forEach(e -> System.out.println(e.toString()));
    }
    /**
     * reduce：也是对所有值进行操作，但它是将所有值，按照传入的处理逻辑，将结果处理合并为一个
     *
     * 如：将集合中的所有整数相加，并返回其总和
     */
    @Test
    public void test9() {
        //第一个参数是上次函数执行的返回值（也称为中间结果），第二个参数是stream中的元素，
        // 这个函数把这两个值相加，得到的和会被赋值给下次执行这个函数的第一个参数。
        //要注意的是：第一次执行的时候第一个参数的值是Stream的第一个元素，第二个参数是Stream的第二个元素
        //将所有人的年龄加起来 求和
        List<Integer> ages = Arrays.asList(2,3,5,4,7);
        int totalAge = ages.stream().reduce((sum,age) -> sum + age).get();
        System.out.println(totalAge);
        //带初始值的计算，如果list没有元素，即stream为null，则直接返回初始值
        int totalAge1 = ages.stream().reduce(0,(sum,age) -> sum + age);
        List<Integer> initList = new ArrayList<>();
        int initTotalAge = initList.stream().reduce(0,(sum,age)-> sum+age);
        System.out.println("totalAge1:" + totalAge + "initTotalAge:" + initTotalAge);
    }
    /**
     * collect方法以集合中的元素为基础，生成新的对象
     *  在实际中，我们经常会以集合中的元素为基础，取其中的数据，来生成新的结果集，
     *  例如 按照过滤条件，返回新的List，
     */
    @Test
    public void test10() {
        List<Person> list = getPersonList();
        //排序过滤等一系列操作之后的元素 放入新的list
        List<Person> filterList = list.stream().filter(e -> e.getAge() >20).collect(Collectors.toList());
        filterList.forEach(e -> System.out.println(e.toString()));

        //将 name 属性用" , "，连接拼接成一个字符串
        String nameStr = list.stream().map(Person::getName).collect(Collectors.joining(","));
        System.out.println(nameStr);
        //将name 放入到新的 set 集合中
        Set<String> nameSet = list.stream().map(person -> person.getName()).collect(Collectors.toSet());
        nameSet.forEach(e -> System.out.print(e + ","));

        System.out.println();
        System.out.println("map--------");
        Map<String,Person> personMap = list.stream().collect(Collectors.toMap(Person::getName,person -> person));
        personMap.forEach((key,val) -> System.out.println(key + ":" + val.toString()));
    }
    /**
     * summaryStatistics 计算集合元素的最大、最小、平均等值
     */
    @Test
    public void test11() {
        List<Integer> ages = Arrays.asList(2,5,3,4,7);
        IntSummaryStatistics statistics = ages.stream().mapToInt(e -> e).summaryStatistics();
        System.out.println("最大值: " + statistics.getMax());
        System.out.println("最小值: " + statistics.getMin());
        System.out.println("平均值: " + statistics.getAverage());
        System.out.println("总和: " + statistics.getSum());
        System.out.println("个数: " + statistics.getCount());

    }


}
