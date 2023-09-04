package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Usuario;
import com.example.demo.service.ISuscripcionService;
import com.example.demo.service.IUsuarioService;
import com.example.demo.service.to.SuscripcionTo;

@RestController
@RequestMapping("/suscripcion")
@CrossOrigin
public class SuscripcionControllerRestFul {
	
	@Autowired
	private ISuscripcionService suscripcionService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public Boolean guardar(@RequestBody SuscripcionTo suscripcion) {
		Usuario usuario=this.usuarioService.buscarUsuarioSuscritos(suscripcion.getUsuario());
		if(usuario.getSuscripcion()==null) {
			this.suscripcionService.suscribirse(suscripcion.devolverSuscripcion(usuario));
			//Se pone un retorno booleano para el frondend, para que diga si esta suscrito o no
			return true;
		}else {
			System.out.println("No se pudo registrar  ");
			return false;
		}
		
	}

}
