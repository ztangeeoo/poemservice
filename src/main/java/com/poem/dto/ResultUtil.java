package com.poem.dto;

public class ResultUtil {
    private static final String MSG_SUCCESS = "Request successful!";

    private ResultUtil() {
    }

    public static Result success() {
        return success(null);
    }

    public static Result success(Object o) {
        Result r = new Result();
        r.setErrorCode(0);
        r.setErrorMessage(MSG_SUCCESS);
        if (null == o) {
            r.setData(new Object());
        } else {
            r.setData(o);
        }

        return r;
    }

    public static Result fail(Integer errorCode, String errorMessage) {
        Result r = new Result();
        r.setErrorCode(errorCode);
        r.setErrorMessage(errorMessage);
        r.setData(new Object());

        return r;
    }

}
