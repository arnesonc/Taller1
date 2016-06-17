
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<title></title>
<body>

	<c:forEach items="${lista}" var="persona">
	${persona.apellido},
	${persona.nombre}<br>
	</c:forEach>
</body>
</html>