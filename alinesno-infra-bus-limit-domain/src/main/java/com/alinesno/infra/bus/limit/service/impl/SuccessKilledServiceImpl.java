package com.alinesno.infra.bus.limit.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alinesno.infra.bus.limit.entity.SuccessKilledEntity;
import com.alinesno.infra.bus.limit.mapper.SuccessKilledMapper;
import com.alinesno.infra.bus.limit.service.ISuccessKilledService;
import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LuoXiaoDong
 * @version 1.0.0
 */
@Service
public class SuccessKilledServiceImpl extends IBaseServiceImpl<SuccessKilledEntity, SuccessKilledMapper> implements ISuccessKilledService {

	// 日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(SuccessKilledServiceImpl.class);

}
