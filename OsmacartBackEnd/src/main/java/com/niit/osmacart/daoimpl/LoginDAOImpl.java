package com.niit.osmacart.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.osmacart.model.Login;




@Transactional
@Repository("loginDAO")
public class LoginDAOImpl {
	@Autowired
	 SessionFactory sessionFactory;
	@Autowired
	public LoginDAOImpl(SessionFactory sessionFactory )
	{
		this.sessionFactory=sessionFactory;
	}
	
	public boolean save(Login login) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().save(login);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		
	}
	}
}
