<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/TpFinal/controlador/guardarPersona"
		commandName="persona">
		<form:label path="nombre">Nombre</form:label>
		<form:input path="nombre" />
		
		<form:label path="apellido">Apellido</form:label>
		<form:input path="apellido" />
		
		<form:label path="edad">Edad</form:label>
		<form:input path="edad" />
		
		<form:label path="email">Email</form:label>
		<form:input path="email" />
		
		<input type="submit" value="Guardar" />
		
	</form:form>
</body>
</html>