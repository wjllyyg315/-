package com.rj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rj.dao.StudentDao;
import com.rj.entity.Student;

public class StudentUpdServlet extends HttpServlet {

	private StudentDao dao=new StudentDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idstr = request.getParameter("id");
        int id = Integer.parseInt(idstr);
        //将数据放入request中，传递到页面
		Student student=dao.queryById(id);
		request.setAttribute("students", student);
		request.getRequestDispatcher("alterstudent.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		this.doGet(request, response);
	}


}
