package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IComentarioForoService;
import com.example.demo.service.to.ComentarioForoTO;

@RestController
@RequestMapping("/comentarioforo")
@CrossOrigin

public class ComentarioForoControllerRestFul {
	
	@Autowired
	private IComentarioForoService iComentarioForoService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)

	private void insertar(@RequestBody ComentarioForoTO comentarioForoTO) {
		
		this.iComentarioForoService.insertar(comentarioForoTO);
	}


}
