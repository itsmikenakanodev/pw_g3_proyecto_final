package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "suscripcion")
public class Suscripcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "susc_id_seq")
	@SequenceGenerator(name = "susc_id_seq", sequenceName = "susc_id_seq", allocationSize = 1)
	@Column(name = "susc_id")
	private Integer id;
	
	@Column(name = "susc_fecha")
	private LocalDateTime fecha;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "susc_id_usuario")
	private Usuario usuario;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
