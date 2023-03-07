package me.yui.market.model.coupon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponInstanceId {
    private Long id;

    private Long instanceId;

    /**
     * make could query by userId and instanceId when Separate table
     * when query by instanceId, use: select table_{instanceId % table_nums}
     * when query by userId, use: select table_{userId % table_nums}
     *
     * @param userId
     * @param timestamp
     * @return
     */
    public static CouponInstanceId generateInstance(Long userId, Long timestamp) {
        Long head = 1L;
        head <<= 62;
        timestamp <<= 19;
        Random random = new Random();
        long randomNumber = random.nextInt(128);
        randomNumber <<= 12;
        long uidTail = userId & 4095;
        return CouponInstanceId.builder().instanceId(head | timestamp | randomNumber | uidTail).build();
    }
}
