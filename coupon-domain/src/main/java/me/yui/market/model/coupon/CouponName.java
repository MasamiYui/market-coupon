package me.yui.market.model.coupon;

import lombok.Data;
import me.yui.market.status.BatchStatus;
import me.yui.market.utils.AssertUtils;
import org.apache.commons.lang3.StringUtils;

@Data
public class CouponName {
    private static final int MAX_LEN = 30;
    private String name;

    CouponName(String name){
        AssertUtils.assertTrue(StringUtils.length(name) < 30, BatchStatus.INVALID_PARAM, "coupon name length should < 30");
    }
}
