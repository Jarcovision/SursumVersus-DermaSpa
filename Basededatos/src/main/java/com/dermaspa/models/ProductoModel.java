package com.dermaspa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")

public class ProductoModel {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String nombreProducto;
	
	@Column(nullable = false)
	private Double precio;
	
	@Column(nullable = false)
	private Integer existencia;
	
	/***RELACIONES***/
//	@OneToMany(mappedBy = "productos") 
//	private ArrayList<DetalleOrdenModel> detalleOr;
	
	/******/
	
	public ProductoModel() {
	}

	public ProductoModel(Long id, String nombreProducto, Double precio, Integer existencia) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		//this.existencia = existencia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}  

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

/*	public Integer getExistencia() {
		return existencia;
	}

	public void setExistencia(Integer existencia) {
		this.existencia = existencia; 
	}

	public ArrayList<DetalleOrdenModel> getDetalleOr() {
		return detalleOr;
	}

	public void setDetalleOr(ArrayList<DetalleOrdenModel> detalleOr) {
		this.detalleOr = detalleOr;
	}
*/



	

	

	
		
}