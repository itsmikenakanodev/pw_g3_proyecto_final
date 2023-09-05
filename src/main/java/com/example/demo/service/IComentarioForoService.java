package com.example.demo.service;

import java.util.List;

import com.example.demo.service.to.ComentarioForoTO;

public interface IComentarioForoService {
	
	
	public void insertar(ComentarioForoTO comentarioForoTO);
	
	public List<ComentarioForoTO> buscarTodosPorTemaID(Integer id);
	

}
