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

import com.dermaspa.models.ProductoModel;
import com.dermaspa.services.ProductoService;

@RestController
@RequestMapping("/producto")

public class ProductoController {
	@Autowired
	ProductoService productoServicio;
	
	@GetMapping()
	public ArrayList<ProductoModel> obtenerProductos() {
		return productoServicio.obtenerProductos();
	}
	
	@PostMapping()
	public ProductoModel guardarProductos(@RequestBody ProductoModel producto) {
		return this.productoServicio.guardarProductos(producto);
	}
	
	@GetMapping("/query")
	public Optional<ProductoModel> obtenerProductoPorNombreProducto(@RequestParam("nombre de producto")String nombreProducto) {
		return this.productoServicio.obtenerPorNombreProducto(nombreProducto);
	}
	
	@GetMapping(path="/{id}")
	public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("id")Long id) {
		return this.productoServicio.obtenerPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public String  eliminarPorId(@PathVariable("id")Long id){
		boolean check=	this.productoServicio.eliminarProducto(id);
		if(check) {
			return "Se eliminó el producto " + id;	
		} else {
			return "No se eliminó el producto " + id;
		}
			 
	}  

}
