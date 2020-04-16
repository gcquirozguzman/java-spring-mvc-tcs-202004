# Taller String MVC                                                                       
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/ENUTL00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/RETCT00001)

_Clase: Controller._

```
📢 Ahora crearemos los controladores que se usarán para retornar los datos desde el servidor a la vista.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_1.png)

```
📢 El controlador debe tener la anotacion @Controller para que sea reconocido.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_2.png)

```
📢 He agregado la anotación @RequestMapping para que podamos acceder a los métodos de este controlador con el nombre "empleados".
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_3.png)

```
📢 Por ejemplo, si quiero llamar al método listar, lo debo llamar así:
  http://localhost:8080/ProyectoSpringMVC/empleados/listar
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_4.png)

```
📢 Cuando llamemos al service no olvidar colocar @Autowired para permitir el acceso.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_5.png)

```
📢 Si nos damos cuenta, hasta ahora hemos visto como llamar a los métodos que tenemos en el controlador.
📢 La ruta vendría a ser el nombre de cada uno, el cual no se puede repetir.
📢 Si se repite, el aplicativo nos daría un error.

📢 Estos métodos pueden ser:
  POST => Crear
  GET => Leer
  PUT => Crear o actualizar
  DELETE => Eliminar
  PATCH => Actualizar
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_6.png)

```
📢 Desde la vista podemos recibir datos en la ruta. Por ejemplo, es posible que accedan al método así:
    http://localhost:8080/ProyectoSpringMVC/empleados/editar/23
📢 El id vendría a ser 23 en este ejemplo.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_7.png)

```
📢 También nos pueden enviar el objeto completo, lo recibimos así.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_8.png)

```
📢 Ahora veremos como almacenar datos para envialos a la vista.
📢 Podemos enviar datos en:
  Model o HttpSession
📢 Ambos son como medios de traslado de datos desde back al front.
📢 La pricipal diferencia es su tiempo de vida.
📢 Si yo guardo un dato en un Model, el servidor tomará el valor y lo enviará a la vista.
📢 Si yo guardo un dato en un HttpSession, el servidor guardará este valor en su memoria y luego lo enviará a la vista.
📢 El valor guardado en HttpSession estará guardando tu valor hasta:
  Cuando se termina la sesión del usuario.
  Cuando se apaga el servidor.
  Cuando de forma manual lo eliminamos.
📢 Podemos eliminar una variable HttpSession así:
  session.removeAttribute("nombre_de_la_variable");
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_9.png)

```
📢 Lo último que veremos será será indicar hacia donde queremos enviar estos valores que estamos almacenando.
📢 Podemos indicar que retorne en un ruta en donde se cuentre nuestro jsp, html o donde queremos imprimir los datos:
  return "empleado/detalle";
📢 O podemos indicar que se dirija a un método del controlador. Por ejemplo, a listar:
  return "redirect:listar"; 
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_10.png)

```
📢 Aprovecharé para cambiar el valor que estoy enviando "accion" desde el Enum que creamos en utilitarios.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/CONTR00001_11.png)


```
📢 Hacer lo mismo para IngresosController.
  https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/CONTR00001/src/main/java/com/tcs/app/controller/IngresosController.java
```

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/ENUTL00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/RETCT00001)
