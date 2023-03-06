package me.yui.market.model.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.yui.market.enums.basic.AppSourceEnum;
import me.yui.market.enums.basic.OperatorTypeEnum;
import me.yui.market.model.basic.BizMeta;
import me.yui.market.model.basic.RecordInfo;
import me.yui.market.model.basic.User;
import me.yui.market.model.ext.Order;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponFlowRecord extends RecordInfo {

    private FlowId flowId;

    private BizMeta bizLine;

    private CouponInstanceId instanceId;

    private CouponBatchId batchId;

    private AppSourceEnum appSource;

    private User user;

    private Order order;

    private OperatorTypeEnum operatorType;
}
