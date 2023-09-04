package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ITemaForoService;
import com.example.demo.service.to.TemaForoTO;

@RestController
@RequestMapping("/temasforo")
@CrossOrigin
public class TemaForoControllerRestFul {
	
	@Autowired
	private ITemaForoService iTemaForoService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)

	private void insertar(@RequestBody TemaForoTO temaForoTO) {
		
		this.iTemaForoService.insertar(temaForoTO);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<TemaForoTO>> buscarTodos(){
		return new ResponseEntity<>(this.iTemaForoService.buscarTodos(),null,200);
	}
	
	@GetMapping(path = "/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)

	private ResponseEntity<TemaForoTO> buscarPorId(@PathVariable Integer id){
		
		return new ResponseEntity<>(this.iTemaForoService.buscarPorId(id),null,200);

	}

}
