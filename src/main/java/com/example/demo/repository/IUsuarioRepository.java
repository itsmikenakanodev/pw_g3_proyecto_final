package com.example.demo.repository;

import com.example.demo.repository.modelo.Usuario;

public interface IUsuarioRepository {
	
	public void insertar(Usuario u);
	
	public Usuario buscarPorUsuario(String usuario);
}
