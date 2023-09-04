package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Noticia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class NoticiaRepositoryImpl implements INoticiaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Noticia noticia) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(noticia);
		
	}

	@Override
	public List<Noticia> buscarTodos() {
		// TODO Auto-generated method stub
		
		TypedQuery<Noticia> query = this.entityManager.createQuery("SELECT n FROM Noticia n",Noticia.class);
		return query.getResultList();
	}

	@Override
	public Noticia buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Noticia.class, id);
	}

}
