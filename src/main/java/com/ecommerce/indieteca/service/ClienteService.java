package com.ecommerce.indieteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.indieteca.models.Cliente;
import com.ecommerce.indieteca.repository.ClienteRepository;

@Service
public class ClienteService {
	 @Autowired
	  private ClienteRepository clienteRepository;

	  public Optional<Cliente> findClienteById(long id) {
	    return clienteRepository.findById(id);
	  }
	  
	  public Optional<Cliente> findClienteByNombre(String nombre){
		  return clienteRepository.findClienteByNombre(nombre);
	  }

	 
	  
	  public Cliente saveCliente(Cliente cliente) {
	    return clienteRepository.save(cliente);
	  }

	  public void deleteCliente(long id) {
		    clienteRepository.deleteById(id);
		}

	public List<Cliente> findAllClientes() {
		// TODO Auto-generated method stub
		 return clienteRepository.findAll();
	}
}
