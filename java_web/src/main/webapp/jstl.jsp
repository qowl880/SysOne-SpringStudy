<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>         <!-- 지시자 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>JSTL(JSP Standard Tag Library)</h2>
		
		<%-- 변수 --%>
		<c:set var="msg" value="안녕하세요." />
		<h3>${msg }</h3>
		<h3><c:out value="${msg }"/></h3>
		<c:remove var="msg"/>
		
		<c:catch var="ex">
		<%
			int c = 1/0;
		%>
		</c:catch>
		<h3>${ex}</h3>
		
		<c:set var ="a" value="1"/>
		<c:if test="${a > 0 }">
			<h3>${a }는 0보다 큽니다.</h3>
		</c:if>
		
		<c:set var="b" value="바나나"/>
		<c:choose>
			<c:when test= "${b=='사과' }">
				<h3>사과</h3>
			</c:when>
			<c:when test= "${b=='바나나' }">
				<h3>바나나</h3>
			</c:when>
			<c:otherwise>
				<h3>과일이 아닙니다. </h3>
			</c:otherwise>
		</c:choose>
<%
	/* JSPL  사용 */
	String[] list = {"A", "B", "C", "D", "E"};
	request.setAttribute("list", list);
%>

	<c:forEach var ="i"  begin ="1" end="3">
		${list[i]} .
	</c:forEach>
	
	<c:forEach var="item" items="${list }" varStatus="idx">
		<div>${idx.count }. ${item }</div>
	</c:forEach>
	
	<h3> ${fn:length(list) }</h3>
 	<h3>${fn:replace("A,B,C,D,E" ,",","-")}</h3>
 	
 	<fmt:formatNumber value="500000" type="currency" /> <br>
 	<fmt:formatNumber value="500000" pattern="###,###,###.00" /> <br>
 	
 	<jsp:useBean id="today" class="java.util.Date"/>	
 	<div>${today }</div>
 	<fmt:formatDate value="${today }" type="date"/>
 	<fmt:formatDate value="${today }" type="time"/>
 	<fmt:formatDate value="${today }" pattern="yyyy-MM-dd hh:mm:ss"/>
	</body>
</html>


