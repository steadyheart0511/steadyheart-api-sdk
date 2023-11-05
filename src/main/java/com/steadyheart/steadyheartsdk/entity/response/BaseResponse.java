package com.steadyheart.steadyheartsdk.entity.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.steadyheart.steadyheartsdk.entity.enums.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lts
 * @create 2023-11-03 22:22
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    private String message;

    public BaseResponse() {
    }

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }


    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
