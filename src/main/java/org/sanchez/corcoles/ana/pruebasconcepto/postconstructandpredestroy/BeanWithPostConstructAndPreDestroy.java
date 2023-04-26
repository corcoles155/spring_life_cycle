package org.sanchez.corcoles.ana.pruebasconcepto.postconstructandpredestroy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class BeanWithPostConstructAndPreDestroy {

    /*
     * Se ejecuta una vez que se construyó el bean
     * El método al que se aplica puede tener cualquier modificador de acceso pero no debe de recibir ningún parámetro y su valor de retorno debe ser void
     * Esta anotación no es propia de Spring, está definida en el JSR-250 también utilizado en EJB
     * Si es un bean creado de manera explícita se puede definir de la siguiente forma: @Bean(initMethod="init")
     * Los métodos anotados con @PostConstruct se ejecutarán después de la inyección de dependencias
     */
    @PostConstruct
    public void init() {
        log.info("***** Post Construct ***** ");
    }

    /*
     * Se ejecuta una vez que se destruyó el bean
     * El método al que se aplica puede tener cualquier modificador de acceso pero no debe de recibir ningún parámetro y su valor de retorno debe ser void
     * Esta anotación no es propia de Spring, está definida en el JSR-250 también utilizado en EJB
     * Si es un bean creado de manera explícita se puede definir de la siguiente forma: @Bean(destroyMethod="destroy")
     * Los métodos anotados con @PreDestroy no se ejecutarán para beans con scope prototype
     * Los métodos anotados con @PreDestroy se ejecutarán antes de que el bean sea destruido
     * Los métodos anotados con @PreDestroy sólo se ejecutan si se termina la JVM de forma normal
     * */
    @PreDestroy
    public void destroy() {
        log.info("***** Pre Destroy ***** ");
    }

}
