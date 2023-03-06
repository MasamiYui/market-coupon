package me.yui.market.model.coupon.rule;

import com.alibaba.fastjson2.JSON;
import lombok.Data;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.core.Ordered;

@Data
public abstract class Constraint implements Ordered {
    //约束宿主id
    private String domainId;

    public String serialize() {
        return JSON.toJSONString(this);
    }

    public void deserialize(String data) {
        Object o = JSON.parseObject(data, getClass());
        BeanCopier.create(o.getClass(), getClass(), false).copy(o, this, null);
    }

    public abstract Boolean check(ConstraintContext constraintContext);

    public abstract void checkError();
}
