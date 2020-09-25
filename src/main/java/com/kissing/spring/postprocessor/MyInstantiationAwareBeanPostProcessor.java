package com.kissing.spring.postprocessor;

import com.kissing.spring.po.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 自定义 {@link InstantiationAwareBeanPostProcessor}
 *
 * @author zhangziyao
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if (beanClass == User.class) {
            User user = new User();
            user.setAge("423423");
            user.setName("admin");
            System.out.println("自定义bean的第一次执行的后置处理器");
            return user;
        }
        return null;
    }
}
