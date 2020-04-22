<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Security Basic Demo (XML)</title>
</head>
<body>
	<div align="center">
		<h1>No tiene permisos para ver la página</h1>
	</div>
	<div align="center">
		<a href="${pageContext.servletContext.contextPath}/home-privado">Ir a pantalla principal</a>
	</div>
	<div align="center">
		<a href="${pageContext.servletContext.contextPath}/login">Ir a login</a>
	</div>
</body>
</html>