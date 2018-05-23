package com.rcb.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.rcb.model.Student;
import com.rcb.utility.DbConnection;

public class StudentDAOImpl extends DbConnection implements StudentDAO {

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			putData("INSERT INTO tblStudent(stuName,adNo,adStreet1,adStreet2,adCity,clId) VALUES ('"
					+ student.getStuName() + "','" + student.getAdNo() + "','" + student.getAdStree1() + "','"
					+ student.getAdStree2() + "','" + student.getAdCity() + "','" + student.getClID() + "')");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Student> listAllStudent() {
		// TODO Auto-generated method stub
		List<Student> listStudent=new ArrayList<>();
		try {
			Student stu=new Student();
			String  sql="SELET * FROM tblStudent";
			ResultSet rs=getData(sql);
			while(rs.next()) {
				
				stu.setStuId(rs.getInt("stuId"));
				stu.setStuName(rs.getString("stuName"));
				stu.setAdNo(rs.getString("adNo"));
				stu.setAdStree1(rs.getString("adStreet1"));
				stu.setAdStree2(rs.getString("adStreet2"));
				stu.setAdCity(rs.getString("adCity"));
				stu.setClID(rs.getInt("clId"));
				
				listStudent.add(stu);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listStudent;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			String sql = "DELETE FROM tblStudent WHERE stuId='" + student.getStuId() + "'";
			putData(sql);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			String sql = "UPDATE tblStudent set stuName='" + student.getStuName() + "',adNo='" + student.getAdNo()
					+ "',adStreet1='" + student.getAdStree1() + "',adStreet2='" + student.getAdStree2() + "',adCity='"
					+ student.getAdCity() + "',clId='" + student.getClID() + "' WHERE stuId='" + student.getStuId() + "'";
			putData(sql);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
