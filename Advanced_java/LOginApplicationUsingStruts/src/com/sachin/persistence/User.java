package com.sachin.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tk_user")
public class User {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
	@Column(name = "id")
    private int id ;
	
    @Column(name = "tk_username")
	private String username ;
	
    @Column(name = "tk_password")
	private String password;
	
	
	

}
