package com.yang.design.pattern.strategywithspring.handler;

import org.springframework.stereotype.Component;

import com.yang.design.pattern.strategywithspring.annotation.HandlerType;
import com.yang.design.pattern.strategywithspring.entity.OrderDTO;

/**
 * Created by yangguojun01 on 2020/2/5.
 */
@Component
@HandlerType("1")
public class NormalHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO orderDTO) {
        return "处理正常订单";
    }
}
