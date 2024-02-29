package com.ecommerce.indieteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.indieteca.models.Orden;

//This marker is used to indicate that the interface is a repository
//and a component of the Spring context.
@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long> {
// No need to define findById(Long id) as it's already provided.
// Example custom query method

// Additional custom methods as required for your application.
}
