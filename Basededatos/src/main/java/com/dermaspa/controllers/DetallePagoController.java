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
import com.dermaspa.models.DetallePagoModel;
import com.dermaspa.services.DetallePagoService;

@RestController
@RequestMapping("/detallep")


public class DetallePagoController {
	@Autowired
	DetallePagoService detallePagoServicio;
	
	@GetMapping()
	public ArrayList<DetallePagoModel> obtenerDetallePagos() {
		return detallePagoServicio.obtenerDetallePagos();
	}
	
	@PostMapping()
	public DetallePagoModel guardarUsuarios(@RequestBody DetallePagoModel detallePago) {
		return this.detallePagoServicio.guardarDetallePagos(detallePago);
	}
	
	@GetMapping(path="/{id}")
	public Optional<DetallePagoModel> obtenerDetallePagoPorId(@PathVariable("id")Long id) {
		return this.detallePagoServicio.obtenerPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public String  eliminarPorId(@PathVariable("id")Long id){
		boolean check=	this.detallePagoServicio.eliminarDetallePago(id);
		if(check) {
			return "Se eliminó el detalle de pago " + id;	
		} else {
			return "No se eliminó el detalle de pago " + id;
		}
			 
	}  


}
