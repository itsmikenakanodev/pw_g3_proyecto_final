package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Queja;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class QuejaRepositoryImpl implements IQuejaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Queja queja) {
		// TODO Auto-generated method stub
		this.entityManager.persist(queja);
	}

	@Override
	public List<Queja> buscarTodos() {
		TypedQuery<Queja> myQuery = this.entityManager.createQuery("SELECT q FROM Queja q", Queja.class);
		return myQuery.getResultList();
	}

}
