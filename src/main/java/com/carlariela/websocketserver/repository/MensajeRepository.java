package com.carlariela.websocketserver.repository;

import com.carlariela.websocketserver.model.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MensajeRepository extends MongoRepository<Mensaje, Long> {
}
