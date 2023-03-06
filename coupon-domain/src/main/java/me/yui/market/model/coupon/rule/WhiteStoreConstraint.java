package me.yui.market.model.coupon.rule;

import me.yui.market.exception.BizException;
import me.yui.market.model.ext.Store;
import me.yui.market.status.ConstraintStatus;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * [example]
 * use constraint:
 * coupon bind,white store list constraint
 */
public class WhiteStoreConstraint extends UseConstraint {
    private List<Store> whiteStores;

    /**
     * if hit white list,return true, or else return false
     *
     * @param constraintContext
     * @return
     */
    @Override
    public Boolean check(ConstraintContext constraintContext) {
        if (CollectionUtils.isEmpty(whiteStores)) return true;
        final Store store = constraintContext.get(Store.class);
        if (Objects.isNull(store)) return false;
        return whiteStores.stream().filter(u -> StringUtils.equals(u.getStoreId(), store.getStoreId())).findAny().isPresent() ? true : false;
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
