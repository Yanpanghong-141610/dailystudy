package com.yph.sm.entity;

import lombok.*;

/**
 * @ClassName Department
 * @Description 院系实体系
 * @Author YPH
 * @Date 2020/11/17
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class Department {

    private Integer id;
    private String departmentName;
    private String logo;

    @Override
    public String toString() {
        return this.departmentName;
    }

}