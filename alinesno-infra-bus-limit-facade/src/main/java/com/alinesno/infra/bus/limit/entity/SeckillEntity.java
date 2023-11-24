package com.alinesno.infra.bus.limit.entity;

import java.util.Date;
import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Data
@TableName("seckill")
public class SeckillEntity extends InfraBaseEntity {
	/**
	 * 秒杀活动ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("秒杀活动ID")
	@TableField("seckill_id")
	private Long seckillId;

	/**
	 * 秒杀活动名称
	 */
	@ColumnType(length = 255)
	@ColumnComment("秒杀活动名称")
	@TableField("name")
	private String name;

	/**
	 * 可秒杀商品数量
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("可秒杀商品数量")
	@TableField("number")
	private Long number;

	/**
	 * 开始时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("开始时间")
	@TableField("start_time")
	private Date startTime;

	/**
	 * 结束时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("结束时间")
	@TableField("end_time")
	private Date endTime;

	/**
	 * createTime
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("createTime")
	@TableField("create_time")
	private Date createTime;

	/**
	 * 版本
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("版本")
	@TableField("version")
	private Long version;


}
