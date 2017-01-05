package com.niit.osmacart.dao;

import java.util.ArrayList;
import java.util.List;

import com.niit.osmacart.model.Category;
import com.niit.osmacart.model.Product;
import com.niit.osmacart.model.Supplier;
public interface CategoryDAO {
	//CRUD Operations create save update delete 
public void save(Category category);
	
	public boolean update(Category category);
	
	public void removeCategory(int id);
	
	public Category get(int id); 
	
	public List<Category> list();

	
	
	
	}


