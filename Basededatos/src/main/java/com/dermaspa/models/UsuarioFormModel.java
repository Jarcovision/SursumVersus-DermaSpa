package com.dermaspa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")

public class UsuarioFormModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Column(nullable = false)
	private String nombreUsuario;
	
	@Column(nullable = false)
	private String apellidoUsuario;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	/***RELACIONES***/
//	@OneToMany(mappedBy = "usuario")
//    private ArrayList<OrdenModel> ordenes;
//	
	/******/
	
	public UsuarioFormModel() {
	}

	public UsuarioFormModel(Long id, String nombreUsuario, String apellidoUsuario, String email, String password) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public ArrayList<OrdenModel> getOrdenes() {
//		return ordenes;
//	}
//
//	public void setOrdenes(ArrayList<OrdenModel> ordenes) {
//		this.ordenes = ordenes;
//	}

	
	
	
}