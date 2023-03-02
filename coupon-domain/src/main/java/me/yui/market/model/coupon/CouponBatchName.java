package me.yui.market.model.coupon;

import lombok.Data;
import me.yui.market.status.BatchStatus;
import me.yui.market.utils.AssertUtils;
import org.apache.commons.lang3.StringUtils;

@Data
public class CouponBatchName {
    private static final int MAX_LEN = 30;
    private String name;

    CouponBatchName(String name){
        AssertUtils.assertTrue(StringUtils.length(name) < 30, BatchStatus.INVALID_PARAM, "coupon batch name length should < 30");
    }
}
