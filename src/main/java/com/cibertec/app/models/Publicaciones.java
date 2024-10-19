package com.cibertec.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "publicaciones")
public class Publicaciones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuario_id;
	@Column(name = "titulo", length = 45, nullable = true)
	private String titulo;
	@Column(name = "cuerpo", length = 45, nullable = true)
	private String cuerpo;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuarios usuarios;
}
