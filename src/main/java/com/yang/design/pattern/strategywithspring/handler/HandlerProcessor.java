package com.yang.design.pattern.strategywithspring.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import com.yang.design.pattern.strategywithspring.annotation.HandlerType;
import com.yang.design.pattern.strategywithspring.util.ClassScaner;

/**
 * Created by yangguojun01 on 2020/2/5.
 */
@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {

    private static final String HANDLER_PACKAGE = "com.yang.design.pattern.strategywithspring.handler";

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<String, Class> handerMap = new HashMap<>();
        ClassScaner.scan(HANDLER_PACKAGE, HandlerType.class).forEach(clazz -> {
            String type = clazz.getAnnotation(HandlerType.class).value();
            handerMap.put(type, clazz);
        });
        HandlerContext handlerContext = new HandlerContext(handerMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(), handlerContext);
    }
}
