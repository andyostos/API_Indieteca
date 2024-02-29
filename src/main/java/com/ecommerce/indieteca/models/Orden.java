package com.ecommerce.indieteca.models;

import java.util.Set;

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
@Table(name = "orden")
public class Orden {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "id_orden")
	  private int id_orden;

	  @ManyToOne
	  @JoinColumn(name = "id_cliente", nullable = false)
	  private Cliente cliente;

	  @OneToMany(mappedBy = "orden")
	  private Set<Producto_has_Orden> producto_has_orden;

	  public Orden(){
		  //Default
	  }
	  
	  // Constructor with user parameter
	  
	 

	  // Utility method to add order detail to a book
	  public void addProducto_has_Orden1(Producto_has_Orden producto_has_orden) {
	    this.producto_has_orden.add(producto_has_orden);
	    producto_has_orden.setProducto2(this);
	  }

	public Orden(int id_orden, Cliente cliente, Set<Producto_has_Orden> producto_has_orden) {
		super();
		this.id_orden = id_orden;
		this.cliente = cliente;
		this.producto_has_orden = producto_has_orden;
	}

	// Utility method to remove order detail from a book
	  public void addProducto_has_Orden(Producto_has_Orden producto_has_orden) {
	    this.producto_has_orden.remove(producto_has_orden);
	    producto_has_orden.setProducto2(null);
	  }

	  // Getters and setters
	
	  public int getId_orden() {
			return id_orden;
		}

		public void setId_orden(int id_orden) {
			this.id_orden = id_orden;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public Set<Producto_has_Orden> getProducto_has_orden() {
			return producto_has_orden;
		}

		public void setProducto_has_orden(Set<Producto_has_Orden> producto_has_orden) {
			this.producto_has_orden = producto_has_orden;
		}
	
    //other methods
	public void setUser(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}


	public void remove(Orden orden) {
		// TODO Auto-generated method stub
		
	}
	
	public void setProducto(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	public void add(Orden orden) {
		// TODO Auto-generated method stub
		
	}

	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
