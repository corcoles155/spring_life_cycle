package org.sanchez.corcoles.ana.pruebasconcepto.config;

import org.sanchez.corcoles.ana.pruebasconcepto.animal.Animal;
import org.sanchez.corcoles.ana.pruebasconcepto.animal.Cat;
import org.sanchez.corcoles.ana.pruebasconcepto.animal.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    //Ejemplo de bean declarado de forma explícita
    //La anotación @Bean deine los atributos initMethod y destroyMethod los cuales representan el nombre del callback de inicialización y destrucción
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Animal getCat() {
        return new Cat();
    }

    //Ejemplo de bean declarado de forma explícita
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Animal getDog() {
        return new Dog();
    }
}
