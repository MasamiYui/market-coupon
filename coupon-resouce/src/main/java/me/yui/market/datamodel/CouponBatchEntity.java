package me.yui.market.datamodel;

import lombok.Data;

import java.util.Date;

@Data
public class CouponBatchEntity {

    private Long id;

    private Long batchId;

    private String bizLine;

    private String bizType;

    private String batchName;

    private String couponName;

    private String stockId;

    private String budgetId;

    private Date deliverStartTime;

    private Date deliverEndTime;

    private String promotionType;

    private Long amount;

    private Long discount;

    private String status;

    private String createUser;

    private Date createTime;

    private Date modifyTime;
}
