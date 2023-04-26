package org.sanchez.corcoles.ana.pruebasconcepto.awareinterfaces;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class MessageSourceAwareExample implements MessageSourceAware {

    @Override
    public void setMessageSource(MessageSource messageSource) {

    }
}
