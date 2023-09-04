package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IUsuarioRepository;
import com.example.demo.repository.modelo.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public Usuario buscarUsuario(String usuario) {
		// TODO Auto-generated method stub
		try {
			return this.usuarioRepository.buscarPorUsuario(usuario);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entro al error");
			return new Usuario();
		}
	}

}
