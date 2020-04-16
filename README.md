# Taller String MVC                                                                       
### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/RETCT00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/PRSER00001)

_Clase: Agregando Vistas._

```
📢 Crearemos los siguientes recursos.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_1.png)

```
📢 Es posible que dé un error. Podemos resolverlo agregando el servidor en propiedades.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_2.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_3.png)

```
📢 Actualizamos el proyecto.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_4.png)

```
📢 En caso no se solucione el error ingresamos a esta opción.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_5.png)

```
📢 En el area de validación quitamos los siguientes check para que no valide nuestros archivos jsp.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_6.png)

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_7.png)

```
📢 Vemos que se ha solucionado.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_8.png)

```
📢 En home.jsp agregaré las siguientes opciones.
📢 En la propiedad href estoy indicando a que método de controlador quiero llamar.
📢 La siguiente línea llama al método del controlador que tenga la ruta "empleados/nuevo". Lo mismo con los demás.
  <a href="empleados/nuevo">Agregar Empleado</a>
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_9.png)

```
📢 En vista.jsp listaré todos los valores de "listadoEmpleado".
📢 Desde el controlador lo enviamos como 
  model.addAttribute("listadoEmpleado",list);
📢 En el JSP solo lo consumimos.
📢 En la cabecera mostraré un texto cuando "error" no esta vacío.
📢 Recordar que también enviamos el dato "error deste el controlador:
  model.addAttribute("error", "Registro esta asociado a otro.");
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_10.png)

```
📢 En detalle.jsp colocaremos los dato.
📢 "accion" es un valor que se obtiene del controlador.
📢 Para que el formulario obtenga los valores se debe indicar en value. Se llama el modelo enviado "empleado" y sus atributos.
📢 En la propiedad name se indica con que valor llegara al controlador.
📢 Por último, en el formulario se indica el método (POST) y a que ruta del controlador se llamará.
```

![Error: imagen no ha sido cargada](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/master/imagenes/AGVST00001_11.png)

```
📢 Se puede ver la implementación de la parte ingresos a continuación.
📢 Detalle:
  https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/AGVST00001/src/main/webapp/WEB-INF/views/ingresos/detalle.jsp
📢 Vista:
  https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/blob/AGVST00001/src/main/webapp/WEB-INF/views/ingresos/vista.jsp
```

#### JSTL

```
📢 Este consumo de valores desde Controller es posible con la librería que estamos indicando en el JSP.
📢 Se puede ver en cada JSP en la parte superior que se está importando la etiqueta.
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
📢 Cuando quiero obtener un valor solo lo llamo así
  ${nombre_de_valor}
📢 También puedo hacer otras acciones como las que hemos implementado en el JSP:
  For -> <c:forEach>
  If -> <c:if>
📢 Exite otras etiquetas que nos pueden ayudar cuando desarrollemos:
  https://www.javatpoint.com/jstl
```

#### Probando

```
📢 Lo último que queda es probar el aplicativo. Para esto ingresamos a la ruta:
  localhost:8080/ProyectoSpringMVC
```

## Autores ✒️

* **Gian Carlo Quiroz Guzmán** - *Proyecto Demo* - [gcquirozguzman](https://github.com/gcquirozguzman)

⌨️ con ❤️ por [gcquirozguzman](https://github.com/gcquirozguzman) 😊

### 📥 [Página Anterior](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/RETCT00001)          🗃️ [Página principal](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004)          📤 [Página Siguiente](https://github.com/gcquirozguzman/java-spring-mvc-tcs-202004/tree/PRSER00001)
