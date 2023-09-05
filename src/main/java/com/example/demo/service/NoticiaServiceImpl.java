package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.INoticiaRepository;
import com.example.demo.repository.modelo.Noticia;
import com.example.demo.service.to.NoticiaTO;

@Service
public class NoticiaServiceImpl implements INoticiaService {

	@Autowired
	private INoticiaRepository iNoticiaRepository;

	@Override
	public void insertar(NoticiaTO noticiaTO) {
		// TODO Auto-generated method stub

		this.iNoticiaRepository.insertar(this.convertir(noticiaTO));

	}

	private Noticia convertir(NoticiaTO noticiaTO) {
		Noticia noticia = new Noticia();
		noticia.setDescripcion(noticiaTO.getDescripcion());
		noticia.setFecha(noticiaTO.getFecha());
		noticia.setImagen(noticiaTO.getImagen());
		noticia.setUsuario(noticiaTO.getUsuario());
		noticia.setTitulo(noticiaTO.getTitulo());
		noticia.setVideo(noticiaTO.getVideo());

		return noticia;
	}

	@Override
	public List<NoticiaTO> buscarTodos() {
		// TODO Auto-generated method
		List<Noticia> list = new ArrayList<>();
		List<NoticiaTO> noticiaTOs = new ArrayList<>();

		try {
			list = this.iNoticiaRepository.buscarTodos();
			noticiaTOs = list.stream().map(noticia -> this.convertirTO(noticia)).collect(Collectors.toList());
			return noticiaTOs;
		} catch (Exception exception) {
			return noticiaTOs;
		}

	}

	private NoticiaTO convertirTO(Noticia noticia) {
		NoticiaTO noticiaTO = new NoticiaTO();
		noticiaTO.setId(noticia.getId());
		noticiaTO.setDescripcion(noticia.getDescripcion());
		noticiaTO.setFecha(noticia.getFecha());
		noticiaTO.setImagen(noticia.getImagen());
		noticiaTO.setUsuario(noticia.getUsuario());
		noticiaTO.setTitulo(noticia.getTitulo());
		noticiaTO.setVideo(noticia.getVideo());

		return noticiaTO;

	}

	@Override
	public NoticiaTO buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.convertirTO(this.iNoticiaRepository.buscarPorId(id));
	}

}
