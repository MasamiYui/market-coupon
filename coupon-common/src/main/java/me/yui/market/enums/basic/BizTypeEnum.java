package me.yui.market.enums.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.yui.market.status.IStatus;
import org.springframework.data.repository.cdi.Eager;

@AllArgsConstructor
@Getter
public enum BizTypeEnum {
    TB("1", "MAIN");

    private final String code;

    private final String name;

    public static BizTypeEnum of(String code) throws IllegalAccessException {
        for(BizTypeEnum bizTypeEnum: values()){
            if(bizTypeEnum.getCode().equals(code)){
                return bizTypeEnum;
            }
        }
        throw new IllegalAccessException("BizTypeEnum, illegal code, code: " + code);
    }
}
