package com.gs.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gs.app.models.documents.Bitacora;
import com.gs.app.models.documents.service.IBitacoraService;

@RestController
@RequestMapping("/bitacora")
public class BitacoraRestController {

	@Autowired
	private IBitacoraService bitacoraService;

	@PostMapping("/all")
	public List<Bitacora> findAll() {
		List<Bitacora> data_bitacora = bitacoraService.findAll();

		return data_bitacora;
	}

	@PostMapping("/find/{id}")
	public Bitacora findAll(@PathVariable String id) {
		Bitacora bitacora = bitacoraService.findById(id);

		return bitacora;
	}

	@PostMapping("/save")
	public Bitacora save(@RequestBody Bitacora bitacora) {
		Bitacora bitacora_new = bitacoraService.save(bitacora);

		return bitacora_new;
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		bitacoraService.deleteById(id);
	}

}
