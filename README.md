# Taller String MVC                                                                       
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/CRDPR00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/AGRDP00001)

_Clase: Configuracion Proyecto con Maven._

#### ¿En que nos ayuda Apache Maven?

```
📢 Estandariza la configuración de un proyecto en todo su ciclo de vida, como por ejemplo:
  Como se debe compilar
  Como se debe empaquetar
  Como se debe instalar
  Qué librerías se va a usar
  Qué pruebas se realizarán
```

#### ¿En que nos ayuda Apache Maven?

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_1.png)

#### ¿Que es Maven Artifact?

```
📢 Maven trabaja con artefactos o Maven Artifact, que es una abstracción sobre el concepto de bloque de código reutilizable.
📢 Si pensamos un poco en que es un bloque de código nos daremos que todo bloque de código cumple con algunos principios muy muy elementales.
  Tiene un nombre o un identificador
  Pertenece a una empresa o persona
  Tiene una versión concreta
```

#### ¿Cómo es su ciclo de vida?

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_2.png)

```
📢 El ciclo de vida de el artefacto creado se detalla a continuación. Qué es lo que sucede desde el inicio hasta el final.
  1 Validate: Comprueba que el proyecto tiene la estructura.
  2 Compile: Compila el código y generar los ficheros .class
  3 Test: Realiza pruebas unitarias, si es que las hemos creado.
  4 Package: Genera un empaquetado que se pueda “reutilizar” por otras personas. Compilar no es lo mismo que empaquetar.
  5 Install: Instala el paquete en el repositorio local, para usarlo como dependencia en otros proyectos localmente .
  6 Deploy: Copia el paquete final en el repositorio remoto para compartirlo con otros desarrolladores y proyectos .
```

#### ¿Cómo usarlo?

```
📢 Todo proyecto Maven usar un fichero POM.xml en donde colocaremos las configuraciones.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_3.png)

```
📢 Por ejemplo, en este fichero podemos ver el nombre del artefacto. El cual pusimos cuando creamos el proyecto.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_4.png)

```
📢 También podemos definir que tipo de empaquetado se usará.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_5.png)

```
📢 Y también que dependencias o librerías quiero que tenga mi proyecto. Esto lo podemos ver en la sección de “dependencies”.
📢 La que muestro a continuación es una dependencia agregada de Spring.

```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_6.png)

```
📢 Antes de empezar verificamos que nuestro proyecto tenga la versión 11 de Java. 
📢 Para poder saber la versión de Java que se tiene dando clic derecho al proyecto, luego en propiedades.
📢 Luego seleccionamos “Java Compiler” y podemos ver que versión tenemos asignada.
📢 El siguiente es un ejemplo de un proyecto que tiene la versión 1.6.
📢 Si nosotros hemos inciado el IDE teniendo la versión 11, esto no debería ocurrir.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_7.png)

```
📢 También la podemos ver en “Project Facets”, ahí podremos ver formas más amplia la configuración de nuestro proyecto.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_8.png)

```
📢 Tengamos en cuenta que nuestro proyecto se construye en base a las indicaciones que coloquemos en nuestro archivo “pom.xml”.
📢 Solo si tenemos esa versión de Java diferente a la 11 la podemos cambiar aquí.

```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_9.png)

```
📢 Indicaré que quiero usar la versión 11 y grabaré mi cambio.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_10.png)

```
📢 Luego actualizaré mi proyecto en base a mi archivo “pom.xml”. Clic derecho en el proyecto.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_11.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_12.png)

```
📢 Podemos ver que se han cambiado..
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_13.png)

```
📢 Luego nos dirigimos a la sección “Java Build Path” y vemos que nos está indicando una advertencia.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_14.png)

```
📢 Vamos a la pestaña “Libraries”.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_15.png)

```
📢 Seleccionamos el JRE con advertencia y luego editar.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_16.png)

```
📢 Ahora seleccionamos “Alternate JRE” para poder instalarlo por nuestra cuenta. Luego seleccionamos “Installed JREs...” para indicar dónde se encuentra nuestra versión de Java que necesitamos.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_17.png)

```
📢 Primero eliminamos la que está por defecto.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_18.png)

```
📢 Ahora agregamos la versión.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_19.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_20.png)

```
📢 Indicamos la ruta donde está instalado.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_21.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_22.png)

```
📢 Seleccionamos finalizar en todas las pantallas..
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_23.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_24.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_25.png)

```
📢 Vemos que la advertencia ha desaparecido.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CPCMV00001_26.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/CRDPR00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/AGRDP00001)
