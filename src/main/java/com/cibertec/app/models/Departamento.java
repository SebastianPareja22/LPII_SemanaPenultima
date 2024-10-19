package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departamento_id;
	@Column(name = "departamento_name", length = 30, nullable = true)
	private String departamento_name;
	@Column(name = "localicacion_id", nullable = true)
	private int localicacion_id;
	
	public Departamento() {
		
	}

	public Departamento(int departamento_id, String departamento_name, int localicacion_id) {
		super();
		this.departamento_id = departamento_id;
		this.departamento_name = departamento_name;
		this.localicacion_id = localicacion_id;
	}

	public int getDepartamento_id() {
		return departamento_id;
	}

	public void setDepartamento_id(int departamento_id) {
		this.departamento_id = departamento_id;
	}

	public String getDepartamento_name() {
		return departamento_name;
	}

	public void setDepartamento_name(String departamento_name) {
		this.departamento_name = departamento_name;
	}

	public int getLocalicacion_id() {
		return localicacion_id;
	}

	public void setLocalicacion_id(int localicacion_id) {
		this.localicacion_id = localicacion_id;
	}
}
