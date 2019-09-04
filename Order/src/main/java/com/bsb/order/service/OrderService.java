package com.bsb.order.service;

import com.bsb.order.dto.OrderDTO;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 21:22
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);
}
