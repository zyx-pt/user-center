package com.zyx.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 用户注册请求体
 * @ClassName com.zyx.usercenter.model.domain.request.UserRegisterRequest
 * @Author yxzheng
 * @Date 2022/6/10 14:44
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 4636806814047817206L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;
}
