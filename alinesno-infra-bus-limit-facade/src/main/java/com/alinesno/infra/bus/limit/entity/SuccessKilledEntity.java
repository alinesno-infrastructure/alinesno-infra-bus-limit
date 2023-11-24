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
@TableName("success_killed")
public class SuccessKilledEntity extends InfraBaseEntity {
	/**
	 * 秒杀活动ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("秒杀活动ID")
	@TableField("seckill_id")
	private Long seckillId;

	/**
	 * 用户ID
	 */
	@ColumnType(MySqlTypeConstant.BIGINT)
	@ColumnComment("用户ID")
	@TableField("user_id")
	private Long userId;

	/**
	 * 状态
	 */
	@ColumnType(length = 1)
	@ColumnComment("状态")
	@TableField("state")
	private int state;

	/**
	 * 创建时间
	 */
	@ColumnType(value = MySqlTypeConstant.DATETIME, length = 18)
	@ColumnComment("创建时间")
	@TableField("create_time")
	private Date createTime;


}
