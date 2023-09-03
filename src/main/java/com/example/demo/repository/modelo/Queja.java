package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "queja")
public class Queja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quej_id_seq")
	@SequenceGenerator(name = "quej_id_seq", sequenceName = "quej_id_seq", allocationSize = 1)
	@Column(name = "quej_id")
	private Integer id;
	
	@Column(name = "quej_descripcion")
	private String descripcion;
	
	@Column(name = "quej_fecha")
	private LocalDateTime fecha;
	
	@Column(name = "quej_valoracion")
	private Integer valoracion;
	
	@ManyToOne
	@JoinColumn(name = "quej_id_usuario")
	private Usuario usuario;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
