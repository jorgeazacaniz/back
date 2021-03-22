package com.spring.boot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
