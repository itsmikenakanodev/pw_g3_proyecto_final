package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.ComentarioForo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ComentarioForoRepositoryImpl implements IComentarioForoRepository{

	@PersistenceContext
	
	private EntityManager entityManager;
	
	@Override
	public void insertarComentario(ComentarioForo comentarioForo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(comentarioForo);
	}

}
