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

import com.ecommerce.indieteca.models.Vendedor;
import com.ecommerce.indieteca.service.VendedorService;

@RestController
@RequestMapping("/api/vendedores/")
public class VendedorController {
	@Autowired
	  private VendedorService vendedorService;

	  @GetMapping
	  public List<Vendedor> getAllVendedores() {
	    return vendedorService.findAllVendedores();
	  }

	  @GetMapping("{id}")
	  public ResponseEntity<Vendedor> getVendedorById(@PathVariable long id) {
	    return vendedorService.findVendedorById(id)
	    .map(ResponseEntity::ok)
	    .orElse(ResponseEntity.notFound().build());
	  }

	  @PostMapping
	  public Vendedor createVendedor(@RequestBody Vendedor vendedor) {
	    return vendedorService.saveVendedor(vendedor);
	  }
	  
	  @DeleteMapping("{id}")
	  public ResponseEntity<Void> deleteVendedor(@PathVariable long id){
		  return vendedorService.findVendedorById(id)
				  .map(vendedor -> {
					  vendedorService.deleteVendedor((long) vendedor.getId());
				      return ResponseEntity.ok().<Void>build();
				    }).orElse(ResponseEntity.notFound().build());
	  }

}
