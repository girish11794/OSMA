package com.niit.osmacart.dao;

import java.util.ArrayList;
import java.util.List;

import com.niit.osmacart.model.Category;
import com.niit.osmacart.model.Product;

public interface ProductDAO {
	public void save(Product product);
	
	public boolean update(Product product);
	
	public List<Product> listProduct();
	
	public Product getProductById(int id);
	
	public void removeProduct(int id);


	
}
