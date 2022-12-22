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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dermaspa.models.OrdenModel;
import com.dermaspa.services.OrdenService;

@RestController
@RequestMapping("/orden")

public class OrdenController {
	@Autowired
	OrdenService ordenServicio;
	
	@GetMapping()
	public ArrayList<OrdenModel> obtenerOrdenes() {
		return ordenServicio.obtenerOrdenes();
	}
	
	@PostMapping()
	public OrdenModel guardarOrdenes(@RequestBody OrdenModel orden) {
		return this.ordenServicio.guardarOrdenes(orden);
	}
	
	@GetMapping("/query")
	public Optional<OrdenModel> obtenerOrdenPorFecha(@RequestParam("fecha")String fecha) {
		return this.ordenServicio.obtenerPorFecha(fecha);
	}
	
	@GetMapping(path="/{id}")
	public Optional<OrdenModel> obtenerOrdenPorId(@PathVariable("id")Long id) {
		return this.ordenServicio.obtenerPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public String  eliminarPorId(@PathVariable("id")Long id){
		boolean check=	this.ordenServicio.eliminarOrden(id);
		if(check) {
			return "Se eliminó la orden " + id;	
		} else {
			return "No se eliminó la orden " + id;
		}
			 
	}  
}

