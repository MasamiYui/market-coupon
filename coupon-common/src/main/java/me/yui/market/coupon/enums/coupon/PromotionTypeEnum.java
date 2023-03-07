package me.yui.market.coupon.enums.coupon;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PromotionTypeEnum {
    /**
     * 满减
     */
    CONDITION_DROP_DISCOUNT("1", "CONDITION_DROP_DISCOUNT"),
    /**
     * 直降
     */
    DIRECT_DROP_DISCOUNT("2", "DIRECT_DROP_DISCOUNT"),
    /**
     * 折扣
     */
    DISCOUNT("3", "DISCOUNT");

    private final String code;

    private final String name;

    public static PromotionTypeEnum of(String code) throws IllegalAccessException {
        for (PromotionTypeEnum typeEnum : values()) {
            if (typeEnum.getCode().equals(code)) {
                return typeEnum;
            }
        }
        throw new IllegalAccessException("PromotionTypeEnum, illegal code, code: " + code);
    }
}
