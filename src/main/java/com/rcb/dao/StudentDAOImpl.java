package com.rcb.dao;

import java.util.List;

import com.mysql.jdbc.Statement;
import com.rcb.model.Student;
import com.rcb.utility.DbConnection;

public class StudentDAOImpl extends DbConnection implements StudentDAO {

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			putData("INSERT INTO tblStudent(stuName,adNo,adStreet1,adStreet2,adCity,clId) VALUES ('"+student.getStuName()+"','"+student.getAdNo()+"','"+student.getAdStree1()+"','"+student.getAdStree2()+"','"+student.getAdCity()+"','"+student.getClID()+"')");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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
