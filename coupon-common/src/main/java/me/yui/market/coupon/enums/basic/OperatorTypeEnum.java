package me.yui.market.coupon.enums.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OperatorTypeEnum {

    FREEZE(1, "FREEZE"),
    USE(2, "USE"),
    UNFREEZE(3, "UNFREEZE"),
    REFUND(4, "REFUND"),
    DELETE(5, "DELETE");
    private int type;
    private String desc;
}
