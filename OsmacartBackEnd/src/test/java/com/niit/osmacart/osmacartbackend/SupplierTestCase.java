package com.niit.osmacart.osmacartbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.osmacart.config.ApplicationContextConfig;
import com.niit.osmacart.dao.SupplierDAO;
import com.niit.osmacart.model.Supplier;

public class SupplierTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static SupplierDAO supplierDAO;
	
	@Autowired
	static Supplier supplier;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		supplierDAO=(SupplierDAO) context.getBean("supplierDAO");
		supplier=(Supplier) context.getBean("supplier");
		
	}
	
	/*@Test
	public void saveSupplierTestCase()
	{
		supplier.setId("123");
		supplier.setName("this is");
		supplier.setAddress("gas");
		
		
						Boolean status=supplierDAO.save(supplier);
		Assert.assertEquals("save supplier test case",true,status);
	}*/
}
