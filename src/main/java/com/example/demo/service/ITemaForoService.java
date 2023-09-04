package com.example.demo.service;

import java.util.List;

import com.example.demo.service.to.TemaForoTO;

public interface ITemaForoService {

	
	public void insertar(TemaForoTO temaForo);
	
	public List<TemaForoTO> buscarTodos();
	
	public TemaForoTO buscarPorId(Integer id);
	


}
