package com.yang.design.pattern.strategywithspring.handler;

import com.yang.design.pattern.strategywithspring.entity.OrderDTO;

/**
 * Created by yangguojun01 on 2020/2/5.
 */
public abstract class AbstractHandler {
    public abstract String handle(OrderDTO orderDTO);
}
