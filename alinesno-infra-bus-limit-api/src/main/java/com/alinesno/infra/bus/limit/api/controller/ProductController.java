package com.alinesno.infra.bus.limit.api.controller;

import com.alinesno.infra.bus.limit.entity.ProductEntity;
import com.alinesno.infra.bus.limit.service.IProductService;
import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import io.swagger.annotations.Api;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理与ProductEntity相关的请求的Controller。
 * 继承自BaseController类并实现IProductService接口。
 *
 * @version 1.0.0
 */
@Api(tags = "Product")
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/bus/limit/product")
public class ProductController extends BaseController<ProductEntity, IProductService> {

    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private IProductService service;

    @ResponseBody
    @PostMapping("/datatables")
    public TableDataInfo datatables(HttpServletRequest request, Model model, DatatablesPageBean page) {
        log.debug("page = {}", ToStringBuilder.reflectionToString(page));
        return this.toPage(model, this.getFeign(), page);
    }

    @Override
    public IProductService getFeign() {
        return this.service;
    }
}