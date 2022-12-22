package com.dermaspa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dermaspa.models.ProductoModel;
import com.dermaspa.repositories.ProductoRepository;

@Service

public class ProductoService {
	@Autowired
	ProductoRepository productoRepositorio;
	
	public ArrayList<ProductoModel> obtenerProductos() {
		return (ArrayList<ProductoModel>) productoRepositorio.findAll();
	}
	
	public ProductoModel guardarProductos(ProductoModel producto) {
		return productoRepositorio.save(producto);
	}
	
	public Optional<ProductoModel> obtenerPorId(Long id) {
		return productoRepositorio.findById(id);
	}
	
	public Optional<ProductoModel> obtenerPorNombreProducto(String nombreProducto) {
		return productoRepositorio.findByNombreProducto(nombreProducto);
	}
	 
	public boolean eliminarProducto(Long id) {
		try {
			productoRepositorio.deleteById(id);
			return true;
			
		} catch (Exception e) {
			return false;
		}

	}
}
