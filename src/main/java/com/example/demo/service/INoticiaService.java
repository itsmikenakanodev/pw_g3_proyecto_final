package com.example.demo.service;

import java.util.List;

import com.example.demo.service.to.NoticiaTO;

public interface INoticiaService {
	
	public void insertar(NoticiaTO noticiaTO);
	public List<NoticiaTO> buscarTodos();
	public NoticiaTO buscarPorId(Integer id);

}
