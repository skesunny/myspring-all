package com.honcz.myspring.myspringall.bean;


import com.honcz.myspring.myspringall.bean.properties.PropertyValues;

/**
 * @Author honc.z
 * @date 2019/3/22 20:56
 */
public class BeanDefinition {
    private Object bean;

    /**
     * 类的详细名称
     */
    private String beanClassName;

    /**
     * 类class
     */
    private Class beanClass;

    /**
     * bean的属性集合
     */
    private PropertyValues propertyValues = new PropertyValues();


    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        //拿到classname,就可以通过反射拿到class
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
