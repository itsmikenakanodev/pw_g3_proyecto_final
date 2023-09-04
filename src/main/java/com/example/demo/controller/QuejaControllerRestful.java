package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IQuejaService;
import com.example.demo.service.to.QuejaTO;

@RestController
@RequestMapping("/quejas")
@CrossOrigin
public class QuejaControllerRestful {

	@Autowired
	private IQuejaService iQuejaService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public void guardarQueja(@RequestBody QuejaTO queja) {
		this.iQuejaService.insertarQueja(queja);
	}

	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<QuejaTO>> consultarTodos() {
		List<QuejaTO> lista = this.iQuejaService.consultarTodosTO();
		return new ResponseEntity<>(lista, null, 200);
	}

}
