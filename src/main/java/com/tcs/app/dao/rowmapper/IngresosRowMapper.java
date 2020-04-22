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
    	ingresos.setId(resultSet.getLong("A_ID"));
    	ingresos.setMonto(resultSet.getBigDecimal("A_MONTO"));
    	Empleado empleado = new Empleado();
    	empleado.setId(resultSet.getLong("B_ID"));
    	empleado.setNombre(resultSet.getString("B_NOMBRE"));
    	empleado.setApellido(resultSet.getString("B_APELLIDO"));
    	empleado.setEdad(resultSet.getLong("B_EDAD"));
    	empleado.setSexo(resultSet.getString("B_SEXO"));
    	ingresos.setEmpleado(empleado);
    	
        return ingresos;
    }
}
