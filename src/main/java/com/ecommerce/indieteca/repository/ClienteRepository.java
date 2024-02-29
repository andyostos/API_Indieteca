package com.ecommerce.indieteca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.ecommerce.indieteca.models.Cliente;


	@Repository
	public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	
		@Query("SELECT p FROM Cliente p WHERE p.nombre_de_usuario = :nombre")
	  Optional<Cliente> findClienteByNombre(String nombre);


	  // Additional custom methods as required for your application.
	}