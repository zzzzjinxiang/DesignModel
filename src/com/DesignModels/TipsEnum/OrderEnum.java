package com.DesignModels.TipsEnum;

public enum OrderEnum {
    ORDERED(1,"预定"),
    FREE(0,"空闲"),
    SETTLEIN(2,"入住"),
    EXITROOM(3,"退房"),
    ERROR_ORDER(-1,"房源不可用"),
    ;

    private String msg;
    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private OrderEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
