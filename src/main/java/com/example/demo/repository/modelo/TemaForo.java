package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tema_foro")
@JsonIgnoreProperties(value = {"usuario", "comentarios"})
public class TemaForo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tefo_id_seq")
	@SequenceGenerator(name = "tefo_id_seq", sequenceName = "tefo_id_seq", allocationSize = 1)
	@Column(name = "tefo_id")
	private Integer id;
	@Column(name = "tefo_titulo")
	private String titulo;
	@Column(name = "tefo_descripcion")
	private String descripcion;
	@Column(name = "tefo_fecha")
	private LocalDateTime fecha;

	@ManyToOne
	@JoinColumn(name = "tefo_id_usuario")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "tema", fetch= FetchType.LAZY)
	private List<ComentarioForo> comentarios;

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	
	public List<ComentarioForo> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<ComentarioForo> comentarios) {
		this.comentarios = comentarios;
	}
}
