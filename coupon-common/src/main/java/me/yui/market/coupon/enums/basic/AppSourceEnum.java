package me.yui.market.coupon.enums.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
/**
 * Suggest make it configurability
 */
public enum AppSourceEnum {
    WECHAT("1", "WECHAT"),
    ACTIVITY("2", "BIZ_SYSTEM");

    private final String code;

    private final String name;

    public static AppSourceEnum of(String code) throws IllegalAccessException {
        for (AppSourceEnum appSourceEnum : values()) {
            if (appSourceEnum.getCode().equals(code)) {
                return appSourceEnum;
            }
        }
        throw new IllegalAccessException("AppSourceEnum, illegal code, code: " + code);
    }
}
