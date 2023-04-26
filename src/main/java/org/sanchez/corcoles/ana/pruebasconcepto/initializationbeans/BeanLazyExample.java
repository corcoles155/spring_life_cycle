package org.sanchez.corcoles.ana.pruebasconcepto.initializationbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
 * Los beans de tipo lazy NO se crean hasta el momento en el que se utilizan por primera vez
 * Los beans con scope prototype son por defecto lazy
 * Si se desea definir un bean singleton como lazy se utiliza la anotación @Lazy
 * NOTA: Si un bean singleton es lazy pero otro bean que depende de él no lo es, ambos serán considerados eager.
 */
@Component
@Lazy
public class BeanLazyExample {
}
