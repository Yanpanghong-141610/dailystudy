package com.yanpanghong.study.week4;

/**
 * @ClassName MarkEmployee
 * @Description TODO
 * @Author YPH
 * @Date 2020/10/26
 * @description: 市场部员工类
 **/

public class MarkEmployee extends BaseEmployee {
    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGH_SALARY = 3000;
    private static final int LOWER_SALARY = 1000;

    public MarkEmployee(String id){
        this.id = id;
    }

    public MarkEmployee(){

    }

    @Override
    public void print() {
        super.print();
        System.out.println("This is a MarketEmployee class");
    }

    @Override
    public int getSalary() {
        if(ADMIN.equals(this.id)){
            return HIGH_SALARY;
        }else {
            return LOWER_SALARY;
        }
    }
}
