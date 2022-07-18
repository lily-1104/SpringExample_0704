<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core 라이브러리</title>
</head>
<body>

	<h2>변수 정의하기</h2>
	
	<c:set var="number1" value="100" />		<%-- 변수 만들때 set 사용 --%>
	<c:set var="number2">200</c:set>
	
	<h4>number1 : ${number1 }</h4>
	<h4>number2 : ${number2 }</h4>
	
	<h2>출력하기</h2>
	
	<h4> <c:out value="10" /> </h4>
	
	<c:out value="<script>alert('첫번째 얼럿')</script>" />
	<%-- 
		<c:out value="<script>alert('두번째 얼럿')</script>" excapeXml="false" />  
	--%>
			<%-- excapeXml="false"의 기본 값은 true, false면 변환하지 않겠다? --%>
	
	
	<h2>조건문 (c:if)</h2>
	
	<c:if test="true">
		<h4>조건이 참이다</h4>
	</c:if>
	
	<c:if test="${number1 > 50 }">
		<h3>number1이 50보다 크다</h3>
	</c:if>
	
	<c:if test="${number1 == 100 }">
		<h3>number1이 100이다</h3>
	</c:if>
	
	<c:if test="${number1 eq 100 }">	<%-- eq : equals를 의미, 같다는 뜻 --%>
		<h3>number1이 100이다</h3>
	</c:if>
	
	<c:if test="${number1 ne 100 }">	<%-- ne : not equals를 의미, 같지 않다는 뜻 --%>
		<h3>number1이 200이 아니다</h3>
	</c:if>
	
	<c:if test="${empty number1 }">		<%-- empty : 데이터가 있는지 없는지 확인해줌 --%>
		<h3>number1이 있다</h3>
	</c:if>		<%-- number1에 값이 있어서 false라 출력이 안됨 --%>
	
	<c:if test="${!empty number1 }">	
		<h3>number1이 없다</h3>
	</c:if>
	
		<%-- not empty = !empty --%>
	<c:if test="${not empty number1 }">	
		<h3>number1이 없다</h3>
	</c:if>
	
	
	
		<%--  http://localhost:8080/jstl/ex01  --%>
	
	
</body>
</html>