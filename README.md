# Taller String MVC                                                                       
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/INSTC00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/AGVST00001)

_Clase: RestController._

```
📢 Crearemos las siguientes clases para colocar nuestros controladores dedicados para servicios.
📢 Cuando nosotros creamos un servicio, lo hacemos con la finalidad de exponer nuestros métodos a otros aplicativos externos.
📢 Si yo quisiero que todos los demás aplicativos tengan acceso a mi lista de empleados, creo un servicio que de acceso a ese método.
📢 Estos métodos pueden ser:
  POST => Crear
  GET => Leer
  PUT => Crear o actualizar
  DELETE => Eliminar
  PATCH => Actualizar
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/RETCT00001_1.png)

```
📢 Lo primero que se realizará es agregar la anotación @RestController.
📢 La anotación Spring RestController se usa para crear servicios web RESTful usando Spring MVC. 
📢 Spring RestController se encarga de asignar los datos de solicitud al método de controlador de solicitud definido. 
📢 Una vez que el cuerpo de respuesta se genera a partir del método del controlador, lo convierte en respuesta JSON o XML.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/RETCT00001_2.png)

```
📢 Agregamos también la anotación @RequestMapping, explicado en el tema anterior.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/RETCT00001_3.png)

```
📢 Se agrega @Autowired para inyectar la dependencia del objeto implícitamente.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/RETCT00001_4.png)

```
📢 Considerar que al igual que el anterior controlador, se puede acceder a este con la ruta y tipo de llamada (GET, POST, PUT, etc).
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/RETCT00001_6.png)

```
📢 Se puede recoger los datos que se envian como algun tipo de dato. 
📢 Es posible también recoger un objeto.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/RETCT00001_7.png)

```
📢 Como es un servicio, no retornaremos hacia un jsp, html u otro recurso. 
📢 Lo que se retornara es simplemente una trama.
📢 Ahora usaremos la clase "Response" que creamos en el paquete utilitario.
📢 Como vemos, si no sucede un error se seteará el atributo "Body" con la data que queremos enviar.
  response.setBody(empleadoResponse);
📢 En caso suceda un error seteamos el atributo "Error". 
📢 Le envío un código de error que pueda usar el aplicativo que lo llama y el detalle del error.
  response.setError(new Error("ERROR_GENERICO", e.toString()));
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/RETCT00001_5.png)

```
📢 Como último paso, retornaré el objeto "Response".
  ResponseEntity.ok().body(response)
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/RETCT00001_8.png)

```
📢 Hacer lo mismo para IngresosRestController.
  https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/RETCT00001/src/main/java/com/tcs/app/restController/IngresosRestController.java
```

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/INSTC00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/AGVST00001)
