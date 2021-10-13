package com.gs.app.models.documents.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gs.app.models.dao.IBitacoraDao;
import com.gs.app.models.documents.Bitacora;

@Service
public class BitacoraServiceImpl implements IBitacoraService {

	@Autowired
	private IBitacoraDao bitacoraDao;

	@Override
	@Transactional(readOnly = true)
	public List<Bitacora> findAll() {
		return bitacoraDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Bitacora findById(String id) {
		return bitacoraDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Bitacora save(Bitacora bitacora) {
		return bitacoraDao.save(bitacora);
	}

	@Override
	@Transactional
	public void deleteById(String id) {
		bitacoraDao.deleteById(id);
	}

}
