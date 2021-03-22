package com.spring.boot.models.services;

 import java.util.List;

import com.spring.boot.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save (Cliente cliente);
	
	public void delete(long id);

}
