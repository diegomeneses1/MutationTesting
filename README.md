## 1. Introducción
Como ya se mencionó la práctica de mutation test se asegura de mirar la calidad de las pruebas y no la calidad de la aplicación. Y para cada lenguaje de desarrollo existe un framework que permite implementar este tipo de pruebas, para este caso se hablará de esta práctica en proyectos Java.

## 2. Herramienta
El **framework** que utilizaremos para realizar mutation test en proyectos Java es [PITEST](http://pitest.org/). 
![image.png](/.attachments/image-b33e2f09-866f-4f55-b433-df4aa2c957ff.png)
Pitest es un sitema de pruebas de mutaciones que proporciona un mejor standard para las pruebas realizadas con Java.

Algunas características son:
- Rápido, puede analizar en minutos lo que en otros podría tardar días.
- Fácil de usar, simplemente agregando la dependencia y sus respectivas configuraciones ya se puede utilizar.
- Compatible con ant, maven, gradle, entre otros.
- Se mantiene en constante desarrollo y dan soporte activamente.

### 2.1 Estados de los mutantes
Luego de la ejecución del proceso, los mutantes no solo viven o mueren, también pueden ocurrir errores de memoria, truncamiento y otro tipo de errores que la librería clasifica dentro de las siguientes categorías:
![image.png](/.attachments/image-2e1ec424-2438-4fbc-a36d-21b28085f969.png)

### 2.2 Tipos de los mutantes
La librería ofrece diferentes tipos de mutaciones clasificadas en dos versiones, 'Default Group' y 'Extended Group'.

### 3 Ejecución
Para ejecutar y visualizar el reporte se debe ejecutar el siguiente comando:
gradle pitest //Para proyectos sencillos


### 4 Reporte
Una vez se ejecuta el comando de pitestReport se puede observar en la ruta configurada un reporte que con dos tipos de cobertura
**Line Coverage:** Es la medida de cobertura normal, la que todos conocemos que se mide sobre el número de líneas de código ejecutadas por un algoritmo de prueba vs las líneas de código totales del sistema.
**Mutation Coverage:** Es cantidad de mutantes muertos sobre todos los entregados por el sistema, recuerden que la meta es eliminarlos todos, es decir, el porcentaje debe tender al 100%.
Este reporte se usa como un insumo para hacer las respectivas correcciones de nuestras pruebas y mejorar aquellos mutantes que no fueron eliminados.
