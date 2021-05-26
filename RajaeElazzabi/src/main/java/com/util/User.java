package com.util;

public class User {

	int id;
	String login,pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", pass=" + pass + "]";
	}
	
	
}
