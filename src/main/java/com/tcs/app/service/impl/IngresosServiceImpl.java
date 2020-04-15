package com.tcs.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.app.dao.IngresosDao;
import com.tcs.app.model.Ingresos;
import com.tcs.app.service.IngresosService;

@Component
public class IngresosServiceImpl implements IngresosService{

    @Autowired
    private IngresosDao ingresosDao;

	@Override
	public Ingresos create(Ingresos ingresos) {
		return ingresosDao.create(ingresos);
	}

	@Override
	public List<Ingresos> list() {
		return ingresosDao.list();
	}

	@Override
	public void delete(Long idEmpleado) {
		ingresosDao.delete(idEmpleado);
	}

	@Override
	public Ingresos update(Ingresos ingresos) {
		return ingresosDao.update(ingresos);
	}

	@Override
	public Ingresos get(Long idEmpleado) {
		return ingresosDao.get(idEmpleado);
	}

}
