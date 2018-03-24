package com.peng.exception;

public enum ResultEnum {
    UNKNOW_ERROR("未知错误", -1),
    SUCCESS("成功", 0),
    PRIMARY_SCHOOL("小学", 100),
    MIDDLE_SCHOOL("初中", 101),;

    private Integer code;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResultEnum(String msg, Integer code) {
        this.code = code;
        this.msg = msg;
    }
}
