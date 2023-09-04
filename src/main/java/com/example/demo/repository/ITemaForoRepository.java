package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.TemaForo;

public interface ITemaForoRepository {
	
	public void insertar(TemaForo temaForo);
	
	
	public List<TemaForo> buscarTodos();
	
	public TemaForo buscarPorId(Integer id);
	

}
