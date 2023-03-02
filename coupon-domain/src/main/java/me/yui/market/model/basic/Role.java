package me.yui.market.model.basic;

import lombok.Data;

import java.io.Serializable;

@Data
public class Role implements Serializable {
    private Long id;
    private String key;
    private String name;
    private String desc;
}
