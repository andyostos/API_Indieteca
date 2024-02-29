package com.ecommerce.indieteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.indieteca.models.Cliente;

import com.ecommerce.indieteca.service.ClienteService;


@RestController
@RequestMapping("/api/clientes/")
public class ClienteController {

	@Autowired
	  private ClienteService clienteService;

	  @GetMapping
	  public List<Cliente> getAllClientes() {
	    return clienteService.findAllClientes();
	  }

	  @GetMapping("{id}")
	  public ResponseEntity<Cliente> getClienteById(@PathVariable long id) {
	    return clienteService.findClienteById(id)
	    .map(ResponseEntity::ok)
	    .orElse(ResponseEntity.notFound().build());
	  }

	  @PostMapping
	  public Cliente createCliente(@RequestBody Cliente cliente) {
	    return clienteService.saveCliente(cliente);
	  }
	  
	  @DeleteMapping("{id}")
	  public ResponseEntity<Void> deleteCliente(@PathVariable long id){
		  return clienteService.findClienteById(id)
				  .map(cliente -> {
					  clienteService.deleteCliente((long) cliente.getId());
				      return ResponseEntity.ok().<Void>build();
				    }).orElse(ResponseEntity.notFound().build());
	  }
}
