package me.yui.market.model.coupon.rule;

import lombok.Data;

import java.util.List;

@Data
public class BindRule {
    private List<BindConstraint> constraints;
}
