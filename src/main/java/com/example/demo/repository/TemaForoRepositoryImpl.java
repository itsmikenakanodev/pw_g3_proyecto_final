package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.TemaForo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class TemaForoRepositoryImpl implements ITemaForoRepository{

	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(TemaForo temaForo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(temaForo);
		
	}
	@Override
	public List<TemaForo> buscarTodos() {
		// TODO Auto-generated method stub
		
		TypedQuery<TemaForo> temas = this.entityManager.createQuery("SELECT t FROM TemaForo t WHERE t.usuario!=null" ,TemaForo.class);
		
		return temas.getResultList();
	}
	@Override
	public TemaForo buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(TemaForo.class, id);
	}
	
	

}
