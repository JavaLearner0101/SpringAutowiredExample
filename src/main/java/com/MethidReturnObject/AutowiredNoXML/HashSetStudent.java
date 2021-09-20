package com.MethidReturnObject.AutowiredNoXML;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HashSetStudent {
	
	Set<Student> studentHashSet = new HashSet<Student>();

	public void add(Student student) {
		studentHashSet.add(student);
	}

	public Student find(int id) {
		Student retunobj =null;
		for (Student st : studentHashSet)
			if (st.getId() == id) {
				retunobj = st;
			}
		return retunobj;
	}
}
