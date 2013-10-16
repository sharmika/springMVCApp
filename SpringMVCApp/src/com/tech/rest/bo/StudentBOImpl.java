package com.tech.rest.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tech.rest.dao.StudentDao;
import com.tech.rest.model.Student;

@Component
public class StudentBOImpl implements StudentBO{
	
	@Autowired
	StudentDao studentDao;

	@Override
	public void insertDetails(Student student) {
		// TODO Auto-generated method stub
		studentDao.insertDetails(student);
		
	}

}
