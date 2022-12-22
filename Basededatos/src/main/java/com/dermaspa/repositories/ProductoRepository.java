package com.dermaspa.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dermaspa.models.ProductoModel;

@Repository

public interface ProductoRepository extends CrudRepository<ProductoModel, Long> {
	public Optional<ProductoModel> findById(Long id);
	public Optional<ProductoModel> findByNombreProducto(String nombreProducto);  

}
