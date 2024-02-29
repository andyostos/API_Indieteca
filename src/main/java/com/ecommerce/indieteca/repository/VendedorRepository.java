package com.ecommerce.indieteca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.ecommerce.indieteca.models.Vendedor;



@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
  // No need to define findById(Long id) as it's already provided.
  // Example custom query method
	@Query("SELECT p FROM Vendedor p WHERE p.nombre_de_usuario_v = :nombrev")
	Optional<Vendedor> findVendedorByNombrev(String nombrev);
	

  // Additional custom methods as required for your application.
}