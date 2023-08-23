package com.alinesno.infra.bus.limit.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品限制实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("product_limit")
public class ProductLimitEntity {

    /**
     * 商品ID
     */
    @TableField("product_id")
    private String productId;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private String userId;

    /**
     * 秒杀状态
     */
    @TableField("seckill_status")
    private String seckillStatus;

    // 省略构造函数、getter和setter方法

}
