package com.ecommerce.indieteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.indieteca.models.Orden;
import com.ecommerce.indieteca.repository.OrdenRepository;

@Service
public class OrdenService {

	@Autowired
	  private OrdenRepository ordenRepository;

	  public Optional<Orden> findOrdenById(long id) {
	    return ordenRepository.findById(id);
	  }

	  public Orden saveOrden(Orden orden) {
	    return ordenRepository.save(orden);
	  }

	  public void deleteOrden(long id) {
		  ordenRepository.deleteById(id);
	  }

	public List<Orden> findAllOrdenes() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
