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
        <div><input type="hidden" name="id" value="${menu.id}"/></div>
      </fiedset>
      <button>수정</button>
    </form>
</body>
</html>