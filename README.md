# Taller String MVC                                                                       
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/PRSER00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          

_Clase: JUnit._

```
📢 Crearé la siguiente clase en el paquete de test.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_1.png)

```
📢 Nuestra clase debe tener las anotaciones de JUnit para que pueda ser reconocida.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_2.png)

```
📢 También tiene que indicarse donde está "servlet-context.xml". Ahi tenemos las configuraciones de BD, query, properties y demás.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_3.png)

```
📢 Necesitamos que estén disponibles tanto el controlador como los services que necesita.
  EmpleadoRestController
  EmpleadoService
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_4.png)

```
📢 Inicializo los objetos de Mock.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_5.png)

```
📢 Para este caso solo he agregado 1 test. Puedo agregar varios en esta prueba de empleados.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_6.png)

```
📢 Este test realizará una prueba al servicio "buscar" de "EmpleadoRestController".
📢 Primero creo el objeto que se que está en la base de datos.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_7.png)

```
📢 Compruebo la igualdad entre lo que retorna el servicio y mi objeto. Ambos deberían ser iguales o devuelve error.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_8.png)

```
📢 Ahora reviso lo que me devuelve el servicio campo por campo.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_9.png)

```
📢 Reviso que solo se ejecute 1 vez.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_10.png)

```
📢 Reviso que luego que se llama el servicio, no existan mas interacciones.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_11.png)

```
📢 Si quiero ver paso a paso puedo agregarle un punto de interrupción e iniciar el servidor en Debug.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_12.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_13.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_14.png)

```
📢 Siempre la salida debe estar en verde para comprobar que nuestra prueba terminó exitosamente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/JUNIT00001_15.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/PRSER00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          
