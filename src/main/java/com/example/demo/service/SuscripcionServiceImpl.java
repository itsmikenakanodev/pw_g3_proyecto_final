package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ISuscripcionRepository;
import com.example.demo.repository.modelo.Usuario;
import com.example.demo.service.to.SuscripcionTo;

@Service
public class SuscripcionServiceImpl implements ISuscripcionService {

	@Autowired
	private ISuscripcionRepository suscripcionRepository;
	@Autowired
	private IUsuarioService usuarioService;
	
	@Override
	public void suscribirse(SuscripcionTo suscripcion, Usuario u) {
		// TODO Auto-generated method stub
		Usuario usuario=suscripcion.convertir();
		usuario.setId(u.getId());
		usuario.setContraseña(u.getContraseña());
		this.usuarioService.actualizar(usuario);
		usuario=this.usuarioService.buscarUsuarioSuscritos(usuario.getUsuario());
		this.suscripcionRepository.ingresar(suscripcion.devolverSuscripcion(usuario));
	}

}
