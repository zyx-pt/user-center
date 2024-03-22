package com.zyx.usercenter.exception;

import com.zyx.usercenter.common.ErrorCode;

/**
 * @Description:
 * @ClassName com.zyx.usercenter.exception.BusinessException
 * @Author yxzheng
 * @Date 2022/6/30 17:18
 */
public class BusinessException extends RuntimeException{

    private final int code;

    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        this(errorCode.getMessage(), errorCode.getCode(), errorCode.getDescription());
    }

    public BusinessException(ErrorCode errorCode, String description) {
        this(errorCode.getMessage(), errorCode.getCode(), description);
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
