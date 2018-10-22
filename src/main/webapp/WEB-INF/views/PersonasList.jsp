<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8">



<title>LISTADO DE CONTACTOS</title>
</head>
<body>
	<div align="center">
		<h1>LISTADO DE CONTACTOS</h1>
		

		<table border="1">

			<c:forEach var="persona" items="${personaList}" varStatus="status">
				<tr>
					<td>${persona.nombre}</td>
					<td>${persona.apellido1}</td>
					<td>${persona.apellido2}</td>
					
					<!-- <td><a href="edit?id=${user.id}">Modificar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?id=${user.id}">Eliminar</a>
					</td>-->
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
