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
@Table(name = "noticia")
@JsonIgnoreProperties(value = "usuario")
public class Noticia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "noti_id_seq")
	@SequenceGenerator(name = "noti_id_seq", sequenceName = "noti_id_seq", allocationSize = 1)
	@Column(name = "noti_id")
	private Integer id;
	@Column(name = "noti_titulo")
	private String titulo;
	@Column(name = "noti_descripcion")
	private String descripcion;
	@Column(name = "noti_imagen")
	private String imagen;
	@Column(name = "noti_video")
	private String video;
	@Column(name = "noti_fecha")
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "noti_id_usuario")
	private Usuario usuario;
	
	//SET Y GET
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
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
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
	
	
	
}
