package com.example.springboot.fields;

public class Field {
	private Integer id;
	private String name;
	private String description;
	
	public Field() {
		this.id = 0;
		this.name = "";
		this.description = "";
		}
	
	public Field(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Integer getId() {
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
