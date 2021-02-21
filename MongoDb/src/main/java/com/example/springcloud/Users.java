package com.example.springcloud;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {
@Id
private String id;
private String name;
private String address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Users(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
public Users(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}


}
