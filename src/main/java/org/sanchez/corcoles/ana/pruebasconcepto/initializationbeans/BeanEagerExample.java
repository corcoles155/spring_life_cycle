package org.sanchez.corcoles.ana.pruebasconcepto.initializationbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
 * Los beans de tipo eager son inicializados sin importar si se utilizarán o no dentro de la aplicación
 * Los beans con scope singleton son por defecto eager
 * NOTA: Si un bean singleton es lazy pero otro bean que depende de él no lo es, ambos serán considerados eager.
 */
@Component
@Lazy(value = false)
public class BeanEagerExample {
}
