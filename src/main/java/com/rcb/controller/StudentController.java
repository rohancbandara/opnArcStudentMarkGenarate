package com.rcb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rcb.model.Student;
import com.rcb.service.StudentService;
import com.rcb.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getServletPath();
		System.out.println(action);
		try {
			switch (action) {
			
			case "/insert":
				insertStudent(request, response);
				break;
			case "/update":
				updateStudent(request,response);
			default:
				System.out.println("home");
			
			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		StudentService stuService=new StudentServiceImpl();
		Student st=new Student();
		st.setStuId(1);
		stuService.updateStudent(st);
	}

	private void insertStudent(HttpServletRequest request, HttpServletResponse response) {
		StudentService stuService=new StudentServiceImpl();
		Student st=new Student();
			st.setStuName("rohan");
			st.setClID(1);
		stuService.insertStudent(st);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
