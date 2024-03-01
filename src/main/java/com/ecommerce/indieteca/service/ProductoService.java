package com.ecommerce.indieteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.indieteca.models.Producto;
import com.ecommerce.indieteca.repository.ProductoRepository;

@Service
public class ProductoService {
	
	 @Autowired
	  private ProductoRepository productoRepository;

	  // get
	  public List<Producto> findAllProductos() {
	    return productoRepository.findAll();
	  }

	  public Optional<Producto> findProductoById(long id) {
	    return productoRepository.findById(id);
	  }
	  
	
	  
	  public Optional<Producto> findProductoByCategoria(String categoria){
		  return productoRepository.findProductoByCategoria(categoria);
	  }

	  // post
	  public Producto saveBook(Producto producto) {
	    return productoRepository.save(producto);
	  }

	  // put
	  // You might want to write this one yourself
	

	  // delete
	  public void deleteBook(long id) {
		  productoRepository.deleteById(id);
	  }
	  // Additional methods as needed

	public Producto saveProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
		
	}

	public void deleteProducto(Object id) {
		// TODO Auto-generated method stub
		
	}

}
