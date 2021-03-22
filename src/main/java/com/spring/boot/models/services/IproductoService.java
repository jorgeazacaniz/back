package com.spring.boot.models.services;

import java.util.List;

import com.spring.boot.models.entity.Producto;

public interface IproductoService {
	
	public List<Producto> findAll();

	
	public Producto findById(Long id);
	
	public Producto save (Producto producto);
	
	public void delete(long id);

}
