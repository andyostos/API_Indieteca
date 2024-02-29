/*package com.ecommerce.indieteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.indieteca.models.JwtResponse;
import com.ecommerce.indieteca.repository.ClienteRepository;
import com.ecommerce.indieteca.utils.JwtUtils;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	// These references are implemented inside /signup
	// @Autowired
	//  private ClienteRepository clienteRepository;

	//  @Autowired
	//  private PasswordEncoder passwordEncoder;

	  @Autowired
	  private AuthenticationManager authenticationManager;

	  @Autowired
	  private JwtUtils jwtUtils;

	  @PostMapping("/login")
	  public ResponseEntity<?> authenticateUser(
	    @RequestParam("username") String username,
	    @RequestParam("password") String password
	  ) {
	    Authentication authentication = authenticationManager.authenticate(
	      new UsernamePasswordAuthenticationToken(username, password)
	    );
	    SecurityContextHolder.getContext().setAuthentication(authentication);
	    String jwt = jwtUtils.generateJwtToken(authentication);

	    return ResponseEntity.ok(new JwtResponse(jwt));
	  }

	 
}
*/
