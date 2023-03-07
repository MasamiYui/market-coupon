package me.yui.market.service;

import me.yui.market.model.coupon.CouponBatch;
import me.yui.market.model.coupon.CouponInstance;
import me.yui.market.model.coupon.CouponInstanceId;
import me.yui.market.service.context.*;

import java.util.List;

public class CouponInstanceDomainService {

    public List<CouponInstance> bind(CouponBatch couponBatch, BindContext bindContext) {
        return null;
    }

    public void freeze(CouponInstance instance, FreezeContext freezeContext) {
        return;
    }

    public void unFreeze(CouponInstance instance, UnFreezeContext unFreezeContext) {
        return;
    }

    public void use(CouponInstance instance, UseContext useContext) {
        return;
    }

    public void use(CouponInstance instance, RefundContext refundContext) {
        return;
    }

    public CouponInstance detail(CouponInstanceId instanceId) {
        return null;
    }

    public List<CouponInstance> list(InstanceQueryContext queryContext) {
        return null;
    }
}
