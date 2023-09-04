package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ITemaForoRepository;
import com.example.demo.repository.modelo.TemaForo;
import com.example.demo.service.to.TemaForoTO;

@Service
public class TemaForoSeviceImpl implements ITemaForoService {

	@Autowired
	private ITemaForoRepository iTemaForoRepository;

	private TemaForo convertir(TemaForoTO temaForoTO) {

		TemaForo temaForo = new TemaForo();

		temaForo.setDescripcion(temaForoTO.getDescripcion());
		temaForo.setFecha(temaForoTO.getFecha());
		temaForo.setTitulo(temaForoTO.getTitulo());
		temaForo.setUsuario(temaForoTO.getUsuario());
		temaForo.setComentarios(temaForoTO.getComentarios());

		return temaForo;
	}

	@Override
	public void insertar(TemaForoTO temaForoTO) {
		// TODO Auto-generated method stub

		this.iTemaForoRepository.insertar(this.convertir(temaForoTO));
	}

	private TemaForoTO convertirATo(TemaForo temaforo) {
		TemaForoTO temaForoTO = new TemaForoTO(temaforo.getTitulo(), temaforo.getDescripcion(), temaforo.getFecha(),
				temaforo.getUsuario(), temaforo.getComentarios());

		return temaForoTO;
	}

	@Override
	public List<TemaForoTO> buscarTodos() {
		// TODO Auto-generated method stub

		List<TemaForo> lista = this.iTemaForoRepository.buscarTodos();
		List<TemaForoTO> listaTO = new ArrayList<>();
		try {
			listaTO = lista.stream().map(temaforo -> this.convertirATo(temaforo)).toList();
			return listaTO;
		} catch (Exception e) {
			// TODO: handle exception
			return listaTO;
		}
	}

	@Override
	public TemaForoTO buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		
		this.iTemaForoRepository.buscarPorId(id);
		return this.convertirATo(this.iTemaForoRepository.buscarPorId(id));
	}

	
	

	
}
