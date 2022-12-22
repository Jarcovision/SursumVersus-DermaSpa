package com.dermaspa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dermaspa.models.DetalleOrdenModel;

@Repository

public interface DetalleOrdenRepository extends CrudRepository<DetalleOrdenModel, Long> {

}
