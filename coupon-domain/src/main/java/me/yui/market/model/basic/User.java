package me.yui.market.model.basic;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {
    private static final String UNKNOWN = "unknown";
    private String uid;
    private String username;
    private List<Role> roles;
}
