package com.bsb.order.enums;

import lombok.Getter;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 21:18
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
