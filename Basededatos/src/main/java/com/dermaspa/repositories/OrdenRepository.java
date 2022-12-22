package com.dermaspa.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dermaspa.models.OrdenModel;

@Repository

public interface OrdenRepository extends CrudRepository<OrdenModel, Long> {
	public Optional<OrdenModel> findById(Long id) ;  
	public Optional<OrdenModel> findByFecha(String fecha) ;  

}
