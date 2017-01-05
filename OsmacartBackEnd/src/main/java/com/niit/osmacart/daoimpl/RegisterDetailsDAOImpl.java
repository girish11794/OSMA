package com.niit.osmacart.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.osmacart.dao.RegisterDetailsDAO;
import com.niit.osmacart.model.RegisterDetails;
@Transactional
@Repository("registerDetailsDAO")
public class RegisterDetailsDAOImpl implements RegisterDetailsDAO {

	@Autowired
	 SessionFactory sessionFactory;
				
		@Autowired
		public RegisterDetailsDAOImpl(SessionFactory sessionFactory )
		{
			this.sessionFactory=sessionFactory;
		}
		
		public RegisterDetails getInfo(String lc) {
		// TODO Auto-generated method stub
		try{
			((RegisterDetailsDAO) sessionFactory.getCurrentSession()).getInfo(lc);
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
	}
		return null;

	
	
}
}
