# Ejemplos ciclo de vida de Spring

## Aware interfaces
- ApplicationContextAware, podemos implementar esta interface si queremos acceder al contexto de Spring.
- BeanFactoryAware
- BeanNameAware, podemos implementar esta interface si queremos conocer el nombre del bean.
- EnvironmentAware, podemos implementar esta interface si queremos acceder a los valores de alguna propiedad. Tenemos otras opciones como inyectar Environment en nuestro bean o usar la anotación @Value.
- MessageSourceAware
- ResourceLoaderAware, podemos implementar esta interface si queremos recuperar recursos externos a través de rutas de recursos. Por ejemplo "classpath:org/myapp/config.xml", "file:///data/config.xml", "http://myserver/logo.png" o "/data/config.com"

## @PostConstruct / @PreDestroy callbacks
Los callbacks @PostConstruct y @PreDestroy se ejecutan una vez que se construyó en bean y antes de que éste sea destruido, siguen las siguientes reglas:
- Los métodos a los que se aplica pueden tener cualquier modificador de acceso pero no deben recibir argumentos y su valor de retorno debe ser void.
- Éstas anotaciones no son propias de Spring, están definidas en el JSR-250 también utilizado en EJB.
- Si es un bean creado de forma explícita se pueden definir del siguiente modo @Bean(initMethod="init" destroyMethod="destroy"")
- Los métodos anotados con @PostConstruct se ejecutarán después de la inyección de dependencias.
- Los métodos anotados con @PreDestroy se ejecutarán antes de que el bean sea destruido.
- Los métodos anotados con @PreDestroy no se ejecutarán para beans con scope prototype
- Los métodos anotados con @PreDestroy sólo se ejecutarán si se termina la JVM de forma normal.

## InitializingBean / DisposableBean
Las interfaces InitializingBean y DisposableBean funcionan de la misma forma que @PostConstruct y @PreDestroy, permitiendo ejecutar algunas tareas de inicialización y liberación de recursos.

## Inicialización (Eager y Lazy)
Existen dos formas de inicializar un bean por Spring:
- Eager: Los beans de tipo eager son inicializados sin importar si se utilizarán o no dentro de la aplicación.
- Lazy: Los beans de tipo lazy no se crean hasta el momento de su utilización.

Los beans singleton son por defecto eager, los beans prototype son por defecto lazy.
Si se desea definir un bean singleton como lazy se utiliza la anotación @Lazy.
NOTA: Si un bean singleton es lazy pero otro bean que depende de él no lo es, ambos serán considerados eager.

## Definición de callbacks con beans declarados de forma explícita

## BeanPostProcessor
La interface BeanPostProcessor define los siguientes métodos, es posible implementarlos para definir una forma de inicialización propia:
- postProcessBeforeInitialization: Permite ejecutar lógica de inicialización antes de que se inicialice el bean por el contenedor de Spring.
- postProcessAfterInitialization: Permite ejecutar lógica de inicialización después el bean fue inicializado por el contenedor de Spring.

Podemos usar BeanPostProcessor para crear validadores para aquellos casos que no queramos que el contexto se cargue sin cumplir una serie de requisitos.
Podemos tener varios BeanPostProcessor y definir su orden de ejecución mediante la anotación @Order.

## BeanFactoryPostProcessor
La interface BeanFactoryPostProcessor define el método postProcessBeanFactory que permite modificar la definición de los beans, pero nunca modificará las instancias.
BeanFactoryPostProcessor es similar a BeanPostProcessor, la diferencia es que BeanFactoryPostProcessor actua sobre los metadatos del contexto de Spring, es decir, sobre el mismo archivo de configuración.

## Orden de ejecución
- AwareInterfaces
- postProcessBeforeInitialization de los beans que implementen la interface BeanPostProcessor
- Métodos anotados con @PostConstruct
- Métodos afterPropertiesSet de los beans que implementen la interface InitializingBeanExample
- postProcessAfterInitialization de los beans que implementen la interface BeanPostProcessor
- Métodos anotados con @PreDestroy
- Métodos destroy de los beans que implementan la interface DisposableBean
