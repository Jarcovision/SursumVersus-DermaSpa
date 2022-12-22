package com.dermaspa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dermaspa.models.DireccionModel;
import com.dermaspa.repositories.DireccionRepository;

@Service

public class DireccionService {
	@Autowired
	DireccionRepository direccionRepositorio;
	
	public ArrayList<DireccionModel> obtenerDirecciones() {
		return (ArrayList<DireccionModel>) direccionRepositorio.findAll();
	}
	
	public DireccionModel guardarDirecciones(DireccionModel direccion) {
		return direccionRepositorio.save(direccion);
	}
	
	public Optional<DireccionModel> obtenerPorId(Long id) {
		return direccionRepositorio.findById(id);
	}
	 
	public boolean eliminarDireccion(Long id) {
		try {
			direccionRepositorio.deleteById(id);
			return true;
			
		} catch (Exception e) {
			return false;
		}

	}

}
