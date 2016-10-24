package com.mintapple.entity;

import javax.persistence.Id;

public class User {

	@Id
	private String id;
	private String name;
	private String type;
	private String password;
	private String description;
	private String status;
	public User(String id, String name, String type, String password, String description, String status) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
		this.description = description;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + ", description="
				+ description + ", status=" + status + "]";
	}
	
}
