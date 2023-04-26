package org.sanchez.corcoles.ana.pruebasconcepto.awareinterfaces;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentAwareExample implements EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {

    }
}
