package com.dermaspa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detallep")

public class DetallePagoModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private Integer numeroTarjeta;
	
	@Column(nullable = false)
	private String titularTarjeta;
	
	@Column(nullable = false)
	private String expiracion;
	
	@Column(nullable = false)
	private Integer cvv;
	
	/***RELACIONES***/

	/******/

	public DetallePagoModel() {
	}
	
	public DetallePagoModel(Long id, Integer numeroTarjeta, String titularTarjeta, String expiracion, Integer cvv,
			DetalleOrdenModel detalleOr) {
		this.id = id;
		this.numeroTarjeta = numeroTarjeta;
		this.titularTarjeta = titularTarjeta;
		this.expiracion = expiracion;
		this.cvv = cvv;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getNumeroTarjeta() {
		return numeroTarjeta;
	}
	
	public void setNumeroTarjeta(Integer numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	
	public String getTitularTarjeta() {
		return titularTarjeta;
	}
	
	public void setTitularTarjeta(String titularTarjeta) {
		this.titularTarjeta = titularTarjeta;
	}
	
	public String getExpiracion() {
		return expiracion;
	}
	
	public void setExpiracion(String expiracion) {
		this.expiracion = expiracion;
	}
	
	public Integer getCvv() {
		return cvv;
	}
	
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	

}
	
	
	
	
	
	
	
	
	
