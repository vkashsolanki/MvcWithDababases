package com.androjava.repository;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.androjava.model.UserModel;

@Transactional(readOnly = false) 
public class UserRepository {

	static private HibernateTemplate template;  
	static public HibernateTemplate getTemplate() {
		return template;
	}
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	
    @Transactional(readOnly = false)	
	public UserModel saveUser(UserModel model) 
	{
          template.save(model);
	 		return null;
 		
	}
	

	
	 
	
}
