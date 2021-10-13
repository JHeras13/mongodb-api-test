package com.gs.app.models.documents;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Clase pojo de bitacora, mapeando una colección en MongoDB
 * 
 * @author jheras
 *
 */

@Document(collection = "bitacora")
public class Bitacora implements Serializable {

	@Id
	private String id;

	private String username;

	private String last_name;

	private String address;

	private String creation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreation() {
		return creation;
	}

	public void setCreation(String creation) {
		this.creation = creation;
	}

	private static final long serialVersionUID = 1L;

}
