package com.androjava.service;

import javax.transaction.Transactional;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.androjava.model.UserModel;
import com.androjava.repository.UserRepository;

@org.springframework.transaction.annotation.Transactional(readOnly = false)
public class UserServerImp implements UserService
{



    @org.springframework.transaction.annotation.Transactional(readOnly = false)
	public UserModel saveUser(UserModel model) 
	{
		//HibernateTemplate hibernateTemplate=UserRepository.getTemplate();
		 ApplicationContext r=new FileSystemXmlApplicationContext("D://HibernateSpring2023//MvcWithDababase//MvcWithDababase//src//main//webapp//WEB-INF//spring-servlet.xml");  
		    UserRepository dao=(UserRepository)r.getBean("d");	   
		    dao.getTemplate().save(model);
//		    
//		    Session session=dao.getTemplate().getSessionFactory().getCurrentSession();
//		    session.save(model);
//		    session.beginTransaction().commit();
//		    session.close();
		    
		    dao.getTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
		    
	 		return null;

	 		
	}
	
	

}
