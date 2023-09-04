package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Queja;

public interface IQuejaRepository {

	public void ingresar(Queja queja);

	public List<Queja> buscarTodos();
}
