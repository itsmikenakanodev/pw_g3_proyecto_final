package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IUsuarioService;
import com.example.demo.service.to.UsuarioTO;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuarioControllerRestFul {
	
	@Autowired
	private IUsuarioService iUsuarioService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Boolean registrar(@RequestBody UsuarioTO usuario) {
		
		UsuarioTO user = this.iUsuarioService.buscarPorUsuario(usuario.getUsuario());
		
		if(user!=null) {
			return false;
		}else {
			this.iUsuarioService.insertar(usuario);
			return true;
		}
	}
	
	@GetMapping(path ="/{usuario}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public UsuarioTO verificar(@PathVariable String usuario) {
		
		UsuarioTO user = this.iUsuarioService.buscarPorUsuario(usuario);
		
		if(user!=null) {
			return user;
		}else {
			return new UsuarioTO();
		}
	}
}
