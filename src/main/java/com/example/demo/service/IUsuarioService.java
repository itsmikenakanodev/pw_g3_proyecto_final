package com.example.demo.service;

import com.example.demo.service.to.UsuarioTO;

public interface IUsuarioService {

	public void insertar(UsuarioTO u);

	public UsuarioTO buscarPorUsuario(String usuario);
}
