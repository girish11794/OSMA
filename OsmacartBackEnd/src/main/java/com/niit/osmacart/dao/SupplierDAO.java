package com.niit.osmacart.dao;

import java.util.List;

import com.niit.osmacart.model.Category;
import com.niit.osmacart.model.Supplier;

public interface SupplierDAO {
public void save(Supplier supplier);
	
	public boolean update(Supplier supplier);
	
	public void removeSupplier(int id);
	
	public Supplier get(int id); 
	
	public List<Supplier> list();
}
