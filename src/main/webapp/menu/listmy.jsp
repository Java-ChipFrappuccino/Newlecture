<%@page import="kr.co.rland.web.menu.Menu"%>
<%@page import="kr.co.rland.web.menu.MenuList"%>
<%@page import="kr.co.rland.web.menu.MenuRepository"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
MenuRepository repository = new MenuRepository();
MenuList menuList = repository.findAll();
int size = menuList.size();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	for (int i = 0; i < size; i++) {
	Menu menu = menuList.get(i);
	%>
	<section>
		<h1><a href="detail.jsp?id=<%=menu.getId()%>"><%=menu.getKorName() %></a></h1>
		<div><%=menu.getImage() %></div>
		<div><%=menu.getEngName() %></div>
		<div><%=menu.getPrice() %></div>
		<div><%=menu.getLike() %></div>
	</section>
	<%
	}
	%>
</body>
</html>