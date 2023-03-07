package me.yui.market.coupon.enums.coupon;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BatchStatusEnum {
    /**
     * you could add more status, such as bpm status
     */
    DEL("-1", "DELETE"),
    INEFFECTIVE("0", "INEFFECTIVE"),
    OFFLINE("1", "OFFLINE"),
    ONLINE("2", "ONLINE"),
    END("3", "END");

    private final String code;

    private final String name;

    public static BatchStatusEnum of(String code) throws IllegalAccessException {
        for (BatchStatusEnum statusEnum : values()) {
            if (statusEnum.getCode().equals(code)) {
                return statusEnum;
            }
        }
        throw new IllegalAccessException("BatchStatusEnum, illegal code, code: " + code);
    }
}
