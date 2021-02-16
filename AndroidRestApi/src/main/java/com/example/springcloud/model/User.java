package com.example.springcloud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
@javax.persistence.Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id;
@Column(name = "Name")
private String name;
@Column(name = "Phone")
private String phone;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
	
}
