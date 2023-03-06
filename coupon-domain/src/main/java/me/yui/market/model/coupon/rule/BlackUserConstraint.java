package me.yui.market.model.coupon.rule;

import me.yui.market.exception.BizException;
import me.yui.market.model.basic.User;
import me.yui.market.status.ConstraintStatus;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * [example]
 * bind constraint:
 * coupon bind,black user list constraint
 */
public class BlackUserConstraint extends Constraint {
    private List<User> blackUsers;

    /**
     * if hit black userId list,return false, or else return true
     *
     * @param constraintContext
     * @return
     */
    @Override
    public Boolean check(ConstraintContext constraintContext) {
        if (CollectionUtils.isEmpty(blackUsers)) return true;
        final User user = constraintContext.get(User.class);
        if (Objects.isNull(user)) return false;
        return blackUsers.stream().filter(u -> StringUtils.equals(u.getUid(), user.getUid())).findAny().isPresent() ? false : true;
    }

    @Override
    public void checkError() {
        throw new BizException(ConstraintStatus.BLACK_USER_LIST_CONSTRAINT_ERROR);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
