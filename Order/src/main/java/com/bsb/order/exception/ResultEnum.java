package com.bsb.order.exception;

import lombok.Getter;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 21:43
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
