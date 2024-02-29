/*package com.ecommerce.indieteca.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	
	
	 @Bean
	  public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
	    return authenticationConfiguration.getAuthenticationManager();
	  }

	  @Bean
	  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http
	      .csrf(csrf -> csrf.disable())
	      .authorizeHttpRequests(authorize -> authorize
	        .requestMatchers(HttpMethod.POST, "/api/auth/**").permitAll()
	        .requestMatchers(HttpMethod.GET, "/api/**").permitAll()
	        .anyRequest().authenticated()
	      )
	      .addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);

	    return http.build();
	  }

	  @Bean
	  public AuthTokenFilter authenticationJwtTokenFilter() {
	    return new AuthTokenFilter();
	  }

	  @Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }

}
*/
