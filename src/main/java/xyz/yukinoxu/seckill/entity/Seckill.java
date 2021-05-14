package xyz.yukinoxu.seckill.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Seckill {
    private static final long serialVersionUID = 123456;
    private long seckillId;
    private String name;
    private int inventory;
    private Date startTime;
    private Date endTime;
    private Date createTime;
    private long version;
}
