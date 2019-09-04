package com.bsb.product.vo;

import lombok.Data;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 15:31
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
