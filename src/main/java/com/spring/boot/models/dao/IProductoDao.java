package com.spring.boot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
