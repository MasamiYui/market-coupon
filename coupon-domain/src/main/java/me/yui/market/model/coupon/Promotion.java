package me.yui.market.model.coupon;

import lombok.Data;
import me.yui.market.coupon.enums.coupon.PromotionTypeEnum;

@Data
public class Promotion {
    private PromotionTypeEnum promotionTypeEnum;

    private Long amount;

    private Long discount;
}
