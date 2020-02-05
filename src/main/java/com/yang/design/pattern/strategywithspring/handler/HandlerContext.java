package com.yang.design.pattern.strategywithspring.handler;

import java.util.Map;

import com.yang.design.pattern.strategywithspring.util.BeanUtil;

import lombok.AllArgsConstructor;

/**
 * Created by yangguojun01 on 2020/2/5.
 */
@AllArgsConstructor
public class HandlerContext {

    private Map<String, Class> handlerMap;

    public AbstractHandler getInstance(String type) {
        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type:" + type);
        }
        return (AbstractHandler) BeanUtil.getBean(clazz);
    }
}
