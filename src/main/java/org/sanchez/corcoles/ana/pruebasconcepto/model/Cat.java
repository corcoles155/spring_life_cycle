package org.sanchez.corcoles.ana.pruebasconcepto.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat implements Animal {

    void init(){
        log.info("***** A cat is bron ***** ");
    }

    void destroy(){
        log.info("***** A cat had died ***** ");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
