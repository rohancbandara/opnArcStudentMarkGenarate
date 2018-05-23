package com.rcb.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		try {
			switch (action) {
			case "/all":
				allStudents(request,response);
			case "/insert":
				insertStudent(request, response);
				break;
			case "/update":
				updateStudent(request, response);
			case "/delete":
				deleteStudent(request,response);
			default:
				System.out.println("home");

			}
		} catch (Exception ex) {
			throw new ServletException(ex);
		}
	}

	private void allStudents(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		StudentService stuService=new StudentServiceImpl();
		
		List<Student> listStudent=stuService.listAllStudent();
		
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		StudentService stuService=new StudentServiceImpl();
		Student st=new Student();
		
		st.setStuId(3);
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
