package org.sanchez.corcoles.ana.pruebasconcepto.postconstructandpredestroy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//La interface DisposableBean funciona igual que la anotación @PreDestroy permitiendo ejecutar algunas tareas liberación de recursos
@Component
@Slf4j
public class DisposableBeanExample implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.info("***** destroy ***** ");
    }
}
