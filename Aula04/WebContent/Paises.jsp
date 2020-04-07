<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Paises"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<title>Paises</title>
</head>
<body>
	<% Paises paises = (Paises) request.getAttribute("paises");
	%>

	<p>
		Id:<%=paises.getId()%><br>
		Nome: <%=paises.getNome() %><br>
	    Populacao: <%=paises.getPopulacao() %><br> 
		Area: <%=paises.getArea() %>

	</p>


</body>
</html>