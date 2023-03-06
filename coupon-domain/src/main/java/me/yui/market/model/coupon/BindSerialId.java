package me.yui.market.model.coupon;

import lombok.Data;

@Data
public class BindSerialId {
    private String serialId;

    BindSerialId(String serialId){
        //1.check serialId
        //2.set serialId
        this.serialId = serialId;
    }
}
