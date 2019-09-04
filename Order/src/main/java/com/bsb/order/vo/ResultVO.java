package com.bsb.order.vo;

import lombok.Data;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 22:00
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
