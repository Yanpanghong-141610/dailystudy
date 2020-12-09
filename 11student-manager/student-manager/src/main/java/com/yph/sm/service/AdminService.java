package com.yph.sm.service;

import com.yph.sm.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description Admin业务逻辑接口
 * @Author YPH
 * @Date 2020/11/14
 **/
public interface AdminService {
    /**
     * 管理员登录
     *
     * @param account:账号
     * @param password:密码
     * @return ResultEntity:返回结果
     */

    ResultEntity adminLogin(String account,String password);
}
