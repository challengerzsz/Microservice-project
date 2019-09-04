package com.bsb.order.dao;

import com.bsb.order.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 21:15
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
