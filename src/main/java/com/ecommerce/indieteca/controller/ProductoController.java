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

import com.ecommerce.indieteca.models.Producto;
import com.ecommerce.indieteca.service.ProductoService;

@RestController
@RequestMapping("/api/productos/")

public class ProductoController {
	@Autowired
	  private ProductoService productoService;

	  @GetMapping
	  public List<Producto> getAllProductos() {
	    return productoService.findAllProductos();
	  }

	  @GetMapping("{id}")
	  public ResponseEntity<Producto> getProductoById(@PathVariable long id) {
	    return productoService.findProductoById(id)
	    .map(ResponseEntity::ok)
	    .orElse(ResponseEntity.notFound().build());
	  }

	  @PostMapping
	  public Producto createProducto(@RequestBody Producto producto) {
	    return productoService.saveProducto(producto);
	  }
	  
	  @DeleteMapping("{id}")
	  public ResponseEntity<Void> deleteProducto(@PathVariable long id){
		  return productoService.findProductoById(id)
				  .map(producto -> {
				      productoService.deleteProducto(producto.getId());
				      return ResponseEntity.ok().<Void>build();
				    }).orElse(ResponseEntity.notFound().build());
	  }
	  
	

}
