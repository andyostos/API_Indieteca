/*package com.ecommerce.indieteca.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.ecommerce.indieteca.service.CustomUserDetailsService;
import com.ecommerce.indieteca.utils.JwtUtils;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthTokenFilter extends OncePerRequestFilter{

	@Autowired
	private JwtUtils  jwtUtils;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			String jwt = parseJwt(request);
				String username = jwtUtils.getUserNameFromJwtToken(jwt);
				UserDetails userDetails = customUserDetailsService.loadUserByUsername(username);
				if (jwt != null && jwtUtils.validateJwtToken(jwt)) {
				UsernamePasswordAuthenticationToken authentication =
						new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
				SecurityContextHolder.getContext().setAuthentication(authentication);				
			}
		}catch (Exception e) {
			logger.error("Cannot set user auth", e);
		}
		filterChain.doFilter(request, response);
		}
		private String parseJwt(HttpServletRequest request) {
		String headerAuth = request.getHeader("Authorization");
		return(headerAuth != null && headerAuth.startsWith("Bearer "))
				? headerAuth.substring(7) : null;
		
	}

}
*/