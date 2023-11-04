package com.alinesno.infra.bus.limit.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品限制实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("product_limit")
@Data
public class ProductLimitEntity {

    /**
     * 商品ID
     */
    @TableField("product_id")
	@ColumnType(length=50)
	@ColumnComment("商品ID")
    private String productId;

    /**
     * 用户ID
     */
    @TableField("user_id")
	@ColumnType(length=50)
	@ColumnComment("用户ID")
    private String userId;

    /**
     * 秒杀状态
     */
    @TableField("seckill_status")
	@ColumnType(length=1)
	@ColumnComment("秒杀状态")
    private String seckillStatus;
}
