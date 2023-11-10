package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee 
{   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int id;
	@Column(name="employee_name",length = 30,nullable = false)
	private String name;
	@Column(name="employee_gender",length = 10,nullable = false)
	private String gender;
	@Column(name="employee_username",length = 30,unique = true,nullable = false)
	private String username;
	@Column(name="employee_joineddate",length = 12,nullable = false)
	private String joinedDate;
	@Column(name="employee_email",length = 30,unique = true,nullable = false)
	private String email;
	@Column(name="employee_contact",length = 10,nullable = false,unique = true)
	private String contact;
	@Column(name="employee_password",length = 30,nullable = false)
	private String password;
	
	@Column(name="employee_status")
	private boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	

}
