package me.yui.market.coupon.status;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BatchStatus implements IStatus {


    INVALID_PARAM(20001, "invalid parameter,%s");


    private int code;
    private String msg;

    @Override
    public String getStatus() {
        return name();
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
