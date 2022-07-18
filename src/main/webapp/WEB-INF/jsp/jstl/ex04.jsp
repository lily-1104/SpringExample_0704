<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<%-- jstl function 라이브러리 --%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fn 라이브러리</title>
</head>
<body>

	<c:set var="str1" value="No pain. No gain. " />
	
	<h2>길이 구하기</h2>
	<h4> ${fn:length(str1) }</h4>
	
	
	
	<h2>특정 문자열이 존재하는지</h2>
	<h4> ${fn:contains(str1, "No") } </h4>
	<c:if test="${fn:contains(str1, 'No') }">
		<h4>No가 존재한다</h4>
	</c:if>
	
	
	
	<h2>특정 문자열로 시작, 끝나는지 </h2>
	<h4>시작? : ${fn:startsWith(str1, "No") }</h4>
	<h4>끝? : ${fn:endsWith(str1, "Yes") }</h4>
	
	
	
	<h2>문자열 치환</h2>
	<h4>${fn:replace(str1, "No", "Yes") }</h4>
	
	
	
	<h2>문자열 쪼개기</h2>
	<h4>${fn:split(str1, " ")[0] }</h4>		<%-- 쪼갠거에서 인덱스 0번째 값 --%>
	<h4>${fn:split(str1, " ")[1] }</h4>		<%-- 'pain.' 출력됨 --%>
	<h4>${fn:split(str1, " ")[2] }</h4>		<%-- 'No' 출력됨 --%>
	<h4>${fn:split(str1, " ")[3] }</h4>		<%-- 'gain.' 출력됨 --%>
	
	
	
	<h2>문자열 자르기</h2>
	<h4>${fn:substring(str1, 3, 7) }</h4>
	
	
	
	<h2> 모든 문자를 대문자 / 소문자로 바꾸기 </h2>
	<h4> 소문자 : ${fn:toLowerCase(str1) }</h4>
	<h4> 대문자 : ${fn:toUpperCase(str1) }</h4>
	
	
	
	<h2>앞 뒤 공백 제거</h2>
	<c:set var="str2" value="		hello!!		  " />
	<pre>${str2 }</pre>		<%-- <pre> : 공백까지 모두 보여주는 태그, 이거 없으면 공백 안보임 --%>  
	<pre>${fn:trim(str2) }</pre>	<%-- 공백 없이 문자열만 출력됨 --%>
	
	
</body>
</html>