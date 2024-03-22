package com.zyx.usercenter.utils;

import com.zyx.usercenter.common.BaseResponse;
import com.zyx.usercenter.common.ErrorCode;

/**
 * @Description: 返回工具类
 * @ClassName com.zyx.usercenter.common.ResultUtil
 * @Author yxzheng
 * @Date 2022/6/30 17:05
 */
public class ResultUtils {

    public static <T> BaseResponse<T> success(T data){
       return new BaseResponse<>(0, data, "ok");
    }

    public static  BaseResponse error(int code, String message, String description){
        return new BaseResponse(code, null, message, description);
    }

    public static  BaseResponse error(ErrorCode errorCode){
        return new BaseResponse(errorCode);
    }

    public static  BaseResponse error(ErrorCode errorCode, String description){
        return new BaseResponse(errorCode.getCode(), null, errorCode.getMessage(), description);
    }

    public static  BaseResponse error(ErrorCode errorCode, String message, String description){
        return new BaseResponse(errorCode.getCode(), null, message, description);
    }

}
