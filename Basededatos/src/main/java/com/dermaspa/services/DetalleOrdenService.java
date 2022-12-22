package com.dermaspa.services;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dermaspa.models.DetalleOrdenModel;
import com.dermaspa.repositories.DetalleOrdenRepository;

@Service

public class DetalleOrdenService {

	@Autowired
	DetalleOrdenRepository detalleOrdenRepositorio;
	
	public ArrayList<DetalleOrdenModel> obtenerDetalleOrdenes() {
		return (ArrayList<DetalleOrdenModel>) detalleOrdenRepositorio.findAll();
	}
	
	public DetalleOrdenModel guardarDetalleOrdenes(DetalleOrdenModel detalleOrden) {
		return detalleOrdenRepositorio.save(detalleOrden);
	}
	
	public Optional<DetalleOrdenModel> obtenerPorId(Long id) {
		return detalleOrdenRepositorio.findById(id);
	}

	 
	public boolean eliminarDetalleOrden(Long id) {
		try {
			detalleOrdenRepositorio.deleteById(id);
			return true;
			
		} catch (Exception e) {
			return false;
		}

	}
}
	

