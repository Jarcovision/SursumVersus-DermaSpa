package com.dermaspa.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dermaspa.models.UsuarioFormModel;

@Repository

public interface UsuarioFormRepository extends CrudRepository<UsuarioFormModel, Long> {
	public Optional<UsuarioFormModel> findById(Long id) ;  
	public Optional<UsuarioFormModel> findByEmail(String email) ;  

}
