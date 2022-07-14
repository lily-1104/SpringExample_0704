<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 화면</title>
</head>
<body>
	
	<!-- 
	<form method="post" action="/jsp/user/insert"> 
			<!--  POST : 비밀번호가 있을 때, 입력 내용이 너무 길 때, 파일 등이 전달될 때 -->
	 
	 <!--  
		<label>이름 </label> <input type="text" name="name">
		<label>생년월일 </label> <input type="text" name="yyyymmdd">
		<label>이메일 </label> <input type="text" name="email">  <br>
		
		<label>자기소개</label> <br>
		<textarea rows="5" cols="100" name="introduce"></textarea>
		
		<button type="submit">입력</button>
	
	</form> -->
	
	
		<!--  http://localhost:8080/jsp/user/input_view  -->
	
	
	
	<form method="post" action="/jsp/user/insert_view"> 
	
		<label>이름 </label> <input type="text" name="name">
		<label>생년월일 </label> <input type="text" name="yyyymmdd">
		<label>이메일 </label> <input type="text" name="email">  <br>
		
		<label>자기소개</label> <br>
		<textarea rows="5" cols="100" name="introduce"></textarea>
		
		<button type="submit">입력</button>
	
	</form>
	
	
		<!--  http://localhost:8080/jsp/user/insert_view  -->
		
		
</body>
</html>