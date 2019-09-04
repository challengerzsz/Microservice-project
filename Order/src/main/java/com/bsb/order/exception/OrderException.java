package com.bsb.order.exception;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 21:42
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
