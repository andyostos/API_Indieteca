/*package com.ecommerce.indieteca.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.ecommerce.indieteca.models.Cliente;
import com.ecommerce.indieteca.repository.ClienteRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Cliente cliente = clienteRepository.findClienteByNombre(username)
			    .orElseThrow(() -> new UsernameNotFoundException("Username not found"));

			    return org.springframework.security.core.userdetails.User
			    .withUsername(cliente.getNombre_de_usuario())
			    .password(cliente.getContrasena())
			    .authorities(new ArrayList<>())
			    .accountExpired(false)
			    .accountLocked(false)
			    .credentialsExpired(false)
			    .disabled(false)
			    .build();
	}

}
*/
