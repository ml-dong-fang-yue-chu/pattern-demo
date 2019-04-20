package com.ml.pattern.excepion;

/**
 * @ClassName MLException
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 12:03
 * @Version 1.0
 */
public class MLException extends RuntimeException{

    private String message;

    private String code;

    public MLException(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public MLException() {
        super();
    }

    public MLException(String message) {
        super(message);
    }

    public MLException(String message, Throwable cause) {
        super(message, cause);
    }

    public MLException(Throwable cause) {
        super(cause);
    }

    protected MLException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
