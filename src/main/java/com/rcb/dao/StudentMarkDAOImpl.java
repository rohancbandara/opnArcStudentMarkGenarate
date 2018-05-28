package com.rcb.dao;

import java.util.List;

import com.rcb.model.StudentMark;
import com.rcb.utility.DbConnection;

public class StudentMarkDAOImpl extends DbConnection implements StudentMarkDAO {

	@Override
	public boolean insertStudentMark(StudentMark studentMark) {
		// TODO Auto-generated method stub
		try {
			String sql1 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId1()
					+ "','" + studentMark.getSubMark1() + "')";
			String sql2 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId2()
					+ "','" + studentMark.getSubMark2() + "')";
			String sql3 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId3()
					+ "','" + studentMark.getSubMark3() + "')";
			String sql4 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId4()
					+ "','" + studentMark.getSubMark4() + "')";
			String sql5 = "INSERT INTO tblStudentMark(date,studentId,subjectId,stmMark) VALUES('"
					+ studentMark.getDate() + "','" + studentMark.getStudentId() + "','" + studentMark.getSubId5()
					+ "','" + studentMark.getSubMark5() + "')";
			
			putData(sql1);
			putData(sql2);
			putData(sql3);
			putData(sql4);
			putData(sql5);
			return true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<StudentMark> listAllStudentMark() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudentMark(StudentMark studentMark) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudentMark(StudentMark studentMark) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StudentMark getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentMark> listSelectedStudentMark(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
