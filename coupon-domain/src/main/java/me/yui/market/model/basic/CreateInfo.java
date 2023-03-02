package me.yui.market.model.basic;

import lombok.Data;

import java.util.Date;

@Data
public class CreateInfo {
    private Date createTime;
    private Date modifyTime;
    private User user;
}
