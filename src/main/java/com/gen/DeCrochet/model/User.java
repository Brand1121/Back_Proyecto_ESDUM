package com.gen.DeCrochet.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long id;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="phone_number",nullable=false)
	private String phoneNumber;
	@Column(name="name",nullable=false)
	private String name;
	@Column(name="password",nullable=false)
	private String password;
	
	//@OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval = true)
	//private Set<Address> address = new HashSet<>();
	
	//@OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval = true)
	//private Set<Orden> orden = new HashSet<>();
	
	
//	public User() {
//		
//	}
//
//
//	public User(long idUsuario, String email, String phoneNumber, String name) {
//		super();
//		this.idUser = idUsuario;
//		this.email = email;
//		this.phoneNumber = phoneNumber;
//		this.name = name;
//	}


	public long getIdUsuario() {
		return id;
	}


	public void setIdUsuario(long idUsuario) {
		this.id = idUsuario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
