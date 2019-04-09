package com.honcz.myspring.myspringall.bean.properties;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author honc.z
 * @date 2019/3/22 21:14
 */
public class PropertyValues {
    /**
     * 属性list
     */
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * 默认构造器
     */
    public PropertyValues() {
    }

    /**
     * 添加进属性集合
     */
    public void addPropertyValue(PropertyValue pv) {
        propertyValueList.add(pv);
    }

    /**
     * 获取属性集合
     */
    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
