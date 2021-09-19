package com.MethidReturnObject.AutowiredNoXML;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HashSetStudent {
	@Autowired
	Student student;
	Set<Student> studentHashSet = new HashSet<Student>();

	public void add(Student student) {
		studentHashSet.add(new Student(student.getId(), student.getName(), student.getBranch(), student.isHostelAcc(),
				student.getState()));
	}

	public Student find(int id) {
		for (Student st : studentHashSet)
			if (st.getId() == id) {
				student.setId(st.getId());
				student.setName(st.getName());
				student.setBranch(st.getBranch());
				student.setHostelAcc(st.isHostelAcc());
				student.setState(st.getState());
			}
		return student;
	}
}
