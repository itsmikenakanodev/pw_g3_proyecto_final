package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ISuscripcionRepository;
import com.example.demo.repository.modelo.Suscripcion;

@Service
public class SuscripcionServiceImpl implements ISuscripcionService {

	@Autowired
	private ISuscripcionRepository suscripcionRepository;
	
	@Override
	public void suscribirse(Suscripcion suscripcion) {
		// TODO Auto-generated method stub
		this.suscripcionRepository.ingresar(suscripcion);
	}

}
