## Ejemplos ciclo de vida de Spring

# Aware interfaces
- ApplicationContextAware
- BeanFactoryAwareExample
- BeanNameAwareExample
- EnvironmentAwareExample
- MessageSourceAwareExample
- ResourceLoaderAwareExample

# @PostConstruct / @PreDestroy callbacks

# InitializingBean / DisposableBean

# Inicialización (Eager y Lazy)

# Definición de callbacks con beans declarados de forma explícita

# BeanPostProcessor

# BeanFactoryPostProcessor

# Orden de ejecución
- AwareInterfaces
- postProcessBeforeInitialization de los beans que implementen la interface BeanPostProcessor
- Métodos anotados con @PostConstruct
- Métodos afterPropertiesSet de los beans que implementen la interface InitializingBeanExample
- postProcessAfterInitialization de los beans que implementen la interface BeanPostProcessor
- Métodos anotados con @PreDestroy
- Métodos destroy de los beans que implementan la interface DisposableBean
