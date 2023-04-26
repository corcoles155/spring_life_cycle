package org.sanchez.corcoles.ana.pruebasconcepto.awareinterfaces;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BeanNameAwareExample implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        log.info("***** Bean name {} ***** ", name);
    }
}
