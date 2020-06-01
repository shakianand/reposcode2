package org.xmlsa;

import javax.xml.bind.annotation.XmlRootElement;

//connects xml and POJO class
@XmlRootElement

public class Employee {
	
	//private variables
	private int id;
	private String name;
	private String email;
	private long phone;
	
	//getters and setters

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	

}
