package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Persona implements Serializable {

	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	private String nombre;
	private String apellido;
	private int dni;
	
@OneToOne(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	private Domicilio domicilio;

	
	public Persona() {
		
	}


	public Persona(String nombre, String apellido, int dni) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public Domicilio getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}



	

}
