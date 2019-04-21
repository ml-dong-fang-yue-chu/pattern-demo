package com.ml.pattern.util;

/**
 * @ClassName ToString
 * @DESC 结果的基类
 * @Author ML
 * @Date 2019/4/20 10:49
 * @Version 1.0
 */
public class  MLBaseResult<T> extends ToString  {

    private static final long serialVersionUID = 4180485854497888770L;

    private boolean isSuccess;

    private String message;

    private String code;

    private T  date;

    public MLBaseResult(boolean isSuccess, String message, String code, T date) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.code = code;
        this.date = date;
    }

    public MLBaseResult() {
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
