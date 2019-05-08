package com.rj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rj.dao.StudentDao;
import com.rj.entity.Student;

public class StudentDelServlet extends HttpServlet {

	private StudentDao dao = new StudentDao();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ����id
				String idstr = request.getParameter("id");
				int id = Integer.parseInt(idstr);
				//����dao����ɾ��
				dao.delById(id);
				//�����ݷ���request��
				List<Student> list = dao.queryAll();
				request.setAttribute("students", list);
				//��ת���б�ҳ��
				request.getRequestDispatcher("stulist.jsp").forward(request, response);	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

}
