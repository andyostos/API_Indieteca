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

import com.ecommerce.indieteca.models.Orden;
import com.ecommerce.indieteca.service.OrdenService;



@RestController
@RequestMapping("/api/ordenes/")
public class OrdenController {
	@Autowired
	  private OrdenService ordenService;

	  @GetMapping
	  public List<Orden> getAllOrdenes() {
	    return ordenService.findAllOrdenes();
	  }

	  @GetMapping("{id}")
	  public ResponseEntity<Orden> getOrdenById(@PathVariable long id) {
	    return ordenService.findOrdenById(id)
	    .map(ResponseEntity::ok)
	    .orElse(ResponseEntity.notFound().build());
	  }

	  @PostMapping
	  public Orden createVendedor(@RequestBody Orden orden) {
	    return ordenService.saveOrden(orden);
	  }
	  
	  @DeleteMapping("{id}")
	  public ResponseEntity<Void> deleteOrden(@PathVariable long id){
		  return ordenService.findOrdenById(id)
				  .map(orden -> {
					  ordenService.deleteOrden(orden.getId());
				      return ResponseEntity.ok().<Void>build();
				    }).orElse(ResponseEntity.notFound().build());
	  }

	
}
