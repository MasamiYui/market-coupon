package me.yui.market.model.coupon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.yui.market.enums.coupon.BatchStatusEnum;
import me.yui.market.enums.coupon.PromotionTypeEnum;
import me.yui.market.model.basic.BizMeta;
import me.yui.market.model.basic.CreateInfo;
import me.yui.market.model.coupon.rule.BindRule;
import me.yui.market.model.coupon.rule.UseRule;
import me.yui.market.model.ext.Budget;
import me.yui.market.model.ext.Stock;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponBatch implements Serializable {
    private CouponBatchId batchId;
    private BizMeta bizMeta;
    private CouponBatchName batchName;
    private CouponName couponName;
    private Stock stock;
    private Budget budget;
    private Date deliverStartTime;
    private Date deliverEndTime;
    private PromotionTypeEnum promotionType;
    private BindRule bindRule;
    private UseRule useRule;
    private BatchStatusEnum status;
    private CreateInfo createInfo;
}
