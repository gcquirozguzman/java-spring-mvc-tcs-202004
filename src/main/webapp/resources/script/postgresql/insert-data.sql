insert  into Empleado
(id,nombre,apellido,edad,sexo) 
values 
(1,'Nombre 1','Apellido 1',21,'Masculino'),
(2,'Nombre 2','Apellido 2',22,'Masculino'),
(3,'Nombre 3','Apellido 3',23,'Masculino');

insert  into Ingresos
(id,idEmpleado,monto) 
values 
(1,1, 400.0),
(2,1, 800.0),
(3,1, 1000.0),
(4,2, 1200.0),
(5,2, 2000.0),
(6,3, 2000.0),
(7,3, 100.0);