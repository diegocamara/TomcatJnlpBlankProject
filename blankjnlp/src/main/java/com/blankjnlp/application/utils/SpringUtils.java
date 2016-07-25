package com.blankjnlp.application.utils;

import org.springframework.context.ApplicationContext;

public class SpringUtils {

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String beanName, ApplicationContext applicationContext) {
        return (T) applicationContext.getBean(beanName);
    }

}
