<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div>
      <form action="notice-reg" method="get">
        <div>
          <label for="">제목:</label>
          <input type="text" name="t"/>
        </div>
        <div>
          <label for="">내용:</label>
          <textarea name="c" id="" cols="30" rows="10"></textarea>
        </div>
        <div><input type="submit" value="등록" /></div>
      </form>
    </div>
</body>
</html>