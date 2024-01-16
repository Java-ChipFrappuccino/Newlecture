<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
      <fiedset>
        <legend>메뉴정보</legend>
        <div><label for="">한글이름</label><input type="text" name="kor-name" value="${menu.korName}"/></div>
        <div><label for="">영문이름</label><input type="text" name="eng-name" value="${menu.engName}"/></div>
        <div><label for="">가격</label><input type="text" name="price" value="${menu.price}"/></div>
        <div><label for="">이미지</label><input type="file" name="img" value="${menu.image}"/></div>
      </fiedset>
      <div><a href="/admin/menu/edit?s=${menu.id}">수정</a></div>
      <div><a href="/admin/menu/delete?s=${menu.id}">삭제</a></div>
    </form>
</body>
</html>