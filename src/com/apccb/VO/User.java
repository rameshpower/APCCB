package com.apccb.VO;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 4615872949936784403L;
	private String username;
	private String password;
	private boolean isAuthenticated;
	private String unitCode;
	private String userType;
	private String unitType;
	private String appUser;

	public User() {
		this.username = "";
		this.password = "";
		this.isAuthenticated = false;
		this.unitCode = "";
		this.userType = "";
		this.unitType = "";
		this.appUser = "";
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getToken() {
		String token = "";
		if (this.isAuthenticated) {
			token = this.appUser + "_" + this.userType + "_" + this.unitType + "_" + this.unitCode;
		}
		return token;
	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getAppUser() {
		return appUser;
	}

	public void setAppUser(String appUser) {
		this.appUser = appUser;
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

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	private String usercode;
}
