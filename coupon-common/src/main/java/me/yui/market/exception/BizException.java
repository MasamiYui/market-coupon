package me.yui.market.exception;

import me.yui.market.status.BizStatus;
import me.yui.market.status.IStatus;

public class BizException extends RuntimeException{

    private int bizCode;

    private String bizMsg;

    public BizException(IStatus status, Throwable t){
        this(status.getCode(), status.getMsg(), t);
    }

    public BizException(IStatus status, Object ... contexts){
        super(String.format(status.getMsg(), contexts));
        this.bizCode = status.getCode();
        this.bizMsg = String.format(status.getMsg(), contexts);
    }

    public BizException(String msg){
        super(msg);
        this.bizCode = BizStatus.BIZ_FAIL.getCode();
        this.bizMsg = BizStatus.BIZ_FAIL.getMsg();
    }
    public BizException(int code, String msg, Throwable t){
        super(code + "/" + msg, t);
    }
}
