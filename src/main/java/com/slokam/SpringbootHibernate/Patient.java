package com.slokam.SpringbootHibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private double phone;
	
	public Patient(Integer id, String name, double phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}

}
