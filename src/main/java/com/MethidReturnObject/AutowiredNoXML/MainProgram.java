package com.MethidReturnObject.AutowiredNoXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProgram {

	public static void main(String[] args) {
	
		
		Student student = new Student();
		//		HashSetStudent hss = new HashSetStudent();
		AnnotationConfigApplicationContext context  =  new AnnotationConfigApplicationContext(SpringConfiguration.class);
		HashSetStudent hss = context.getBean("hashSetStudent", HashSetStudent.class );
		
		
		student.setId(1);
		student.setName("Rajesh");
		student.setHostelAcc(true);
		student.setBranch("CS");
		student.setState("AP");
		hss.add(student);
		student.setId(2);
		student.setName("Ritesh");
		student.setHostelAcc(false);
		student.setBranch("CS");
		student.setState("Bihar");
		hss.add(student);

		student = hss.find(2);
		if (student.getName() == null) {
			System.out.println("No student with that ID");
		} else {
			System.out.println(student.getName());
		}
		context.close();
	}
	
}
