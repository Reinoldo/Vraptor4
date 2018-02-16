<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>
	<script>
		
	</script>



	<h1>Selecione um formulário</h1>


	<form action="${linkTo[FormularioController].visualiza(null) }" method="get">
		<select id="forms" name="formulario.id">
			<c:forEach items="${formularioList}" var="formulario">



				<option value="${formulario.id}">${formulario.getTitle()}</option>


			</c:forEach>
		</select> 
		
		<input type="submit" value="go"/>
	</form>
	
	
	
	



</body>
</html>