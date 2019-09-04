package com.bsb.order.service.impls;

import com.bsb.order.dao.OrderDetailRepository;
import com.bsb.order.dao.OrderMasterRepository;
import com.bsb.order.dto.OrderDTO;
import com.bsb.order.entity.OrderMaster;
import com.bsb.order.enums.OrderStatusEnum;
import com.bsb.order.enums.PayStatusEnum;
import com.bsb.order.service.OrderService;
import com.bsb.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author : zengshuaizhi
 * @date : 2019-09-04 21:22
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        // TODO: 2019-09-04 rpc

        OrderMaster orderMaster = new OrderMaster();

        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);

        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
