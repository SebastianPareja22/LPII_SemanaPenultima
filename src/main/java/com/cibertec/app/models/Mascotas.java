package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "mascotas")
public class Mascotas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cedula;
	@Column(name = "nombre", length = 40, nullable = true)
	private String nombre;
	@Column(name = "raza", length = 15, nullable = true)
	private String raza;
	@Column(name = "genero", length = 10, nullable = true)
	private String genero;
	
	public Mascotas() {
		
	}

	public Mascotas(Integer cedula, String nombre, String raza, String genero) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.raza = raza;
		this.genero = genero;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
