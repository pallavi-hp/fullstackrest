package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userInfo")
public class User implements Serializable {
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="userid",length=5)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="username")
	private String userName;
	@Column(name="passord")
	private String password;

}
