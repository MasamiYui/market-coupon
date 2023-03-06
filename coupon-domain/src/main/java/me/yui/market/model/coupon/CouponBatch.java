package me.yui.market.model.coupon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.yui.market.enums.coupon.BatchStatusEnum;
import me.yui.market.model.basic.BizMeta;
import me.yui.market.model.basic.RecordInfo;
import me.yui.market.model.basic.User;
import me.yui.market.model.coupon.rule.*;
import me.yui.market.model.ext.Budget;
import me.yui.market.model.ext.Stock;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponBatch extends RecordInfo implements Serializable {
    private CouponBatchId batchId;

    private BizMeta bizMeta;

    private CouponBatchName batchName;

    private CouponName couponName;

    private Stock stock;

    private Budget budget;

    private Date deliverStartTime;

    private Date deliverEndTime;

    private Promotion promotion;

    private BindRule bindConstraint;

    private UseRule useConstraint;

    private BatchStatusEnum status;

    private User createUser;
}