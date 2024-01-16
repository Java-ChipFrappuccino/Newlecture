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
<c:forEach items="${list}" var="m">
  <section style="border: 2px solid black">
        <h1><a href="/admin/menu/detail?s=${m.id}">${m.korName}</a></h1>
        <div>${m.image}</div>
        <div>${m.engName}</div>
        <div>${m.price}</div>
        <div>0</div> 
       <%--  <div><a href="/admin/menu/edit?c=${m.id}">수정</a></div>       
        <div><button>삭제</button></div>        --%>
  </section>
</c:forEach>
<div><a href="/admin/menu/reg" style="font-size: 50px">메뉴등록</a></div>
</body>
</html>