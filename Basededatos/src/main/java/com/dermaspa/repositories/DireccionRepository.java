package com.dermaspa.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dermaspa.models.DireccionModel;

@Repository

public interface DireccionRepository extends CrudRepository<DireccionModel, Long> {
	public Optional<DireccionModel> findById(Long id) ; 
}
