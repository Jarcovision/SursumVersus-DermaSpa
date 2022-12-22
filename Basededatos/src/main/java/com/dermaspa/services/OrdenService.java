package com.dermaspa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dermaspa.models.OrdenModel;
import com.dermaspa.repositories.OrdenRepository;

@Service

public class OrdenService {
	@Autowired
	OrdenRepository ordenRepositorio;
	
	public ArrayList<OrdenModel> obtenerOrdenes() {
		return (ArrayList<OrdenModel>) ordenRepositorio.findAll();
	}
	
	public OrdenModel guardarOrdenes(OrdenModel orden) {
		return ordenRepositorio.save(orden);
	}
	
	public Optional<OrdenModel> obtenerPorId(Long id) {
		return ordenRepositorio.findById(id);
	}
	
	public Optional<OrdenModel> obtenerPorFecha(String fecha) {
		return ordenRepositorio.findByFecha(fecha);
	}
	
	public boolean eliminarOrden(Long id) {
		try {
			ordenRepositorio.deleteById(id);
			return true;
			
		} catch (Exception e) {
			return false;
		}

	}
	
}
