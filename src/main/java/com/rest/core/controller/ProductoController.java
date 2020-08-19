package com.rest.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.core.model.Producto;
import com.rest.core.service.ProductoService;

@RestController
@RequestMapping(value = "/rest")
public class ProductoController {

	@Autowired
	ProductoService service;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> listaProducto(){
		return service.lista();
	}
	
	@RequestMapping(value = "/registrar", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Producto registrar(@RequestBody Producto producto){
		return service.registrar(producto);
	}
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Producto actualizar(@RequestBody Producto producto){
		return service.registrar(producto);
	}
	
	@RequestMapping(value = "/eliminar", method = RequestMethod.POST)
	public void eliminar(int idproducto){
		 service.eliminar(idproducto);
	}
}
