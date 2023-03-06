package me.yui.market.status;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ConstraintStatus implements IStatus{


    BLACK_USER_LIST_CONSTRAINT_ERROR(30001, "CONSTRAINT BY BLACK USER LIST"),
    WHITE_STORE_LIST_CONSTRAINT_ERROR(30002, "CONSTRAINT BY WHITE STORE LIST");

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
