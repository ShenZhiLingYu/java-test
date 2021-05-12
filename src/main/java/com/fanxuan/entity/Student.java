package com.fanxuan.entity;

public class Student {
	private Integer id;
	private String name;
	private Integer class_id;
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
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", class_id=" + class_id + "]";
	}

	
	
	
}
