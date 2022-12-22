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
import com.dermaspa.models.DireccionModel;
import com.dermaspa.services.DireccionService;

@RestController
@RequestMapping("/direccion")

public class DireccionController {
	
	@Autowired
	DireccionService direccionServicio;
	
	@GetMapping()
	public ArrayList<DireccionModel> obtenerDirecciones() {
		return direccionServicio.obtenerDirecciones();
	}
	
	@PostMapping()
	public DireccionModel guardarDirecciones(@RequestBody DireccionModel direccion) {
		return this.direccionServicio.guardarDirecciones(direccion);

	}
	
	@GetMapping(path="/{id}")
	public Optional<DireccionModel> obtenerDireccionPorId(@PathVariable("id")Long id) {
		return this.direccionServicio.obtenerPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public String  eliminarPorId(@PathVariable("id")Long id){
		boolean check=	this.direccionServicio.eliminarDireccion(id);
		if(check) {
			return "Se eliminó la dirección " + id;	
		} else {
			return "No se eliminó la dirección " + id;
		}
			 
	}  

}
