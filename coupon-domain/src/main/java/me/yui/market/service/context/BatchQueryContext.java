package me.yui.market.service.context;

import lombok.Data;


@Data
public class BatchQueryContext implements OperationContext {


    @Override
    public void checkContext() {
    }

    @Override
    public boolean checkStatus(Integer statusBefore) {
        return true;
    }
}
