package com.spring.boot.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.spring.boot.models.entity.Producto;

import com.spring.boot.models.dao.IProductoDao;

@Service 
public class ProductosServiceImp implements IproductoService{

	
	@Autowired
	private IProductoDao productoDao;
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}
	@Override
	@Transactional
	public void delete(long id) {
		productoDao.deleteById(id);
	}


}
