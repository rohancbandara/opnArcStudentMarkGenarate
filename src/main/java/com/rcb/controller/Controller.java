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
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		System.out.println(action);
		try {
			switch (action) {
			case "/allStudents":
				allStudents(request,response);
			case "/insertStudent":
				insertStudent(request, response);
				break;
			case "/updateStudent":
				updateStudent(request, response);
			case "/deleteStudent":
				deleteStudent(request,response);
			case "/selectStudent":
				selectStudent(request,response);
			default:
				System.out.println("home");

			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}
	private void selectStudent(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		StudentService stuService=new StudentServiceImpl();
		stuService.listSelectedStudent(21);
		
	}
	private void allStudents(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		StudentService stuService=new StudentServiceImpl();
		
		stuService.listAllStudent();
		
		
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		StudentService stuService=new StudentServiceImpl();
		Student st=new Student();
		
		st.setStuId(10);
		stuService.deleteStudent(st);
		response.sendRedirect("home");
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		StudentService stuService = new StudentServiceImpl();
		Student st = new Student();
		st.setStuId(3);
		st.setStuName("xxxx");
		st.setAdNo("");
		st.setAdStree1("");
		st.setAdStree2("");
		st.setAdCity("");
		st.setClID(1);
		stuService.updateStudent(st);
		response.sendRedirect("home");
	}

	private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentService stuService = new StudentServiceImpl();
		Student st = new Student();

		st.setStuName("amesh");
		st.setAdNo("");
		st.setAdStree1("");
		st.setAdStree2("");
		st.setAdCity("");
		st.setClID(3);
		stuService.insertStudent(st);
		response.sendRedirect("home");

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
