package com.tcs.app.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.tcs.app.dao.EmpleadoDao;
import com.tcs.app.model.Empleado;
import com.tcs.app.service.EmpleadoService;

@Component
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoDao empleadoDao;

	@Override
	public Empleado create(Empleado empleado) {
		return empleadoDao.create(empleado);
	}

	@Override
	public List<Empleado> list() {
		return empleadoDao.list();
	}

	@Override
	public void delete(Long idEmpleado) {
		empleadoDao.delete(idEmpleado);
	}

	@Override
	public Empleado update(Empleado empleado) {
		return empleadoDao.update(empleado);
	}

	@Override
	public Empleado get(Long idEmpleado) {
		return empleadoDao.get(idEmpleado);
	}

}
