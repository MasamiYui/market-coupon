package me.yui.market.model.coupon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.yui.market.model.basic.IDGenerator;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponBatchId implements Serializable {
    private String id;

    private long batchId;

    public static CouponBatchId generateBatchId() {
        return CouponBatchId.builder().batchId(IDGenerator.longSnowId()).build();
    }
}
