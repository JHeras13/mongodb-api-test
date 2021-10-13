package com.gs.app.models.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gs.app.models.documents.Bitacora;

public interface IBitacoraDao extends MongoRepository<Bitacora, String> {

}
