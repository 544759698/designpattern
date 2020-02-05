package com.yang.design.pattern.strategywithspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.design.pattern.strategywithspring.entity.OrderDTO;
import com.yang.design.pattern.strategywithspring.handler.AbstractHandler;
import com.yang.design.pattern.strategywithspring.handler.HandlerContext;

/**
 * Created by yangguojun01 on 2020/2/5.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO orderDTO) {
        AbstractHandler handler = handlerContext.getInstance(orderDTO.getType());
        return handler.handle(orderDTO);
    }
}
