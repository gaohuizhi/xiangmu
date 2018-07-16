package com.iotek.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iotek.entity.Person;

public class Main {
	public static void main(String[] args) {
		//1.创建Spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//2.从容器中获取我想要的Bean
        //context.getBean(Person.class);
		Person p = (Person) context.getBean("person5");
		//3.打印出来
		System.out.println(p);
	}
}
