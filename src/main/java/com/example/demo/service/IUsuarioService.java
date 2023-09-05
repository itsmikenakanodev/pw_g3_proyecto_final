package com.example.demo.service;

import com.example.demo.repository.modelo.Usuario;
import com.example.demo.service.to.UsuarioTO;

public interface IUsuarioService {

	public void insertar(UsuarioTO u);

	public UsuarioTO buscarPorUsuario(String usuario);
	
	public Usuario buscarUsuarioSuscritos(String usuario);
	
	public void actualizar(Usuario u);
}
