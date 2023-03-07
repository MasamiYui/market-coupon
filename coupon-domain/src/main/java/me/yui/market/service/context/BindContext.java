package me.yui.market.service.context;

import lombok.Data;
import me.yui.market.coupon.enums.basic.AppSourceEnum;
import me.yui.market.model.basic.User;
import me.yui.market.model.coupon.BindSerialId;
import me.yui.market.model.coupon.CouponBatchId;


@Data
public class BindContext implements OperationContext {

    private CouponBatchId batchId;

    private User user;

    private Integer count;

    private AppSourceEnum appSource;

    private BindSerialId serialId;

    @Override
    public void checkContext() {
    }

    @Override
    public boolean checkStatus(Integer statusBefore) {
        return true;
    }
}
