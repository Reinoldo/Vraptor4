<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Questões do </h1>

	<c:forEach items="${questionList}" var="question">

		<ul>
			<li>${question.getOrdem()}- ${question.title}</li>
			<c:if test="${question.getType() eq 'mult'}">
				<c:forEach items="${optionsList}" var="options">
					<li>${options.getTitle()}</li>
					<li>teste</li>
				</c:forEach>

			</c:if>
		</ul>

	</c:forEach>
</body>
</html>