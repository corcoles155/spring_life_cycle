package org.sanchez.corcoles.ana.pruebasconcepto.initializationbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
 * Si un bean singleton es lazy pero otro bean que depende de él no lo es, ambos serán considerados eager.
 */
//@Component //Si comentamos esta anotación BeanLazyExample no debería inicializarse
@Lazy(value = false) //No es necesario poner esta anotación, por defecto su scope es singleton y todos los beans singleton se inicializan como lazy
public class BeanDependsBeanLazyExample {

    //Este bean es lazy, pero pasa a ser eager porque está como dependencia de un bean que se inicializa como eager.
    @Autowired
    private BeanLazyExample beanLazyExample;

}
