package com.rcb.dao;

import java.util.List;

import com.rcb.model.Student;

public interface StudentDAO {
	public abstract boolean insertStudent(Student student);

	public abstract List<Student> listAllStudent();

	public abstract boolean deleteStudent(Student student);

	public abstract boolean updateStudent(Student student);

	public abstract Student getStudent(int id);
}
