package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.service.INoticiaService;
import com.example.demo.service.to.NoticiaTO;

@Controller
@CrossOrigin
@RequestMapping(path = "/noticias")
public class NoticiaControllerRestFul {

	@Autowired
	private INoticiaService iNoticiaService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public void guardar(@RequestBody NoticiaTO noticiaTO) {
		
		this.iNoticiaService.insertar(noticiaTO);
	}

	@GetMapping
	public ResponseEntity<List<NoticiaTO>> consultarTodos() {
		List<NoticiaTO> lista = this.iNoticiaService.buscarTodos();
		return new ResponseEntity<>(lista, null, 200);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<NoticiaTO> consultarPorId(@PathVariable Integer id) {
			NoticiaTO noticiaTO = this.iNoticiaService.buscarPorId(id);
		return new ResponseEntity<>(noticiaTO, null, 200);
	}
}
