package com.bsb.product.service;

import com.bsb.product.entity.ProductCategory;

import java.util.List;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 15:29
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
