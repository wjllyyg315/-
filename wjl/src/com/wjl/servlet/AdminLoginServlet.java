package com.rj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rj.service.UserService;

public class AdminLoginServlet extends HttpServlet {
//管理员登录
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			HttpSession session=request.getSession();
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			session.setAttribute("adminname", username);//session获取管理员的名字
			UserService us=new UserService();
			
			boolean flag=us.AdminLogin(username, password);
			if(flag){
				request.getRequestDispatcher("/inner.jsp").forward(request, response);
			}else{
				String mess="用户名或密码错误 !";
				request.setAttribute("mess", mess);
				request.setAttribute("username", username);
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				
				
			}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
