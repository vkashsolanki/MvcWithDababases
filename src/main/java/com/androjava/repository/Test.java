package com.androjava.repository;
 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
 
		 	try
		{
		  ApplicationContext r=new FileSystemXmlApplicationContext("D://HibernateSpring2023//MvcWithDababase//MvcWithDababase//src//main//webapp//WEB-INF//spring-servlet.xml");  
		     
		      
		    UserRepository dao=(UserRepository)r.getBean("d");
		    
		    
		   System.out.println(dao);
		    
		}
		catch (Exception e) {
			 e.printStackTrace();
		}
	}
	
}
