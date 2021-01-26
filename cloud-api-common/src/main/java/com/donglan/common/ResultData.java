package com.donglan.common;

import java.io.Serializable;

import lombok.Data;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-25 20:03:07
 */
@Data
public class ResultData<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    private ResultData() {

    }
    private ResultData(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> ResultData success(T data) {
        return new ResultData(200, "success", data);
    }

    public static <T> ResultData success(String message, T data) {
        return new ResultData(200, message, data);
    }

    public static <T> ResultData success() {
        return new ResultData(200, "success", null);
    }

    public static <T> ResultData fail() {
        return new ResultData(500, "fail", null);
    }

    public static <T> ResultData fail(String message) {
        return new ResultData(500, message, null);
    }

}
