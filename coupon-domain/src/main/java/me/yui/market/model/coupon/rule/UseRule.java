package me.yui.market.model.coupon.rule;

import lombok.Data;

import java.util.List;

@Data
public class UseRule {
    private List<UseConstraint> constraints;
}
