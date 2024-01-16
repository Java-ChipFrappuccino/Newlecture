<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <form action="" method="post">
      <fiedset>
        <legend>메뉴정보</legend>
        <div><label for="">한글이름</label><input type="text" name="kor-name"/></div>
        <div><label for="">영문이름</label><input type="text" name="eng-name"/></div>
        <div><label for="">가격</label><input type="text" name="price"/></div>
        <div><label for="">이미지</label><input type="file" name="img"/></div>
      </fiedset>
      <button>등록</button>
    </form>
  </body>
</html>
