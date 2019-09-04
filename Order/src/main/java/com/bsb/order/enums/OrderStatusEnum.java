package com.bsb.order.enums;

import lombok.Getter;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 21:16
 */
@Getter
public enum OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消");

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
