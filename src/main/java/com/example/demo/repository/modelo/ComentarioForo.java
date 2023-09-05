package com.example.demo.repository.modelo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentario_foro")
@JsonIgnoreProperties(value = { "usuario", "tema"})
public class ComentarioForo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cofo_id_seq")
	@SequenceGenerator(name = "cofo_id_seq", sequenceName = "cofo_id_seq", allocationSize = 1)
	@Column(name = "cofo_id")
	private Integer id;
	@Column(name = "cofo_comentario")
	private String comentario;
	@Column(name = "cofo_fecha")
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "cofo_usuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "cofo_tema")
	private TemaForo tema;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TemaForo getTema() {
		return tema;
	}

	public void setTema(TemaForo tema) {
		this.tema = tema;
	}
	

	
	
}
