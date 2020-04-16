# Taller String MVC                                                                       
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/INSTC00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/APRSC00001)

_Clase: Modificando libretas de configuración de Spring._

```
📢 A continuación veremos los como configurar el arranque del aplicativo.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/MLCSP00001_1.png)

```
📢 El archivo "web.xml" define asignaciones entre rutas URL y los servlets que manejan solicitudes con esas rutas.
📢 Se ha creado una carpeta "spring" donde colocaremos lo que respecta a spring que son:
  servlet-context.xml
  root-context.xml
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/MLCSP00001_2.png)

```
📢 En "root-context.xml" no relizaremos ningún cambio por ahora.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/MLCSP00001_3.png)

```
📢 Esta en la estructura del "servlet-context.xml".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/MLCSP00001_4.png)

```
📢 Si vemos a detalle podemos revisar que se estan mapeando varios recursos para que el aplicativo los consuma.
  Se mapea los recursos estáticos (resources).
  Se mapea donde estaran los archivos en donde retornará el controlador (jsp) y la carpeta.
  Se mapea la carpeta base del proyecto (com.tcs.app).
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/MLCSP00001_5.png)

```
📢 Agregaremos más configuraciones, se detalle en el documento cada una.
  https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/MLCSP00001/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/MLCSP00001_6.png)

```
📢 Luego que agreguemos las anteriores líneas. Nos mostrará un error si no agregamos la etiqueta correspondiente.
📢 Por ejemplo, me indica que no reconoce que es "tx".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/MLCSP00001_7.png)

```
📢 La agregaré en la cabecera.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/MLCSP00001_8.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/INSTC00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/APRSC00001)
