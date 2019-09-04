package com.bsb.product.service.impls;

import com.bsb.product.dao.ProductInfoRepository;
import com.bsb.product.entity.ProductInfo;
import com.bsb.product.enums.ProductStatusEnum;
import com.bsb.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 15:24
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
