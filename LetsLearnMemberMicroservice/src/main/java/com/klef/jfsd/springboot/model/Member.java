package com.klef.jfsd.springboot.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="member_table")
public class Member 
{
  @Column(name = "member_name" ,nullable = false,length = 30)	
  private String name;
  @Id
  @Column(name = "member_id") 
  private int id;
  @Column(name="member_gender",nullable = false,length = 20)
  private String gender;
  @Column(name = "member_username" ,unique = true,length = 30,nullable = false)
  private String username;
  @Column(name = "member_contact",unique = true,length = 10,nullable=false)
  private String contactno;
  @Column(name = "member_email",unique = true,length = 30,nullable=false)
  private String email;
  @Column(name = "member_password",length = 20,nullable=false)
  private String password;
  
  @Column(name="profileimage")
  private Blob image;
  
  public Blob getImage() {
	return image;
}
  
public void setImage(Blob image) {
	this.image = image;
}

public String getResetToken() {
	return resetToken;
}
public void setResetToken(String resetToken) {
	this.resetToken = resetToken;
}
@Column(name = "reset_token")
  private String resetToken;
  
//  @Lob 
//  @Column(name = "member_image")
//  private byte[] image;
//
//  
//  
//public byte[] getImage() {
//	return image;
//}
//
//public void setImage(byte[] image) {
//	this.image = image;
//}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

  
}
