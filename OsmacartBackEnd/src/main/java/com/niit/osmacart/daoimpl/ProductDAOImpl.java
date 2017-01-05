package com.niit.osmacart.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.osmacart.dao.ProductDAO;
import com.niit.osmacart.model.Category;
import com.niit.osmacart.model.Product;
import com.niit.osmacart.model.Supplier;
@Repository("productDAO")
@EnableTransactionManagement
public class ProductDAOImpl implements ProductDAO {
	@Autowired(required=true)
	SessionFactory sessionFactory;
@Transactional
	public void save(Product product) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.persist(product);
		
	}
@Transactional
	public boolean update(Product product) {
	try{
		sessionFactory.getCurrentSession().update(product);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	
}
	}
@Transactional
	public List<Product> listProduct() {
		Session session=sessionFactory.getCurrentSession();
		List<Product> products=session.createQuery("from Product").getResultList();
		return products;
	}
@Transactional
	public Product getProductById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.createQuery("from Product where id="+id).getSingleResult();
		return product;
	}
@Transactional
	public void removeProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.createQuery("from Product where id="+id).getSingleResult();
		session.delete(product);
		
	}


			}


