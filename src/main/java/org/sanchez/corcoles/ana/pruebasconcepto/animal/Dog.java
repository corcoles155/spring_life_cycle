package org.sanchez.corcoles.ana.pruebasconcepto.animal;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog implements Animal {

    void init(){
        log.info("***** A dog is bron ***** ");
    }

    void destroy(){
        log.info("***** A dog had died ***** ");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
