<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 라이브러리</title>
</head>
<body>
	
	<h2> 조건문 if - else if </h2>
	
	<%-- 몸무게가 70 이하이면 치킨, 80 이하이면 샐러드, 그게 아니면 굶어 --%>
	
	<c:set var="weight" value="78" />	<%-- int weight = 78; 이랑 같음 (자바 문법) --%>  
	
	<c:choose>
			<%-- if (weight <= 70)	=> 자바 --%>
		<c:when test="${weight <= 70 }">
			<h3>치킨 먹자</h3>
		</c:when>
	
			<%-- else if (weight <= 80)	=> 자바 --%>
		<c:when test="${weight <= 80 }">
			<h3>샐러드 먹자</h3>
		</c:when>	
		
			<%-- else	=> 자바 --%>
		<c:otherwise>
			<h3>굶어!</h3>
		</c:otherwise>
	
	</c:choose>
	
	
	<h2> 반복문 </h2>
	
	<%-- 0 ~ 4 까지 출력 --%>
	
		<%-- for (int i = 0; i < 5; i++) --%>
	<c:forEach var="i" begin="0" end="4" step="1">	
			<%-- step="1" : 1씩 증가 (= i++) --%>
		
		${i }
	
	</c:forEach>
	
	
	<br>
	
	
	<%-- 16 ~ 20 까지 --%>
	
	<c:forEach var="i" begin="16" end="20" step="1" varStatus="status">
	
		${i } ${status.current } ${status.first } ${status.last } ${status.count } ${status.index } <br>  
			<%-- 맨 끝에 <br>로 결과값 한줄씩 출력 --%>
	</c:forEach>
	
	
	<hr>
	
	
	<h2>model에 리스트 반복문으로 출력</h2>
	
	<%-- for(String fruit : data)  => 향상된 for문 --%>
	
	<c:forEach var="fruit" items="${data }" varStatus="status">
		<h4>${fruit } ${status.count } ${status.index } </h4>
	</c:forEach>
	
	
	<hr>
	
	
	<%-- for(User user : userList --%>
	<c:forEach var="user" items="${userList }" >
		
		<h4>${user.name } ${user.yyyymmdd } ${user.email }</h4>
			<%-- name, yyyymmdd, email : User 클래스 안에 있는 멤버 변수 이름들 --%>
	</c:forEach>
	
	
	<table border="1">
	
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>생년월일</th>
				<th>이메일</th>
			</tr>
		</thead>	
		
		<tbody>
			<c:forEach var="user" items="${userList }" varStatus="status">
										<%-- "status" 이름은 변경 가능 --%>
			<tr>
				<td>${status.count }</td>	<%-- 반복 횟수만큼 1씩 증가 --%>
				<td>${user.name }</td>
				<td>${user.yyyymmdd }</td>
				<td>${user.email }</td>
			</tr>				
			
			</c:forEach>
		
		</tbody>
		
	</table>
	
</body>
</html>