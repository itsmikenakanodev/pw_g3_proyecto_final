package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usua_id_seq")
	@SequenceGenerator(name = "usua_id_seq", sequenceName = "usua_id_seq", allocationSize = 1)
	@Column(name = "usua_id")
	private Integer id;
	@Column(name = "usua_nombre")
	private String nombre;
	@Column(name = "usua_apellido")
	private String apellido;
	@Column(name = "usua_usuario")
	private String usuario;
	@Column(name = "usua_correo")
	private String correo;
	@Column(name = "usua_contraseña")
	private String contraseña;
	@Column(name = "usua_semestre")
	private String semestre;
	@Column(name = "usua_cedula")
	private String cedula;
	@Column(name = "usua_direccion")
	private String direccion;
	
	@OneToMany(mappedBy = "usuario")
	private List<Noticia> noticias;
	
	@OneToMany(mappedBy = "usuario")
	private List<TemaForo> temas;
	
	@OneToMany(mappedBy = "usuario")
	private List<ComentarioForo> comentarios;
	
	@OneToMany(mappedBy = "usuario")
	private List<Queja> quejas;
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
	private Suscripcion suscripcion;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Noticia> getNoticias() {
		return noticias;
	}
	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}
	public List<TemaForo> getTemas() {
		return temas;
	}
	public void setTemas(List<TemaForo> temas) {
		this.temas = temas;
	}
	public List<ComentarioForo> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<ComentarioForo> comentarios) {
		this.comentarios = comentarios;
	}
	public List<Queja> getQuejas() {
		return quejas;
	}
	public void setQuejas(List<Queja> quejas) {
		this.quejas = quejas;
	}
	public Suscripcion getSuscripcion() {
		return suscripcion;
	}
	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}
	
	
	
	
}
