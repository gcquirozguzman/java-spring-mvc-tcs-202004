package com.tcs.app.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.app.model.Empleado;
import com.tcs.app.model.Ingresos;

public class IngresosRowMapper implements RowMapper<Ingresos> {
    @Override
    public Ingresos mapRow(ResultSet resultSet, int i) throws SQLException {
    	Ingresos ingresos = new Ingresos();
    	ingresos.setId(resultSet.getLong("ID"));
    	ingresos.setMonto(resultSet.getBigDecimal("MONTO"));
    	Empleado empleado = new Empleado();
    	empleado.setId(resultSet.getLong("IDEMPLEADO"));
    	empleado.setNombre(resultSet.getString("NOMBRE"));
    	empleado.setApellido(resultSet.getString("APELLIDO"));
    	empleado.setEdad(resultSet.getLong("EDAD"));
    	empleado.setSexo(resultSet.getString("SEXO"));
    	ingresos.setEmpleado(empleado);
    	
        return ingresos;
    }
}
