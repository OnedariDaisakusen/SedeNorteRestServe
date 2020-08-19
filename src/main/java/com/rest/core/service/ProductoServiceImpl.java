package com.rest.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.core.model.Producto;
import com.rest.core.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository reposotory;

	@Override
	public List<Producto> lista() {
		return reposotory.findAll();
	}

	@Override
	public Producto registrar(Producto producto) {
		return reposotory.save(producto);
	}

	@Override
	public Producto actualizar(Producto producto) {
		return reposotory.save(producto);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		reposotory.deleteById(id);
	}
	
	

}
