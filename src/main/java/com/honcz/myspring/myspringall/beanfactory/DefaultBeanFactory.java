package com.honcz.myspring.myspringall.beanfactory;

import com.honcz.myspring.myspringall.bean.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author honc.z
 * @date 2019/3/22 20:59
 */
public class DefaultBeanFactory implements BeanFactory{
    //bean工厂
    Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);

    @Override
    public Object getBean(String name) {
        BeanDefinition beanDefinition =  beanDefinitionMap.get(name);
        return beanDefinition.getBean();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }
}
