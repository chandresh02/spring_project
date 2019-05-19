package com.xworkz.food.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.food.app.Hotel;

public class SpringTester {
//creating a class
	
	public static void main(String[] args) {
		
		String pathOfXml="resource/spring.xml";
		
		ApplicationContext spring=new ClassPathXmlApplicationContext(pathOfXml);
		
		int beanCount=spring.getBeanDefinitionCount();
		
		System.out.println("beancount is::" +beanCount);
		Hotel refOfHotel=spring.getBean(Hotel.class);
		refOfHotel.order("idly", 2);
                    
	}
}
