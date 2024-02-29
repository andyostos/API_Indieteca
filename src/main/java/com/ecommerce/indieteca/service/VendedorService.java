package com.ecommerce.indieteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.indieteca.models.Vendedor;
import com.ecommerce.indieteca.repository.VendedorRepository;



@Service
public class VendedorService {
	
	  @Autowired
	  private VendedorRepository vendedorRepository;

	  public Optional<Vendedor> findVendedorById(long id) {
	    return vendedorRepository.findById(id);
	  }
	  
	 public Optional<Vendedor> findVendedorByNombre_de_usuario_v(String nombrev){
		  return vendedorRepository.findVendedorByNombrev(nombrev);
	  }

	  
	  public Vendedor saveVendedor(Vendedor vendedor) {
	    return vendedorRepository.save(vendedor);
	  }

	  public void deleteCliente(long id) {
		  vendedorRepository.deleteById(id);
	  }

	public List<Vendedor> findAllVendedores() {
		// TODO Auto-generated method stub
		return vendedorRepository.findAll();
	}

	public void deleteVendedor(long id) {
		// TODO Auto-generated method stub
		vendedorRepository.deleteById(id);
	}
}

