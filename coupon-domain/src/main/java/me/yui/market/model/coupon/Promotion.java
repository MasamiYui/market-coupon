package me.yui.market.model.coupon;

import lombok.Data;
import me.yui.market.enums.coupon.PromotionTypeEnum;

@Data
public class Promotion {
    private PromotionTypeEnum promotionTypeEnum;

    private Integer amount;

    private Integer discount;
}
