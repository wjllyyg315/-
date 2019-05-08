<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adminlogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:1;
	left: 520px;
	top: 220px;
	
}
#im{
margin-top:-50px;
padding:0px;}
#apDiv2{
	position:absolute;
	width:200px;
	height:15px;
	z-index:1;
	left: 510px;
	top: 330px;
	
}
.me{
font-size:12px;
color:red;}
</style>
  </head>
  
  <body>
    	<div id="im"><img src="Images/alogin.jpg"></div>
    	<div id="apDiv1">
    			<form action="AdminLoginServlet" method="post">
	  <p>用户名:<input name="username" type="text" value="${username }" id="textfield" size="13" /></p>
	  密&nbsp;&nbsp;&nbsp;码:<input name="password" type="password" id="textfield2" size="13" />
	  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="post" id="button" value="登录" />
      <input type="reset" name="chongzhi" id="button2" value="重置" /></form><br/>
    	</div>
    	<div id="apDiv2"><span class="me">${mess }</span></div>
  </body>
</html>
