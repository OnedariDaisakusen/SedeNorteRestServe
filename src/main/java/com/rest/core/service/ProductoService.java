package com.rest.core.service;

import java.util.List;

import com.rest.core.model.Producto;

public interface ProductoService {

	List<Producto> lista();
	Producto registrar(Producto producto);
	Producto actualizar(Producto producto);
	void eliminar(int id);

	
}
