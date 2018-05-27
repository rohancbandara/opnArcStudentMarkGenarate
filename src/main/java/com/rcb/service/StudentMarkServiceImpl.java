package com.rcb.service;

import java.util.List;

import com.rcb.model.Student;
import com.rcb.utility.DbConnection;

public class StudentMarkServiceImpl extends DbConnection implements StudentService {

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> listAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listSelectedStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
