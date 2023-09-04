package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IQuejaRepository;
import com.example.demo.repository.modelo.Queja;
import com.example.demo.service.to.QuejaTO;

@Service
public class QuejaServiceImpl implements IQuejaService {

	@Autowired
	private IQuejaRepository iQuejaRepository;

	@Override
	public void insertarQueja(QuejaTO quejaTo) {
		Queja queja = this.convertir(quejaTo);
		this.iQuejaRepository.ingresar(queja);
	}

	private Queja convertir(QuejaTO queja) {
		Queja quej = new Queja();
		quej.setValoracion(queja.getValoracion());
		quej.setUsuario(queja.getUsuario());
		quej.setFecha(queja.getFecha());
		quej.setDescripcion(queja.getDescripcion());
		return quej;
	}

	@Override
	public List<QuejaTO> consultarTodosTO() {
		// TODO Auto-generated method stub
		List<Queja> lista = new ArrayList<>();
		List<QuejaTO> listaTO = new ArrayList<>();
		try {
			lista = this.iQuejaRepository.buscarTodos();
			listaTO = lista.stream().map(queja -> this.convertirATo(queja)).collect(Collectors.toList());
			return listaTO;
		} catch (Exception e) {
			// TODO: handle exception
			return listaTO;
		}
		
		
	}

	private QuejaTO convertirATo(Queja queja) {
		QuejaTO quej = new QuejaTO();
		quej.setValoracion(queja.getValoracion());
		quej.setUsuario(queja.getUsuario());
		quej.setFecha(queja.getFecha());
		quej.setDescripcion(queja.getDescripcion());
		return quej;
	}
}
