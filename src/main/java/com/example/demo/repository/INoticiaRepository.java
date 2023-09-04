package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Noticia;

public interface INoticiaRepository {
	
	public void insertar(Noticia noticia);
	public List<Noticia> buscarTodos();
	public Noticia buscarPorId(Integer id);

}
