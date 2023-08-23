package com.alinesno.infra.bus.limit.service;

/**
 * 限制服务类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
public interface ILimitService {

    /**
     * 删除商品
     * @param productId
     * @return
     */
    boolean deleteProduct(long productId) ;

    /**
     * 统计当前商品数量
     * @param productId
     * @return
     */
    int countProduct(long productId) ;

    /**
     * 商品下单
     * @param productId
     * @param userId
     */
    void orderProduct(long productId , long userId) ;
}
