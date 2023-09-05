package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.ComentarioForo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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
	
	public List<ComentarioForo> buscarTodosPorTemaID(Integer id) {
		
		TypedQuery< ComentarioForo> myQuery = this.entityManager.createQuery("SELECT c FROM ComentarioForo  c WHERE c.tema.id = :datoidtema", ComentarioForo.class);
		
		myQuery.setParameter("datoidtema", id);
		
		return myQuery.getResultList();
	}

}
