package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.ComentarioForo;

public interface IComentarioForoRepository {
	
	public void insertarComentario(ComentarioForo comentarioForo);
	public List<ComentarioForo> buscarTodosPorTemaID(Integer id);
}
