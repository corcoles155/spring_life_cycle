package org.sanchez.corcoles.ana.pruebasconcepto.awareinterfaces;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EnvironmentAwareExample implements EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {
        String url = environment.getProperty("spring.datasource.url");
        log.info("***** The active profile is {} and spring.datasource.url property have value {} *****", environment.getActiveProfiles(), url);
    }
}
