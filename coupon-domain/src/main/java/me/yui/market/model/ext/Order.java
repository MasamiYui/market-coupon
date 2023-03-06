package me.yui.market.model.ext;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String orderId;

    private Date createTime;

    private Date payTime;

    private Date refundTime;
}
