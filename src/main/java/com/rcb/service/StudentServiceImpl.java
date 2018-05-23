package com.rcb.service;

import java.util.List;

import com.rcb.dao.StudentDAO;
import com.rcb.dao.StudentDAOImpl;
import com.rcb.model.Student;

public class StudentServiceImpl implements StudentService{
private StudentDAO studentDAO=new StudentDAOImpl();
Student student=new Student();
	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.insertStudent(createStudent(student));
		return false;
	}
	
	private Student createStudent(Student stu) {
		
		student.setStuName(stu.getStuName());
		student.setClID(stu.getClID());
		return student;
	}
	
	

	@Override
	public List<Student> listAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudenr(Student student) {
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

}
