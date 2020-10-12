# CVDS-LAB3
CVDS-LAB3

## Integrantes:

- Ivan Camilo Rincón Saavedra
 
- Leonardo Galeano

## Ejercicio “Registraduría” 

### Introducción

Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximas elecciones y se generarán los certificados electorales de aquellas personas cuyo voto sea válido.

Se usará la clase de persona que ya fue creada. El servicio de la registradiría permitirá registrar personas que sean votantes

### Propiedades
* Solo se registrarán votantes válidos
* Solo se permite una inscripción por número de documento

### Creación del proyecto
En el directorio de trabajo ejecutar el comando necesario para crear un proyecto maven, basado en un arquetipo:
* Grupo: edu.eci.cvds
* Artefacto: ClasesEquivalencia
* Paquete: edu.eci.cvds.tdd
* archetypeArtifactId: maven-archetype-quickstart



![1](https://github.com/Rincon10/CVDS-LAB3/blob/master/resources/CreacionProyecto.png)

## Compilación del primer momento del proyecto
* Añadir el artefacto ```Junit``` en el repositorio central de ```Maven```
* Edite el archivo ```pom.xml``` y realice las siguientes actualizaciones:
  * Agregue la dependencia copiada a la sección de dependencias.
  * Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
    ```
    <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
    ```
![2](https://github.com/Rincon10/CVDS-LAB3/blob/master/resources/Compile1.png)

![3](https://github.com/Rincon10/CVDS-LAB3/blob/master/resources/Compile2.png)

Una vez realizado el esquema de la aplicacion, continuar con las pruebas .
## Pruebas 
### Ejecucion sin pruebas del proyecto registro (TestAppp.java)

![4](https://github.com/Rincon10/CVDS-LAB3/blob/master/resources/Tests.png)
## Finalizar el ejercicio
* Piense en los casos de equivalencia que se pueden generar del ejercicio para la registraduría, dadas las condiciones. Deben ser al menos 5.
* Complete la implementación del método registerVoter en la clase Registry.java para retornar el resultado esperado según la entrada.
* Complete la implementación de la clase RegistryTest.java con (al menos) un método por cada clase de equivalencia, creando diferentes personas y validando que el resultado sea el esperado.

![5](https://github.com/Rincon10/CVDS-LAB3/blob/master/resources/RegistryTest.jpg)
## Ejercicio "Descuento de tarifas"
### Realizar diseño de pruebas
El diseño de las pruebas se encuentran en el ***pdf*** del repositorio

### Implementación de las pruebas 
Descargue el archivo aerodescuentos.jar y adicione esta nueva dependencia en el archivo ```pom.xml``` de su proyecto.
Para adicionar una librería personalizada al repositorio local de maven puede ejecutar el siguiente comando.
```
$ mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar
```

![6](https://github.com/Rincon10/CVDS-LAB3/blob/master/resources/installingJar.jpg)

* Cree el archivo TarifasTest.java
* Ejecute el comando de Maven para las fases de compilación y pruebas. Verifique el resultado exitoso de todas las pruebas y el reporte generado. 

![7](https://github.com/Rincon10/CVDS-LAB3/blob/master/resources/TarifasTest.png)

### __Autores__

* Camilo Rincón [Rincon10](https://github.com/Rincon10)
* Leonardo Galeano [Ersocaut](https://github.com/Ersocaut)
