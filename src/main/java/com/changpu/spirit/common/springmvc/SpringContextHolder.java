package com.changpu.spirit.common.springmvc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by maxing on 2016/4/5.
 */
public class SpringContextHolder implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    /**
     * 实现ApplicationContextAware接口的注入方法，applicationContext放入静态变量。
     * @param applicationContext
     * @throws BeansException
     */
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("注入ApplicationContext到SpringContextHolder:{}");
        if (SpringContextHolder.applicationContext != null) {
            System.out.println("SpringContextHolder中的ApplicationContext被覆盖, 原有ApplicationContext为:");
        }
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext  getApplicationContext(){
        checApplicationContext();
        return applicationContext;
    }
    public static <T> T getBean(String name){
        return (T) applicationContext.getBean(name);
    }
    public static <T> T getBean(Class<T> className){
        return (T) applicationContext.getBean(className);
    }
    private static void  checApplicationContext(){
        if(applicationContext == null){
            throw new IllegalStateException("applicationContet未注入，请在applicationContext.xml中定义SpringContextHolder");
        }
    }
    /**
     * 清除SpringContextHolder中的ApplicationContext为Null.
     */
    public static void clearHolder() {
        System.out.printf("清除SpringContextHolder中的ApplicationContext:"
                + applicationContext);
        applicationContext = null;
    }

}
