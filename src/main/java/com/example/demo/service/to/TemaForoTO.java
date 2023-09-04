package com.example.demo.service.to;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repository.modelo.ComentarioForo;
import com.example.demo.repository.modelo.Usuario;

public class TemaForoTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String titulo;
	private String descripcion;
	private LocalDateTime fecha;
	private Usuario usuario;
	private List<ComentarioForo> comentarios;

	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<ComentarioForo> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<ComentarioForo> comentarios) {
		this.comentarios = comentarios;
	}
	public TemaForoTO(String titulo, String descripcion, LocalDateTime fecha, Usuario usuario,
			List<ComentarioForo> comentarios) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.usuario = usuario;
		this.comentarios = comentarios;
	}
	
	

	

}
