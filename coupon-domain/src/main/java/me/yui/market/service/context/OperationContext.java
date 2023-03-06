package me.yui.market.service.context;

public interface OperationContext {
    void checkContext();

    boolean checkStatus(Integer statusBefore);
}