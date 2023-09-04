package com.example.demo.service.to;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.example.demo.repository.modelo.Suscripcion;
import com.example.demo.repository.modelo.Usuario;

public class SuscripcionTo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String usuario;
	
	public Suscripcion devolverSuscripcion(Usuario usuario) {
		Suscripcion suscripcion=new Suscripcion();
		suscripcion.setFecha(LocalDateTime.now());
		suscripcion.setUsuario(usuario);
		return suscripcion;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
