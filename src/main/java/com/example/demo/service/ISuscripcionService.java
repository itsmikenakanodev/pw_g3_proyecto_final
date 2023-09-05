package com.example.demo.service;

import com.example.demo.repository.modelo.Usuario;
import com.example.demo.service.to.SuscripcionTo;

public interface ISuscripcionService {
	
	public void suscribirse(SuscripcionTo suscripcion, Usuario u);

}
