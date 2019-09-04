package com.bsb.product.enums;

import lombok.Getter;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 15:25
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
