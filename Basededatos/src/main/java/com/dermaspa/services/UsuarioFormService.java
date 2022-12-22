package com.dermaspa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dermaspa.models.UsuarioFormModel;
import com.dermaspa.repositories.UsuarioFormRepository;

@Service

public class UsuarioFormService {
	@Autowired
	UsuarioFormRepository usuarioRepositorio;
	
	public ArrayList<UsuarioFormModel> obtenerUsuarios() {
		return (ArrayList<UsuarioFormModel>) usuarioRepositorio.findAll();
	}
	
	public UsuarioFormModel guardarUsuarios(UsuarioFormModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public Optional<UsuarioFormModel> obtenerPorId(Long id) {
		return usuarioRepositorio.findById(id);
	}
	
	public Optional<UsuarioFormModel> obtenerPorEmail(String email) {
		return usuarioRepositorio.findByEmail(email);
	}
	 
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepositorio.deleteById(id);
			return true;
			
		} catch (Exception e) {
			return false;
		}

	}
}
