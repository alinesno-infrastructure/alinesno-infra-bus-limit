package com.alinesno.infra.bus.limit.api.provider;

import com.alinesno.infra.bus.limit.api.dto.ProductDto;
import com.alinesno.infra.common.facade.response.AjaxResult;

import java.util.List;

/**
 * 商品预处理对象，用于添加商品，用于做秒杀限制
 */
public class ProductPreController {

    /**
     * 添加秒杀限制商品
     * @param productDtoList
     * @return
     */
    public AjaxResult addLimitProduct(List<ProductDto> productDtoList){

        return AjaxResult.success() ;
    }

    /**
     * 获取秒杀商品状态
     * @param productId
     * @return
     */
    public AjaxResult getLimitProduct(String productId){

        return AjaxResult.success() ;
    }

}
