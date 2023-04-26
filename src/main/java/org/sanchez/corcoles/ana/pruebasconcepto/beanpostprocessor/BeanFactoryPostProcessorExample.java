package org.sanchez.corcoles.ana.pruebasconcepto.beanpostprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//Permite modificar la deinición de los beans, pero nunca modificará las instancias
@Slf4j
public class BeanFactoryPostProcessorExample implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        log.info("***** postProcessBeanFactory *****");
    }
}
