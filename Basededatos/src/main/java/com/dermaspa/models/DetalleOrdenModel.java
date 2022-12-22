package com.dermaspa.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleo")

public class DetalleOrdenModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(unique = true, nullable = false)
    private Long id;
    
	@Column(nullable = false)
    private Integer cantidadProductos;
    
    @Column(nullable = false)
    private Double totalCompra;
    
    /***RELACIONES***/
    @ManyToOne/*(cascade = CascadeType.ALL)*/
    private ProductoModel productos;
    
    @OneToOne/*(cascade = CascadeType.ALL, fetch = FetchType.LAZY)*/
    private OrdenModel orden;
    
    @OneToOne/*(cascade = CascadeType.ALL, fetch = FetchType.LAZY)*/
    private DetallePagoModel detallepa;
    
       
    
    /******/

    public DetalleOrdenModel() {
    }

    public DetalleOrdenModel(Long id, Integer cantidadProductos, Double totalCompra, OrdenModel orden) {
        this.id = id;
        this.cantidadProductos = cantidadProductos;
        this.totalCompra = totalCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }

	public OrdenModel getOrden() {
		return orden;
	}

	public void setOrden(OrdenModel orden) {
		this.orden = orden;
	}

	public DetallePagoModel getDetallepa() {
		return detallepa;
	}

	public void setDetallepa(DetallePagoModel detallepa) {
		this.detallepa = detallepa;
	}

	public ProductoModel getProductos() {
		return productos;
	}

	public void setProductos(ProductoModel productos) {
		this.productos = productos;
	}

	


   

    
    
    
    
}