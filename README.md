# Taller String MVC                                                                       
### 🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)

# Solución a Errores 🐶

## Problema al Instalar Complemento en Eclipse

```
📢 Esto se soluciona dando permisos de administrador a Eclipse debido a que está en el disco C. 
📢 También se puede solucionar cambiando de ubicación el lugar donde está el IDE al disco D por ejemplo.
```
![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_1.png)

## Problema en Pom no solucionado con Maven > Update Project

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_24.png)

```
📢 Intentaré solucionarlo limpiando e instalando manualmente las dependencias.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_25.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_26.png)

```
📢 Puedo ver en la consola que ha terminado correctamente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_27.png)

## Problema al Cambiar el Nombre War en Pom.xml

```
📢 No solo basta con cambiar el nombre. 
📢 Tener en cuenta que ante algún cambio en nuestro archivo pom.xml tenemos que actualizar para que el proyecto tome los cambios.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_2.png)

```
📢 Lo actualizamos así..
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_3.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_4.png)

```
📢 Ahora vamos a la carpeta donde esta descargado el jboss. Esto en la carpeta “Servidor” que creamos.
    “Servidor\jboss-eap-7.2\standalone\deployments”
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_5.png)

```
📢 Ahora limpiamos nuestro servidor para que nos genere un War con los nuevos cambios.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_6.png)

```
📢 Vemos que lo ha generado.
📢 ADVERTENCIA. - Para nuestro ejemplo, si esta carpeta tiene más de 1 War generado, cargará solo el primero generado. 
📢 Por esta razón, si se cambia de nombre de War borrar el que ya se generó.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_7.png)

```
📢 Iniciamos para comprobar cambios.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_8.png)

```
📢 El servidor ha tomado los cambios.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_9.png)

## Puerto ya está siendo usado

```
📢 En este caso, cambiar el puerto como se explicó en la útlima parte del tema:
    https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/ASVPR00001
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_10.png)

#### Versión de Java no se Encuentra

```
📢 Nos dirigimos a la sección “Java Build Path” y vemos que nos está indicando una advertencia.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_11.png)

```
📢 Vamos a la pestaña “Libraries”.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_12.png)

```
📢 Seleccionamos el JRE con advertencia y luego editar.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_13.png)

```
📢 Ahora seleccionamos “Alternate JRE” para poder instalarlo por nuestra cuenta. 
📢 Luego seleccionamos “Installed JREs...” para indicar dónde se encuentra nuestra versión de Java que necesitamos.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_14.png)

```
📢 Primero eliminamos la que está por defecto.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_15.png)

```
📢 Ahora agregamos la versión.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_16.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_17.png)

```
📢 Indicamos la ruta donde está instalado.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_18.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_19.png)

```
📢 Seleccionamos finalizar en todas las pantallas.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_20.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_21.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_22.png)

```
📢 Vemos que la advertencia ha desaparecido.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/SOLER00001_23.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)
