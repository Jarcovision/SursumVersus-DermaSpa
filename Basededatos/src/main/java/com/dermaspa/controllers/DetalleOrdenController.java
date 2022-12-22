package com.dermaspa.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dermaspa.models.DetalleOrdenModel;
import com.dermaspa.services.DetalleOrdenService;

@RestController
@RequestMapping("/detalleo")

public class DetalleOrdenController {
	@Autowired
	DetalleOrdenService detalleOrdenServicio;
	
	@GetMapping()
	public ArrayList<DetalleOrdenModel> obtenerDetalleOrdenes() {
		return detalleOrdenServicio.obtenerDetalleOrdenes();
	}
	
	@PostMapping()
	public DetalleOrdenModel guardarDetalleOrdenes(@RequestBody DetalleOrdenModel detalleOrden) {
		return this.detalleOrdenServicio.guardarDetalleOrdenes(detalleOrden);
	}
	
	@GetMapping(path="/{id}")
	public Optional<DetalleOrdenModel> obtenerUsuarioPorId(@PathVariable("id")Long id) {
		return this.detalleOrdenServicio.obtenerPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public String  eliminarPorId(@PathVariable("id")Long id){
		boolean check=	this.detalleOrdenServicio.eliminarDetalleOrden(id);
		if(check) {
			return "Se eliminó el detalle de la orden " + id;	
		} else {
			return "No se eliminó el detalle de la orden " + id;
		
			 
	}  
}

}
