package com.honcz.myspring.myspringall.beanfactory;

import com.honcz.myspring.myspringall.bean.BeanDefinition;
import javafx.scene.control.SliderBuilder;

/**
 * @Author honc.z
 * @date 2019/3/22 20:55
 */
public interface BeanFactory {

    /**
     * 通过bean名称获取bean
     * @param name
     * @return
     */
    Object getBean(String name);

    /**
     * 注册bean
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
