package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Suscripcion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class SuscripcionRepositoryImpl implements ISuscripcionRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(Suscripcion suscripcion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(suscripcion);
	}

}
