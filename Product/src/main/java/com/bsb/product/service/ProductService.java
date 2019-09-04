package com.bsb.product.service;

import com.bsb.product.entity.ProductInfo;

import java.util.List;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 15:23
 */
public interface ProductService {

    /**
     * search for all status = 0 product
     */
    List<ProductInfo> findUpAll();
}
