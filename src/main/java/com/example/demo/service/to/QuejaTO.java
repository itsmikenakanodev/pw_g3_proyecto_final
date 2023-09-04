package com.example.demo.service.to;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.example.demo.repository.modelo.Usuario;

public class QuejaTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String descripcion;

	private LocalDateTime fecha;

	private Integer valoracion;

	private Usuario usuario;

	@Override
	public String toString() {
		return "QuejaTO [descripcion=" + descripcion + ", fecha=" + fecha + ", valoracion=" + valoracion + ", usuario="
				+ usuario + "]";
	}

	// set y get
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
