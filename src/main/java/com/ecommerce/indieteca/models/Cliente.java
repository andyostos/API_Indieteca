package com.ecommerce.indieteca.models;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// imports

@Entity
@Table(name = "cliente")

public class Cliente {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "id_cliente")
	  private int id_cliente;

	  @Column(name = "primer_nombre", nullable = false, length = 45, unique = true)
	  private String primer_nombre;
	  
	  @Column(name = "primer_apellido", nullable = false, length = 45, unique = true)
	  private String primer_apellido;
	  
	  @Column(name = "segundo_apellido", nullable = false, length = 45, unique = true)
	  private String segundo_apellido;
	  
	  @Column(name = "correo_electronico", nullable = false, length = 45, unique = true)
	  private String correo_electronico;
	  
	  @Column(name = "direccion", nullable = false, length = 45, unique = true)
	  private String direccion;
	  
	  @Column(name = "edad", nullable = false, length = 45, unique = true)
	  private int edad;
	  
	  @Column(name = "nombre_de_usuario", nullable = false, length = 45, unique = true)
	  private String nombre_de_usuario;
	  
	  @Column(name = "imagen_perfil", nullable = false, length = 200, unique = true)
	  private String imagen_perfil;
	  
	  @Column(name = "contrasena", nullable = false, length = 100, unique = true)
	  private String contrasena;
	  
	  @OneToMany(mappedBy = "cliente")
	  private Set<Orden> orden = new HashSet<>();

	  public Cliente() {
		  //Default
	  }

	  // Constructor with parameters
	 
	  public Cliente(int id_cliente, String primer_nombre, String primer_apellido, String segundo_apellido,
				String correo_electronico, String direccion, int edad, String nombre_de_usuario, String imagen_perfil,
				String contrasena, Set<Orden> orden) {
			super();
			this.id_cliente = id_cliente;
			this.primer_nombre = primer_nombre;
			this.primer_apellido = primer_apellido;
			this.segundo_apellido = segundo_apellido;
			this.correo_electronico = correo_electronico;
			this.direccion = direccion;
			this.edad = edad;
			this.nombre_de_usuario = nombre_de_usuario;
			this.imagen_perfil = imagen_perfil;
			this.contrasena = contrasena;
			this.orden = orden;
		}

	

	  // Methods to add and remove orders if necessary
	  public void addOrden(Orden orden) {
	    orden.add(orden);
	    orden.setUser(this);
	  }

	 

	public void removeOrder(Orden orden) {
	    orden.remove(orden);
	    orden.setUser(null);
	  }

	public int getId_cliente() {
		return id_cliente;
	}


	// Getters and setters
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre_de_usuario() {
		return nombre_de_usuario;
	}

	public void setNombre_de_usuario(String nombre_de_usuario) {
		this.nombre_de_usuario = nombre_de_usuario;
	}

	public String getImagen_perfil() {
		return imagen_perfil;
	}

	public void setImagen_perfil(String imagen_perfil) {
		this.imagen_perfil = imagen_perfil;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Set<Orden> getOrden() {
		return orden;
	}

	public void setOrden(Set<Orden> orden) {
		this.orden = orden;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}


	  // Other methods...
	
}


	


