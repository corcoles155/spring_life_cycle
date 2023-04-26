package org.sanchez.corcoles.ana.pruebasconcepto.postconstructandpredestroy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//La interface InitializingBean funciona igual que la anotación @PostConstruct permitiendo ejecutar algunas tareas de inicialización
@Component
@Slf4j
public class InitializingBeanExample implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("***** afterPropertiesSet *****");
    }
}
