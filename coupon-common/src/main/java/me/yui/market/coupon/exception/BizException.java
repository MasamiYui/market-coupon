package me.yui.market.coupon.exception;

import lombok.Data;
import me.yui.market.coupon.status.BizStatus;
import me.yui.market.coupon.status.IStatus;

@Data
public class BizException extends RuntimeException {

    private int bizCode;

    private String bizMessage;

    public BizException(IStatus status, Throwable t) {
        this(status.getCode(), status.getMsg(), t);
    }

    public BizException(IStatus status, Object... contexts) {
        super(String.format(status.getMsg(), contexts));
        this.bizCode = status.getCode();
        this.bizMessage = String.format(status.getMsg(), contexts);
    }

    public BizException(String msg) {
        super(msg);
        this.bizCode = BizStatus.FAILED.getCode();
        this.bizMessage = BizStatus.FAILED.getMsg();
    }

    public BizException(int code, String msg, Throwable t) {
        super(code + "/" + msg, t);
    }
}
