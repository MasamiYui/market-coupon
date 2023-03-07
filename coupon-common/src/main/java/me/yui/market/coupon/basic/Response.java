package me.yui.market.coupon.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import me.yui.market.coupon.exception.BizException;
import me.yui.market.coupon.status.BizStatus;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Optional;

@Data
public class Response<T> implements Serializable {

    @JsonProperty("data")
    private T data;

    @JsonProperty("success")
    private boolean success = false;

    @JsonProperty("code")
    private int code;

    @JsonProperty("message")
    private String message;

    @JsonProperty("traceId")
    private String traceId;

    @JsonProperty("cause")
    private String cause;

    public Response() {
        super();
    }

    public Response(T data) {
        this();
        this.data = data;
    }

    public static <T> Response<T> success() {
        Response<T> response = new Response<>(null);
        response.setSuccess(true);
        response.setCode(BizStatus.SUCCESS.getCode());
        response.setMessage(BizStatus.SUCCESS.getMsg());
        return response;
    }

    public static <T> Response<T> of(T data) {
        Response<T> response = new Response<>(data);
        response.setSuccess(true);
        response.setCode(BizStatus.SUCCESS.getCode());
        response.setMessage(BizStatus.SUCCESS.getMsg());
        return response;
    }

    public static <T> Response<T> of(T data, String message) {
        Response<T> response = new Response<>(data);
        response.setSuccess(true);
        response.setCode(BizStatus.SUCCESS.getCode());
        response.setMessage(BizStatus.SUCCESS.getMsg());
        return response;
    }

    public static <T> Response<T> fail(BizStatus BizStatus) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setCode(BizStatus.getCode());
        response.setMessage(BizStatus.getMsg() + ", traceId: " + response.getTraceId());

        return response;
    }

    public static <T> Response<T> fail(T data, BizStatus BizStatus) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setCode(BizStatus.getCode());
        response.setMessage(BizStatus.getMsg() + ", traceId: " + response.getTraceId());
        response.setData(data);
        return response;
    }


    public static <T> Response<T> fail(Throwable th) {
        Response<T> response = new Response<>();

        if (th instanceof BizException) {
            BizException bizException = (BizException) th;
            response.setCode(bizException.getBizCode());
            response.setMessage(bizException.getBizMessage() + ", traceId: " + response.getTraceId());
            response.setCause("业务异常");
        } else if (th instanceof RuntimeException) {
            RuntimeException runtimeException = (RuntimeException) th;
            response.setCode(BizStatus.FAILED.getCode());
            response.setMessage(th.getMessage() + "\ntraceId:" + response.getTraceId());
            response.setCause(Optional.ofNullable(runtimeException.getMessage()).orElse(runtimeException.getStackTrace()[0].toString()));
        } else {
            response.setSuccess(false);
            response.setCode(BizStatus.FAILED.getCode());
            response.setMessage(BizStatus.FAILED.getMsg() + ", traceId: " + response.getTraceId());
            response.setCause(th.getMessage());
        }
        return response;
    }

    public static <T> Response<T> fail(BizStatus BizStatus, Throwable th) {
        Response<T> response = new Response<>();
        if (th instanceof BizException) {
            BizException bizException = (BizException) th;
            response.setCode(bizException.getBizCode());
            response.setMessage(bizException.getBizMessage());
            response.setCause(th.getMessage());
        } else if (th instanceof RuntimeException) {
            RuntimeException runtimeException = (RuntimeException) th;
            response.setCode(BizStatus.FAILED.getCode());
            response.setMessage(BizStatus.FAILED.getMsg() + ", traceId: " + response.getTraceId());
            response.setCause(Optional.ofNullable(runtimeException.getMessage()).orElse(runtimeException.getStackTrace()[0].toString()));
        } else {
            response.setSuccess(false);
            response.setCode(BizStatus.getCode());
            response.setMessage(BizStatus.getMsg() + ", traceId: " + response.getTraceId());
            response.setCause(th.getMessage());
        }
        return response;
    }

    public static <T> Response<T> fail(BizStatus BizStatus, String cause) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setCode(BizStatus.getCode());
        response.setMessage(BizStatus.getMsg() + (StringUtils.isNotBlank(cause) ? cause : "") + ", traceId: " + response.getTraceId());
        response.setCause(cause);
        return response;
    }

    public static <T> Response<T> fail(BizStatus BizStatus, String cause, Object... contexts) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setCode(BizStatus.getCode());
        response.setMessage(String.format(BizStatus.getMsg(), contexts) + ", traceId: " + response.getTraceId());
        response.setCause(cause);
        return response;
    }

}
