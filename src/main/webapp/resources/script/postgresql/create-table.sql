--Tabla con empleado

CREATE TABLE Empleado (
  id integer NOT NULL,
  nombre varchar(20) NOT NULL,
  apellido varchar(20) NOT NULL,
  edad integer NOT NULL,
  sexo varchar(20) NOT NULL,
  PRIMARY KEY (id)
);

--Tabla detalle de ingresos de empleado

CREATE TABLE Ingresos (
  id integer NOT NULL,
  idEmpleado integer NOT NULL,
  monto DECIMAL(100,2) NOT NULL,
  PRIMARY KEY (id),
  foreign key (idEmpleado) references Empleado(id)
);