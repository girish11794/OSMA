package com.niit.osmacart.osmacartbackend;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.osmacart.dao.ProductDAO;
import com.niit.osmacart.model.Product;


public class ProductTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static ProductDAO productDAO;
	
	@Autowired
	static Product product;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		productDAO=(ProductDAO) context.getBean("productDAO");
		product=(Product) context.getBean("product");
		
	}
	
	/*@Test
	public void saveProductTestCase()
	{
		product.setId("suv07");
		product.setName("this is");
		product.setPrice("25");
		
		
						Boolean status=productDAO.save(product);
		Assert.assertEquals("save product test case",true,status);
	}*/
	

}
