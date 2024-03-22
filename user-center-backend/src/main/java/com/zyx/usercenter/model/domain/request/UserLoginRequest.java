package com.zyx.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 用户登录请求体
 * @ClassName com.zyx.usercenter.model.domain.request.UserLoginRequest
 * @Author yxzheng
 * @Date 2022/6/10 14:44
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 1763273487417816666L;

    private String userAccount;

    private String userPassword;
}
