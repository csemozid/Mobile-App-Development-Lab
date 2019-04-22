package com.example.Information.Models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class People {
	@Id
	public ObjectId _id;
	public String name;
	public String city;
	public String phone;
	public String get_id() {
		return  _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public People(ObjectId _id, String name, String city, String phone) {
		super();
		this._id = _id;
		this.name = name;
		this.city = city;
		this.phone = phone;
	}
	
	

}
