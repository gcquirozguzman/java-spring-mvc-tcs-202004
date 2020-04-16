# Taller String MVC                                                                       
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/RETCT00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/XXXXX00001)

_Clase: Probando Servicios._

```
📢 Iniciare el servidor en modo Debug.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_1.png)

```
📢 Instalaré Postman descargado de la ruta "https://www.postman.com/downloads/".
📢 Iniciaré el programa.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_2.png)

```
📢 Creare un ambiente de trabajo para este proyecto.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_3.png)

```
📢 Le colocaré un nombre.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_4.png)

```
📢 Ahora separaré cada grupo de servicios de mi ambiente en folder.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_5.png)

```
📢 Crearé uno para "Empleado".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_6.png)

```
📢 Ahora ahi agregaré un request.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_7.png)

```
📢 Voy a crear el de "Listar".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_8.png)

```
📢 Luego de creado, selecciono y puedo ver al lado derecho un panel.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_9.png)

```
📢 En esta sección tengo que indicar el tipo y nombre de servicio.
📢 Es un servicio GET
📢 La ruta es:
  http://localhost:8080/ProyectoSpringMVC/rest/empleado/listar
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_10.png)

```
📢 Seleccionaré "Send" para comunicarme con el servidor.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_11.png)

```
📢 Vemos que me ha dado un respuesta.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_12.png)

```
📢 Me dirijo ahora a al clase "EmpleadoRestController".
📢 Doble clic en la barrita al lado de la primera línea de mi método.
📢 Hemos creando un punto de interrupción.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_13.png)

```
📢 Volveré a enviar la petición.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_14.png)

```
📢 Vuelvo al IDE y veo que me consulta si quiero cambiar de vista.
📢 Le diré que no por ahora.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_15.png)

```
📢 Se ha sombreado la línea donde he marcado.
📢 Esto ha sucedido porque he pedido al programa que cuando se llame a este método se detenga ahí hasta que le diga que avance.
📢 Recorre 1 línea cada vez que preciono F6.
📢 Presionare F6 2 veces.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_16.png)

```
📢 Ahora veo que ha recorrido 2 líneas.  
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_17.png)

```
📢 Colocaré el cursor encima de la variable "empleadoResponse".
📢 Esta variable se ha cargado con la respuesta de  "empleadoService.list()".
📢 Hasta esta línea donde está marcada tiene estos datos.
📢 Puedo extender para ver los detalles.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_18.png)

```
📢 Como ya terminé el ejemplo, quiero finalizar la revisión y que siga el método con su flujo.
📢 Para esto presiono F8.
📢 F8 permite que siga hasta que encuentre el siguiente punto de interrupción.
📢 Como no he colocado otro punto, seguira hasta el final.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_19.png)

```
📢 Crearé en Postma el request para "crear".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_20.png)

```
📢 El servicio ahora nos pide que le enviemos un objeto.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_21.png)

```
📢 Crearé el "request".
📢 Colocaré que es POST.
📢 Indicaré la ruta.
📢 Seleccionaré que enviare como parámetro un " Body".
📢 Seleccionaré "raw" y como formato "JSON".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_22.png)

```
📢 Colocaré mi objeto en formato JSON.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_23.png)

```
📢 Enviaré la petición.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_24.png)

```
📢 Veo que la respuesta es satisfactoria.
📢 El atributo error esta vacío.
📢 El resultado me lo envia en el "Body".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_25.png)

```
📢 Crearé el request para el servicio "buscar".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_26.png)

```
📢 Ingreso tipo y ruta de servicio.
📢 Le enviaré en vez de {id} el id del empleado que quiero.
📢 Para este ejemplo usare el id del empleado que acabo de crear.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_27.png)

```
📢 Me trae la respuesta correctamente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_28.png)

```
📢 Crearé el request para el servicio "eliminar".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_29.png)

```
📢 Ingreso tipo y ruta de servicio.
📢 Le enviaré en vez de {id} el id del empleado que quiero.
📢 Para este ejemplo usare el id del empleado que acabo de crear.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_36.png)

```
📢 Me trae la respuesta correctamente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_37.png)

```
📢 Crearé el request para el servicio "actualizar".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_41.png)

```
📢 Ingreso tipo y ruta de servicio.
📢 Ingreso el objeto en el "Body".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_38.png)

```
📢 Me trae la respuesta correctamente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_39.png)

```
📢 Hemos probado todos los servicios referente a Empleado de nuestro aplicativo.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/PRSER00001_40.png)

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/RETCT00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/XXXXX00001)
