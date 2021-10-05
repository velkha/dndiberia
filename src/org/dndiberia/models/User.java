package org.dndiberia.models;

public class User {
	private String password;
	private String passcrypt;
	private int activo;
	private UserContext userContext;
	public User(String password, String passcrypt, int activo, UserContext userContext) {
		super();
		this.password = password;
		this.passcrypt = passcrypt;
		this.activo = activo;
		this.userContext = userContext;
	}
	
}
