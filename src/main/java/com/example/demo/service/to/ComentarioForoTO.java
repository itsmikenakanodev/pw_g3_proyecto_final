package com.example.demo.service.to;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.example.demo.repository.modelo.TemaForo;
import com.example.demo.repository.modelo.Usuario;

public class ComentarioForoTO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String comentario;
	private LocalDateTime fecha;
	private TemaForo tema;
	private Usuario usuario;
	

	

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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

	public TemaForo getTema() {
		return tema;
	}

	public void setTema(TemaForo tema) {
		this.tema = tema;
	}

	

	
	
	

	
}
