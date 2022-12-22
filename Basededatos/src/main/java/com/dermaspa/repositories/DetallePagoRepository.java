package com.dermaspa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dermaspa.models.DetallePagoModel;

@Repository

public interface DetallePagoRepository extends CrudRepository<DetallePagoModel, Long> {

}
