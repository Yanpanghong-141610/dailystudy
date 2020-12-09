package com.yph.sm.entity;

import lombok.*;

/**
 * @ClassName Clazz
 * @Description
 * @Author YPH
 * @Date 2020/11/21
 **/

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Clazz {

    private Integer id;
    private Integer departmentId;
    private String className;

//    public void setId(Integer id){
//        this.id = id;
//    }
//    public Integer getId(){
//        return id;
//    }
//
//    public void setDepartmentId(Integer departmentId){
//        this.departmentId = departmentId;
//    }
//
//    public Integer getDepartmentId(){
//        return departmentId;
//    }
//
//    public void setClassName(String className){
//        this.className = className;
//    }
//    public String getClassName(){
//        return className;
//    }

    @Override
    public String toString(){
        return className;
    }

}
