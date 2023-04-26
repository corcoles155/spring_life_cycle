package org.sanchez.corcoles.ana.pruebasconcepto.beanpostprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BeanPostProcessorExample implements BeanPostProcessor {

    //postProcessBeforeInitialization permite ejecutar lógica de inicialización ANTES de que se inicialice el bean por el contenedor de spring
    //Se ejecutará antes de que inicialice cada bean
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("***** Before initialization {} *****", beanName);
        return bean;
    }

    //postProcessAfterInitialization permite ejecutar lógica de inicialización DESPUÉS de que el bean fue inicializado por el contenedor de spring
    //Se ejecutará después de que inicialice cada bean
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("***** After initialization {} *****", beanName);
        return bean;
    }
}
