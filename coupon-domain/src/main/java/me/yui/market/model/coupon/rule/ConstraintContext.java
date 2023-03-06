package me.yui.market.model.coupon.rule;

import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstraintContext {

    /**
     * 上下文内容存储
     */
    private final Map<Class<?>, Object> context;

    private Map<Class<?>, List<?>> collectionContext;

    private ConstraintContext() {
        this.context = Maps.newHashMap();
    }

    public static ConstraintContext get() {
        return new ConstraintContext();
    }

    public void put(Object obj) {
        if (obj instanceof Enum) {
            context.put(obj.getClass().getSuperclass(), obj);
        } else {
            context.put(obj.getClass(), obj);
        }
    }

    public <T> T get(Class<T> clazz) {
        if (context == null) {
            return null;
        }
        return (T) context.get(clazz);
    }

    public <T> void putList(List<T> list, Class<T> c) {
        if (collectionContext == null) {
            collectionContext = new HashMap<>();
        }
        collectionContext.put(c, list);
    }

    public <T> List<T> getList(Class<T> c) {
        if (collectionContext == null) {
            return Collections.emptyList();
        }
        return (List<T>) collectionContext.get(c);
    }
}
