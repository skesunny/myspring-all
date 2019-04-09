package com.honcz.myspring.myspringall.bean.properties;

/**
 * @Author honc.z
 * @date 2019/3/22 21:14
 */
public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }
}
