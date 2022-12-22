package com.dermaspa.services;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dermaspa.models.DetallePagoModel;
import com.dermaspa.repositories.DetallePagoRepository;

@Service

public class DetallePagoService {
	@Autowired
	DetallePagoRepository detallePagoRepositorio;
	
	public ArrayList<DetallePagoModel> obtenerDetallePagos() {
		return (ArrayList<DetallePagoModel>) detallePagoRepositorio.findAll();
	}
	
	public DetallePagoModel guardarDetallePagos(DetallePagoModel detallePago) {
		return detallePagoRepositorio.save(detallePago);
	}
	
	public Optional<DetallePagoModel> obtenerPorId(Long id) {
		return detallePagoRepositorio.findById(id);
	}
	 
	public boolean eliminarDetallePago(Long id) {
		try {
			detallePagoRepositorio.deleteById(id);
			return true;
			
		} catch (Exception e) {
			return false;
		}

	}

	
}
