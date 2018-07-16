package com.iotek.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iotek.entity.Person;

public class Main {
	public static void main(String[] args) {
		//1.����Spring����
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//2.�������л�ȡ����Ҫ��Bean
        //context.getBean(Person.class);
		Person p = (Person) context.getBean("person5");
		//3.��ӡ����
		System.out.println(p);
	}
}
