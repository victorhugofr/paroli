package com.codeminio.repositories;

import java.util.List;
import java.util.Optional;

import com.codeminio.model.Aviso;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisoRepository extends CrudRepository<Aviso, Long> {

  List<Aviso> findAll();

  Optional<Aviso> findById(Long id);

}