package com.ecommerce.indieteca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ecommerce.indieteca.models.Producto;


	// This marker is used to indicate that the interface is a repository
	// and a component of the Spring context.
	@Repository
	public interface ProductoRepository extends JpaRepository<Producto, Long> {
	  // No need to define findById(Long id) as it's already provided.
	  // Example custom query method
		
	Optional<Producto> findProductoByCategoria(String categoria);

	  // Additional custom methods as required for your application.
	}

