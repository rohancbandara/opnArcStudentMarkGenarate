package com.rcb.service;

import java.util.List;
import com.rcb.dao.StudentDAO;
import com.rcb.dao.StudentDAOImpl;
import com.rcb.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO = new StudentDAOImpl();
	Student student = new Student();

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.insertStudent(createNewStudent(student));
		return false;
	}

	@Override
	public List<Student> listAllStudent() {
		// TODO Auto-generated method stub

		return studentDAO.listAllStudent();
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.deleteStudent(createNewStudent(student));
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.updateStudent(createNewStudent(student));
		System.out.println("updated!!!!!!");
		return false;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	private Student createNewStudent(Student stu) {
		student.setStuId(stu.getStuId());
		student.setStuName(stu.getStuName());
		student.setAdNo(stu.getAdNo());
		student.setAdStree1(stu.getAdStree1());
		student.setAdStree2(stu.getAdStree2());
		student.setAdCity(stu.getAdCity());
		student.setClID(stu.getClID());
		return student;
	}

	@Override
	public List<Student> listSelectedStudent(int id) {
		// TODO Auto-generated method stub
		return studentDAO.listSelectedStudent(id);
	}

}
