package com.niit.osmacart.osmacartbackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.osmacart.dao.CategoryDAO;
import com.niit.osmacart.model.Category;
public class CategoryTestCase  {
		@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Category category;

	@Autowired
	static CategoryDAO categoryDAO;

	@BeforeClass
	@Autowired
	public static void init()
	{
		
		context=new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
		 		 category=(Category) context.getBean("category");
		 		
			System.out.println("objects are created");
			}
		/*@Test
			public void saveCategoryTestCase()
	{
		
		category.setName("mo");
		category.setDescription("boo");
		Boolean status=categoryDAO.addCategory(category);
		Assert.assertEquals("save category test case",true,status);
		}*/
		/*@Test
		public void deleteCategoryTestCase()
		{
			category.setId("123");
			Boolean status=categoryDAO.delete(category);
			Assert.assertEquals("delete category test case",true,status);
		}*/
	/*@Test
		public void updateCategoryTestCase()
		{
			category.setId("123");
			category.setName("boos");
						category.setDescription("mox");
						Boolean status=categoryDAO.update(category);
						Assert.assertEquals("update category test case",true,status);
						
			
		}
		*/
	
		
	}
