package me.yui.market.enums.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BizLineEnum {
    TB("1", "TaoBao");

    private final String code;

    private final String name;

    public static BizLineEnum of(String code) throws IllegalAccessException {
        for(BizLineEnum bizlineEnum: values()){
            if(bizlineEnum.getCode().equals(code)){
                return bizlineEnum;
            }
        }
        throw new IllegalAccessException("BizLineEnum, illegal code, code: " + code);
    }
}
