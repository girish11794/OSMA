package com.niit.osmacart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;


@Entity
@Table(name="CATEGORY")
@Component
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	@Column
	@Size(min=2,max=10,message="Name has to be between 2 to 10 characters")
	private String name;
	
	@Column
	@Size(min=2,max=10,message="Name has to be between 2 to 10 characters")
	private String description;
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	


}


	