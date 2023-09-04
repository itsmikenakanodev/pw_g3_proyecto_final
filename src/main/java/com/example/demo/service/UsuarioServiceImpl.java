package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IUsuarioRepository;
import com.example.demo.repository.modelo.Usuario;
import com.example.demo.service.to.UsuarioTO;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository iUsuarioRepository;

	@Override
	public void insertar(UsuarioTO u) {
		// TODO Auto-generated method stub
		this.iUsuarioRepository.insertar(this.convertir(u));
	}

	@Override
	public UsuarioTO buscarPorUsuario(String usuario) {
		// TODO Auto-generated method stub
		
		Usuario u = new Usuario();
		try {
			u =this.iUsuarioRepository.buscarPorUsuario(usuario);
			return this.convertirTO(u);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	private Usuario convertir(UsuarioTO usuario) {
		Usuario u = new Usuario();
		u.setNombre(usuario.getNombre());
		u.setApellido(usuario.getApellido());
		u.setCedula(usuario.getCedula());
		u.setContraseña(usuario.getContraseña());
		u.setCorreo(usuario.getCorreo());
		u.setDireccion(usuario.getDireccion());
		u.setSemestre(usuario.getSemestre());
		u.setUsuario(usuario.getUsuario());
		
		return u;
	}
	
	private UsuarioTO convertirTO(Usuario usuario) {
		UsuarioTO u = new UsuarioTO();
		u.setNombre(usuario.getNombre());
		u.setApellido(usuario.getApellido());
		u.setCedula(usuario.getCedula());
		u.setContraseña(usuario.getContraseña());
		u.setCorreo(usuario.getCorreo());
		u.setDireccion(usuario.getDireccion());
		u.setSemestre(usuario.getSemestre());
		u.setUsuario(usuario.getUsuario());
		
		return u;
	}
	
	@Override
	public Usuario buscarUsuarioSuscritos(String usuario) {
		// TODO Auto-generated method stub
		try {
			return this.iUsuarioRepository.buscarPorUsuarioConSus(usuario);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entro al error");
			return new Usuario();
		}
	}

}
