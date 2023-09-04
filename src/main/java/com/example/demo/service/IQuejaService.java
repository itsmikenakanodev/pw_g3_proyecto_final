package com.example.demo.service;

import java.util.List;

import com.example.demo.service.to.QuejaTO;

public interface IQuejaService {

	public void insertarQueja(QuejaTO queja);

	public List<QuejaTO> consultarTodosTO();

}
