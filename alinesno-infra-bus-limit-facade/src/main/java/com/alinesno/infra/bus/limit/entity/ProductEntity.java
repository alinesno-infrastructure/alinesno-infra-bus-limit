package com.alinesno.infra.bus.limit.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import lombok.Data;
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
@Data
public class ProductEntity extends InfraBaseEntity {

    /**
     * 商品名称
     */
    @TableField("name")
	@ColumnType(length=255)
	@ColumnComment("商品名称")
    private String name;

    /**
     * 商品ID
     */
    @TableField("product_id")
	@ColumnType(length=10)
	@ColumnComment("商品ID")
    private String productId;

    /**
     * 库存数量
     */
    @TableField("stock_quantity")
	@ColumnType(length=10)
	@ColumnComment("库存数量")
    private int stockQuantity;

    /**
     * 开始时间
     */
    @TableField("start_time")
	@ColumnType(length=19)
	@ColumnComment("开始时间")
    private Date startTime;

    /**
     * 结束时间
     */
    @TableField("end_time")
	@ColumnType(length=19)
	@ColumnComment("结束时间")
    private Date endTime;
}
