package com.gs.app.models.documents.service;

import java.util.List;

import com.gs.app.models.documents.Bitacora;

public interface IBitacoraService {

	public List<Bitacora> findAll();

	public Bitacora findById(String id);

	public Bitacora save(Bitacora bitacora);

	public void deleteById(String id);

}
