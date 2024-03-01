package com.ecommerce.indieteca.models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private int id_productod;
	
	@Column(name = "nombre_del_producto", nullable = false, length = 150)
	private String nombre_del_producto;
	
	@Column(name = "precio", nullable = false, length = 150)
	private double precio;
	
	@Column(name = "existencia", nullable = false, length = 150)
	private int existencia;
	
	@Column(name = "categoria", nullable = false, length = 150)
	private String categoria;
	
	@Column(name = "tipo", nullable = false, length = 150)
	private String tipo;
	
	@Column(name = "descripcion", nullable = false, length = 300)
	private String descripcion;
	
	@Column(name = "imagen_producto", nullable = false, length = 300)
	private String imagen_producto;
	
	// @ManyToOne
	@JoinColumn(name = "id_vendedor", nullable = false)
	// @JsonIgnore
	private Vendedor vendedor;
	
	@OneToMany(mappedBy = "producto")
	private Set<Producto_has_Orden> producto_has_orden;
	
	// Constructor
	
	 public Producto () {
		    // default
		  }

	public Producto(int id_productod, String nombre_del_producto, double precio, int existencia, String categoria,
			String tipo, String descripcion, String imagen_producto, Vendedor vendedor,
			Set<Producto_has_Orden> producto_has_orden) {
		super();
		this.id_productod = id_productod;
		this.nombre_del_producto = nombre_del_producto;
		this.precio = precio;
		this.existencia = existencia;
		this.categoria = categoria;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.imagen_producto = imagen_producto;
		this.vendedor = vendedor;
		this.producto_has_orden = producto_has_orden;
	}


	//getters and setter 
	
	public int getId_productod() {
		return id_productod;
	}

	public void setId_productod(int id_productod) {
		this.id_productod = id_productod;
	}

	public String getNombre_del_producto() {
		return nombre_del_producto;
	}

	public void setNombre_del_producto(String nombre_del_producto) {
		this.nombre_del_producto = nombre_del_producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen_producto() {
		return imagen_producto;
	}

	public void setImagen_producto(String imagen_producto) {
		this.imagen_producto = imagen_producto;
	}

	public Set<Producto_has_Orden> getProducto_has_orden() {
		return producto_has_orden;
	}

	public void setProducto_has_orden(Set<Producto_has_Orden> producto_has_orden) {
		this.producto_has_orden = producto_has_orden;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	// Utility method to add order detail to a book
		  public void addProducto_has_Orden(Producto_has_Orden producto_has_orden) {
		  this.producto_has_orden.add(producto_has_orden);
		  producto_has_orden.setProducto2(this);
		  }
	
	// Utility method to remove order detail from a book
	  public void removeProducto_has_Orden(Producto_has_Orden producto_has_orden) {
	  this.producto_has_orden.remove(producto_has_orden);
	  producto_has_orden.setProducto2(null);
	  }

	  
	//other methods
	public void add(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	public void setVendedor(Vendedor vendedor) {
		// TODO Auto-generated method stub
		
	}

	public void setVendedor(Object vendedor) {
		// TODO Auto-generated method stub
		
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
