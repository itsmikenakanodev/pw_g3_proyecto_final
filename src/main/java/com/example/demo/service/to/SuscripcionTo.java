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
	private UsuarioTO user;
	
	public Suscripcion devolverSuscripcion(Usuario usuario) {
		Suscripcion suscripcion=new Suscripcion();
		suscripcion.setFecha(LocalDateTime.now());
		suscripcion.setUsuario(usuario);
		return suscripcion;
	}
	
	public Usuario convertir() {
		Usuario u = new Usuario();
		u.setNombre(user.getNombre());
		u.setApellido(user.getApellido());
		u.setCedula(user.getCedula());
		u.setContraseña(user.getContraseña());
		u.setCorreo(user.getCorreo());
		u.setDireccion(user.getDireccion());
		u.setSemestre(user.getSemestre());
		u.setUsuario(user.getUsuario());
		return u;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public UsuarioTO getUser() {
		return user;
	}

	public void setUser(UsuarioTO user) {
		this.user = user;
	}

}
