package com.alinesno.infra.bus.limit.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 商品实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("product")
public class ProductEntity extends InfraBaseEntity {

    /**
     * 商品名称
     */
    @TableField("name")
    private String name;

    /**
     * 商品ID
     */
    @TableField("product_id")
    private String productId;

    /**
     * 库存数量
     */
    @TableField("stock_quantity")
    private int stockQuantity;

    /**
     * 开始时间
     */
    @TableField("start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;

    // 省略构造函数、getter和setter方法
}
