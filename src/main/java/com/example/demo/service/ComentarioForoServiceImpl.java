package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IComentarioForoRepository;
import com.example.demo.repository.modelo.ComentarioForo;
import com.example.demo.service.to.ComentarioForoTO;

@Service
public class ComentarioForoServiceImpl implements IComentarioForoService {

	@Autowired
	private IComentarioForoRepository iComentarioForoRepository;

	@Override
	public void insertar(ComentarioForoTO comentarioForoTO) {
		// TODO Auto-generated method stub

		this.iComentarioForoRepository.insertarComentario(this.convertir(comentarioForoTO));

	}

	private ComentarioForo convertir(ComentarioForoTO comentarioForoTO) {

		ComentarioForo comentarioForo = new ComentarioForo();
		comentarioForo.setComentario(comentarioForoTO.getComentario());
		comentarioForo.setFecha(comentarioForoTO.getFecha());
		comentarioForo.setUsuario(comentarioForoTO.getUsuario());
		comentarioForo.setTema(comentarioForoTO.getTema());

		return comentarioForo;

	}
	
	private ComentarioForoTO convertirTO(ComentarioForo comentarioForo) {
		
		ComentarioForoTO comentarioForoTO =  new ComentarioForoTO();
		
		comentarioForoTO.setComentario(comentarioForo.getComentario());
		comentarioForoTO.setFecha(comentarioForo.getFecha());
		comentarioForoTO.setUsuario(comentarioForo.getUsuario());
		
		return comentarioForoTO;
		
	}
	

	@Override
	public List<ComentarioForoTO> buscarTodosPorTemaID(Integer id) {
		// TODO Auto-generated method stub
		List<ComentarioForo> lista = new ArrayList<>();
		List<ComentarioForoTO> listaTO =new ArrayList<>();

		//List<ComentarioForo> lista = this.iComentarioForoRepository.buscarTodosPorTemaID(id);
		try {
			lista = this.iComentarioForoRepository.buscarTodosPorTemaID(id);
			listaTO =  lista.stream().map(l->this.convertirTO(l)).collect(Collectors.toList());
			return listaTO;
		} catch (Exception e) {
			// TODO: handle exception
			
			return listaTO;
		}
		
		
		
	}

}
