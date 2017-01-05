package com.niit.osmacart.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.osmacart.dao.SupplierDAO;
import com.niit.osmacart.model.Category;
import com.niit.osmacart.model.Supplier;
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	 SessionFactory sessionFactory;
				
		@Autowired
		public SupplierDAOImpl(SessionFactory sessionFactory )
		{
			this.sessionFactory=sessionFactory;
		}
		@Transactional
public void save(Supplier supplier) {
			Session session=sessionFactory.getCurrentSession();
						session.persist(supplier);
}
	
		@Transactional
	public boolean update(Supplier supplier) {
		
		try{
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		
	}
	}
	
		@Transactional
		public void removeSupplier(int id) {
			Session session=sessionFactory.getCurrentSession();
			Supplier Supplier=(Supplier)session.createQuery("from Supplier where id="+id).getSingleResult();
			session.delete(Supplier);
			
		}

	
		@Transactional
	public Supplier get(int id) {
		
		return (Supplier) sessionFactory.openSession().get(Supplier.class,id);
	}
		@Transactional
	public List<Supplier> list() {
		
String hql = "from Supplier";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		return query.list();
				}
		

	

}
