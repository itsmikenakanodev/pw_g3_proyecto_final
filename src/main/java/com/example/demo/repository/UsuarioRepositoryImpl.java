package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repository.modelo.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class UsuarioRepositoryImpl implements IUsuarioRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Usuario buscarPorUsuario(String usuario) {
	    TypedQuery<Usuario> query = this.entityManager.createQuery(
	        "SELECT u FROM Usuario u LEFT JOIN FETCH u.suscripcion WHERE u.usuario=:datoUsuario", Usuario.class
	    );
	    query.setParameter("datoUsuario", usuario);
	    return query.getSingleResult();
	}

}
