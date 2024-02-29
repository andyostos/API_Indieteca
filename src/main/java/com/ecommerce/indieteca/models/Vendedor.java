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

@Entity
@Table(name = "vendedor")

public class Vendedor {

		  @Id
		  @GeneratedValue(strategy = GenerationType.IDENTITY)
		  @Column(name = "id_vendedor")
		  private int id_vendedor;

		  @Column(name = "primer_nombre_v", nullable = false, length = 45, unique = true)
		  private String primer_nombre_v;
		  
		  @Column(name = "primer_apellido_v", nullable = false, length = 45, unique = true)
		  private String primer_apellido_v;
		  
		  @Column(name = "segundo_apellido_v", nullable = false, length = 45, unique = true)
		  private String segundo_apellido_v;
		  
		  @Column(name = "correo_electronico_v", nullable = false, length = 45, unique = true)
		  private String correoElectronico;
		  
		  @Column(name = "ciudad_v", nullable = false, length = 45, unique = true)
		  private String ciudad_v;
		  
		  @Column(name = "edad_v", nullable = false, length = 45, unique = true)
		  private int edad_v;
		  
		  @Column(name = "rfc", nullable = false, length = 45, unique = true)
		  private String rfc;
		  
		  @Column(name = "categoria_v", nullable = false, length = 45, unique = true)
		  private String categoria_v;
		  
		  @Column(name = "imagen_perfil_v", nullable = false, length = 200, unique = true)
		  private String imagen_perfil_v;
		  
		  @Column(name = "nombre_de_usuario_v", nullable = false, length = 45, unique = true)
		  private String nombre_de_usuario_v;
		  
		  @Column(name = "contrasena_v", nullable = false, length = 45, unique = true)
		  private String contrasena_v;
		  
		  @OneToMany(mappedBy = "vendedor")
		  private Set<Producto> producto = new HashSet<>();

		  public Vendedor() {
			  //Default
		  }

		//constructor
	
		  public Vendedor(int id_vendedor, String primer_nombre_v, String primer_apellido_v, String segundo_apellido_v,
					String correoElectronico, String ciudad_v, int edad_v, String rfc, String categoria_v,
					String imagen_perfil_v, String nombre_de_usuario_v, String contrasena_v, Set<Producto> producto) {
				super();
				this.id_vendedor = id_vendedor;
				this.primer_nombre_v = primer_nombre_v;
				this.primer_apellido_v = primer_apellido_v;
				this.segundo_apellido_v = segundo_apellido_v;
				this.correoElectronico = correoElectronico;
				this.ciudad_v = ciudad_v;
				this.edad_v = edad_v;
				this.rfc = rfc;
				this.categoria_v = categoria_v;
				this.imagen_perfil_v = imagen_perfil_v;
				this.nombre_de_usuario_v = nombre_de_usuario_v;
				this.contrasena_v = contrasena_v;
				this.producto = producto;
			} 
		  
		// Methods to add and remove orders if necessary
		  public void addProducto(Producto producto) {
			  producto.add(producto);
			  producto.setVendedor(this);
		  }

		
		public void removeProducto(Producto producto) {
			  producto.remove(producto);
			  producto.setVendedor(null);
		  }

		//Getters and Setters
		public int getId_vendedor() {
			return id_vendedor;
		}

		public void setId_vendedor(int id_vendedor) {
			this.id_vendedor = id_vendedor;
		}

		public String getPrimer_nombre_v() {
			return primer_nombre_v;
		}

		public void setPrimer_nombre_v(String primer_nombre_v) {
			this.primer_nombre_v = primer_nombre_v;
		}

		public String getPrimer_apellido_v() {
			return primer_apellido_v;
		}

		public void setPrimer_apellido_v(String primer_apellido_v) {
			this.primer_apellido_v = primer_apellido_v;
		}

		public String getSegundo_apellido_v() {
			return segundo_apellido_v;
		}

		public void setSegundo_apellido_v(String segundo_apellido_v) {
			this.segundo_apellido_v = segundo_apellido_v;
		}

		public String getCorreoElectronico() {
			return correoElectronico;
		}

		public void setCorreoElectronico(String correoElectronico) {
			this.correoElectronico = correoElectronico;
		}

		public String getCiudad_v() {
			return ciudad_v;
		}

		public void setCiudad_v(String ciudad_v) {
			this.ciudad_v = ciudad_v;
		}

		public int getEdad_v() {
			return edad_v;
		}

		public void setEdad_v(int edad_v) {
			this.edad_v = edad_v;
		}

		public String getRfc() {
			return rfc;
		}

		public void setRfc(String rfc) {
			this.rfc = rfc;
		}

		public String getCategoria_v() {
			return categoria_v;
		}

		public void setCategoria_v(String categoria_v) {
			this.categoria_v = categoria_v;
		}

		public String getImagen_perfil_v() {
			return imagen_perfil_v;
		}

		public void setImagen_perfil_v(String imagen_perfil_v) {
			this.imagen_perfil_v = imagen_perfil_v;
		}

		public String getNombre_de_usuario_v() {
			return nombre_de_usuario_v;
		}

		public void setNombre_de_usuario_v(String nombre_de_usuario_v) {
			this.nombre_de_usuario_v = nombre_de_usuario_v;
		}

		public String getContrasena_v() {
			return contrasena_v;
		}

		public void setContrasena_v(String contrasena_v) {
			this.contrasena_v = contrasena_v;
		}

		public Set<Producto> getProducto() {
			return producto;
		}

		public void setProducto(Set<Producto> producto) {
			this.producto = producto;
		}

		public Object getId() {
			// TODO Auto-generated method stub
			return null;
		}


		
		// Getters setters
			 
		
		  
}
