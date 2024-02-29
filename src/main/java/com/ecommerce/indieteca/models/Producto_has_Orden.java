package com.ecommerce.indieteca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto_has_orden")
public class Producto_has_Orden {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="id_producto_has_orden")
	  private int id_producto_has_orden;

	  @ManyToOne
	  @JoinColumn(name = "id_orden")
	  private Orden orden;

	  @ManyToOne
	  @JoinColumn(name = "id_producto")
	  private Producto producto;

	  
	  public Producto_has_Orden() {
		  //Default
	  }


	public Producto_has_Orden(int id_producto_has_orden, Orden orden, Producto producto) {
		super();
		this.id_producto_has_orden = id_producto_has_orden;
		this.orden = orden;
		this.producto = producto;
	}

	  //Getters Setters
	public int getId_producto_has_orden() {
		return id_producto_has_orden;
	}


	public void setId_producto_has_orden(int id_producto_has_orden) {
		this.id_producto_has_orden = id_producto_has_orden;
	}


	public Orden getOrden() {
		return orden;
	}


	public void setOrden(Orden orden) {
		this.orden = orden;
	}


	public Producto getProducto() {
		return producto;
	}

	//Other methods
	public void setProducto2(Object object) {
		// TODO Auto-generated method stub
		
	}

	}

	
	
	

