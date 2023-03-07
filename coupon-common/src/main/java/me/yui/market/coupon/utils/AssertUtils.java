package me.yui.market.coupon.utils;

import me.yui.market.coupon.exception.BizException;
import me.yui.market.coupon.status.IStatus;
import org.apache.commons.lang3.BooleanUtils;

public class AssertUtils {
    public static void assertTrue(Boolean b, RuntimeException e) {
        if (!BooleanUtils.isTrue(b)) throw e;
    }

    public static void assertTrue(Boolean b, IStatus status, Object... context) {
        if (!BooleanUtils.isTrue(b)) throw new BizException(status, context);
    }

    public static void assertTrue(Object o1, Object o2, IStatus status, Object... contexts) {
        if (o1 == null || !o1.equals(o2)) throw new BizException(status, contexts);
    }
}
