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
import com.dermaspa.models.UsuarioFormModel;
import com.dermaspa.services.UsuarioFormService;

@RestController
@RequestMapping("/usuario")

public class UsuarioFormController {
	@Autowired
	UsuarioFormService usuarioServicio;
	
	@GetMapping()
	public ArrayList<UsuarioFormModel> obtenerUsuarios() {
		return usuarioServicio.obtenerUsuarios();
	}
	
	@PostMapping()
	public UsuarioFormModel guardarUsuarios(@RequestBody UsuarioFormModel usuario) {
		return this.usuarioServicio.guardarUsuarios(usuario);
	}
	
	@GetMapping("/query")
	public Optional<UsuarioFormModel> obtenerUsuarioPorEmail(@RequestParam("email")String email) {
		return this.usuarioServicio.obtenerPorEmail(email);
	}
	
	@GetMapping(path="/{id}")
	public Optional<UsuarioFormModel> obtenerUsuarioPorId(@PathVariable("id")Long id) {
		return this.usuarioServicio.obtenerPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public String  eliminarPorId(@PathVariable("id")Long id){
		boolean check=	this.usuarioServicio.eliminarUsuario(id);
		if(check) {
			return "Se eliminó el usuario " + id;	
		} else {
			return "No se eliminó el usuario " + id;
		}
			 
	}  
}
