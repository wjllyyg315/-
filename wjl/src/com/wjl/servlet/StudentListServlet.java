package com.rj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rj.dao.StudentDao;
import com.rj.entity.Student;

/*****
 * 查看全部学生
 * @author RJ
 *
 */
public class StudentListServlet extends HttpServlet {

	
	private StudentDao dao=new StudentDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//将数据放入request中，传递到页面
		List<Student> list=dao.queryAll();
		request.setAttribute("students", list);
		request.getRequestDispatcher("stulist.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
