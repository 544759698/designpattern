package com.yang.design.pattern.strategywithspring.service;

import com.yang.design.pattern.strategywithspring.entity.OrderDTO;

/**
 * Created by yangguojun01 on 2020/2/5.
 */
public interface OrderService {
    String handle(OrderDTO orderDTO);
}
