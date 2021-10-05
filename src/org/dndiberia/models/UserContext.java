package org.dndiberia.models;

import javax.annotation.Nullable;

public class UserContext {
	private String username;
	private String uid;
	private int role;
	@Nullable
	private String userRealName;
	@Nullable
	private int userAge;
	
	
	
	public UserContext(String username, String uid, int role) {
		super();
		this.username = username;
		this.uid = uid;
		this.role = role;
	}
	
	public UserContext(String username, String uid, int role, String userRealName, int userAge) {
		this(username, uid, role);
		this.userRealName = userRealName;
		this.userAge = userAge;
	}
	
	public UserContext(String username, String uid, int role, String userRealName) {
		this(username, uid, role);
		this.userRealName = userRealName;
	}
	
	public UserContext(String username, String uid, int role, int userAge) {
		this(username, uid, role);
		this.userAge = userAge;
	}

	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUsername() {
		return username;
	}
	public String getUid() {
		return uid;
	}
	public int getRole() {
		return role;
	}
	
}
