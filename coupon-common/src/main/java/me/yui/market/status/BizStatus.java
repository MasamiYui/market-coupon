package me.yui.market.status;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BizStatus implements IStatus{


    SUCCESS(10000, "SUCCESS"),
    BIZ_FAIL(99999, "SERVICE BUSY");

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
