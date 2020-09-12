package com.manipal.assignement.Maven_Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.bean.Line;
import com.manipal.bean.Triangle;

public class ShapeApplication {

	public static void main(String[] args) {
		
//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\beans.xml");
	
		Line l1= (Line) context.getBean("line");
		System.out.println(l1);
		
		Triangle t1= (Triangle) context.getBean("triangle");
		System.out.println(t1);
		

	}

}
