package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuario_id;
	@Column(name = "username", length = 45, nullable = true)
	private String username;
	@Column(name = "contraseña", length = 45, nullable = true)
	private String contraseña;
	
	public Usuarios() {
		
	}

	public Usuarios(int usuario_id, String username, String contraseña) {
		super();
		this.usuario_id = usuario_id;
		this.username = username;
		this.contraseña = contraseña;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
