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
    <h2>学生信息</h2>
      <form action="StudentAddServlet" method="post" role="from">
            <input type="text" name="id" placeholder="编号">
            <input type="text" name="stuno" placeholder="学号">
            <input type="text" name="name" placeholder="姓名">
            <input type="text" name="gender" placeholder="性别">
            <input type="text" name="age" placeholder="年龄">
            <button type="submit" >提交</button>
      </form>
  </body>
</html>