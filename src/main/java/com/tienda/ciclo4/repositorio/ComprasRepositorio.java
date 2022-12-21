package com.tienda.ciclo4.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tienda.ciclo4.modelo.Compras;

@Repository
public interface ComprasRepositorio extends MongoRepository<Compras,String> {

  

}
