package com.zyx.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyx.usercenter.model.domain.User;
import com.zyx.usercenter.model.domain.request.UserRegisterRequest;

import javax.servlet.http.HttpServletRequest;

/**
* @author 13672
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2022-04-25 19:47:52
*/
public interface UserService extends IService<User> {

    /**
     * @Description: 用户注册
     * @Author: yxzheng
     * @Date 2022/4/25 20:02
     * @param userRegisterRequest
     * @return long
     */
    long userRegister(UserRegisterRequest userRegisterRequest);

    /**
     * @Description: 用户登录
     * @Author: yxzheng
     * @Date 2022/4/26 13:51
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param request
     * @return com.zyx.usercenter.model.domain.User 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * @Description: 用户脱敏
     * @Author: yxzheng
     * @Date 2022/4/26 14:48
     * @param originUser
     * @return com.zyx.usercenter.model.domain.User
     */
    User getSafetyUser(User originUser);

    /**
     * @Description: 用户注销
     * @Author: yxzheng
     * @Date 2022/4/26 14:49
     * @param request
     * @return int
     */
    int userLogout(HttpServletRequest request);

}
