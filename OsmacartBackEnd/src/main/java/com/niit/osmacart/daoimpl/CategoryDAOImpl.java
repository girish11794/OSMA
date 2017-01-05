package com.niit.osmacart.daoimpl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.osmacart.dao.CategoryDAO;
import com.niit.osmacart.model.Category;
import com.niit.osmacart.model.Product;
import com.niit.osmacart.model.Supplier;

@Repository("categoryDAO")
@EnableTransactionManagement
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	 SessionFactory sessionFactory;
				
		@Autowired
		public CategoryDAOImpl(SessionFactory sessionFactory )
		{
			this.sessionFactory=sessionFactory;
		}
		@Transactional
public void save(Category category) {
			Session session=sessionFactory.getCurrentSession();
						session.persist(category);
}
	
		@Transactional
	public boolean update(Category category) {
		
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		
	}
	}
	
		@Transactional
		public void removeCategory(int id) {
			Session session=sessionFactory.getCurrentSession();
			Category Category=(Category)session.createQuery("from Category where id="+id).getSingleResult();
			session.delete(Category);
			
		}

	
		@Transactional
	public Category get(int id) {
		
		return (Category) sessionFactory.openSession().get(Category.class,id);
	}
		@Transactional
	public List<Category> list() {
		
String hql = "from Category";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
				}
		


	
}





	


				
					
				
				

