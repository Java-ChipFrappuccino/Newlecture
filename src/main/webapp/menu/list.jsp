<%@page import="kr.co.rland.web.menu.Menu"%>
<%@page import="kr.co.rland.web.menu.MenuRepository"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>${name}</div>
<div>${list[0]}</div>
<div>${list[0].korName}</div>
<div>${list[0].price}</div>
<div><a href="/admin/menu/reg">등록</a></div>
<div>개수:<a href="?s=1&c="categoryId">1</a></div>
            <div>개수:<a href="?s=2">2</a></div>
            <div>개수:<a href="?s=3">3</a></div>
            <div>개수:<a href="?s=4">4</a></div>
            <div>개수:<a href="?s=5">5</a></div>
            <form action="list" method="get">
               <label>개수:</label><input name="s">
               <input type="submit" value="요청">
            </form>
            
            <form action="list" method="get">
                  <label>메뉴이름:</label><input name="q">
                  <input type="hidden" name="s" value="">
                  <input type="submit" value="요청">
            </form>
            
<%--   List<Menu> list = (List)request.getAttribute("list");
/* 	MenuList list = ${list}; */
 /*   for(int i=0; i < list.size(); i++){ 
      Menu menu = list.get(i); */
   /* for(Menu menu : list){ 
	  pageContext.setAttribute("menu", menu); */ //EL저장소의 데이터를 꺼내는것 / 저장소 생성 --%>
 <c:forEach items="${list}" var="m">
  <section>
        <h1><a href="detail?s=${m.id}">${m.korName}</a></h1>
        <div>${m.image}</div>
        <div>${m.engName}</div>
        <div>${m.price}</div>
        <div>0</div>        
  </section>
</c:forEach>
</body>
</html>