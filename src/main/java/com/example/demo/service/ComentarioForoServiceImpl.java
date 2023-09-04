package com.example.demo.service;

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

}
