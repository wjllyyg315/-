<%@page import="com.rj.entity.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.rj.dao.StudentDao"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加学生信息</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
  </head>
  <body>
      <h2>修改学生信息</h2>  
      <form action="StudentAlterServlet" method="post">
      <table>
         <%
		Student s=(Student)request.getAttribute("students");
	 %>
           <tr><td>编号</td>
           <td><input type="text" name="id" value="<%=s.getId() %>" ></td></tr>
           <tr><td>学号</td>
           <td><input type="text" name="stuno" value="<%=s.getStuno()%>"></td></tr>
           <tr><td>姓名</td>
           <td><input type="text" name="name" value="<%=s.getName() %>"></td></tr>
           <tr><td>性别</td>
           <td><input type="text" name="gender" value="<%=s.getGender()%>"></td></tr>
           <tr><td>年龄</td>
           <td><input type="text" name="age" value="<%=s.getAge()%>"></td></tr>
           <tr><td colspan="2">
           <input type="submit" value="提交"></td></tr>
           </table>
       </form>
       
  </body>
</html>