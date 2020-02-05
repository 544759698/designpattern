package com.yang.design.pattern.strategywithspring.handler;

import org.springframework.stereotype.Component;

import com.yang.design.pattern.strategywithspring.annotation.HandlerType;
import com.yang.design.pattern.strategywithspring.entity.OrderDTO;

/**
 * Created by yangguojun01 on 2020/2/5.
 */
@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO orderDTO) {
        return "处理团购订单";
    }
}
