package day6;

import java.util.ArrayList;

/**
 *
 * @Author YPH
 * @Date 2020/10/25
 * 模拟接待员接待用户，根据用户id，给用户分组。定义接口Filter:
 * 提供抽象方法filterUser(User u)定义用户类:
 * 属性:用户类型，用户id
 * 提供基本的构造方法和get方法，set方法 定义接待员类
 * 属性:接口Filter 提供基本的构造方法和get方法，set方法
 * 成员方法:接待用户方法，设置用户类型
 * 测试类:
 * 初始化50个User对象,id为1-50.创建三个接待员对象
 * 第一个接待员，设置接待规则，将10-19号用户类型设置为v1
 * 第二个接待员，设置接待规则，将20-29号用户类型设置为v2
 **/

public class ReceptTest {
    private static final int V1 = 10 ;
    private static final int V2 = 20 ;
    private static final int V3 = 30 ;
    private static final int MAX = 50 ;

    public static void main(String[] args) {
        ArrayList<User> uList = new ArrayList<User>();
        for (int i=1;i<=MAX;i++){
            uList.add(new User(i));
        }
        System.out.println("未分组:");
        System.out.println(uList);
        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();

        //内部匿名类，更好的方式是使用Lambda表达式
        r1.setF(new Filter(){
            @Override
            public void filterUser(User u){
                //不推荐使用常量（魔法值）直接比较
            if(u.getId()>=V1 && u.getId()<V2){
                u.setType("v1");
            }
            }
        });
        //这样就是Lambda表达式的写法
        r2.setF(u ->{
            if(u.getId() >=V2 && u.getId()<V3){
                u.setType("v2");
            }
        });
        for (User user : uList){
            r1.recept(user);
            r2.recept(user);
            r3.recept(user);
        }
        System.out.println("已分组");
        for (int i=0;i<uList.size();i++){
            User user = uList.get(i);
            //每9个换行
            if(i%9==0){
                System.out.println();
            }
            System.out.println(user + " ");
        }
    }
}

class Reception{
    Filter f;
    public Filter getF(){
        return f;
    }
    public void setF(Filter f){
        this.f = f;
    }

    public void recept(User u){
        if (u.getType()!=null){
            return;
        }
        if (f != null){
            f.filterUser(u);
        }else {
            u.setType("A");
        }
    }
}

class User{
    private String type;
    private final int id;

    public User(int id){
        this.id = id;
    }
    public int getId(){
        return  id;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    @Override
    public  String toString(){
        return id+"-"+type;
    }
}

interface Filter{
    /**
     *  过滤用户
     * @param u 用户对象
     */

    void filterUser(User u);
}