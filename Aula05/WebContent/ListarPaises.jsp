<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Paises, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Paises</title>
</head>
<body>
	<%
		ArrayList<Paises> paises = (ArrayList<Paises>) request.getAttribute("paises");
	for (Paises p : paises) {
	%>
	<p>
		ID:
		<%=p.getId()%><br> Nome:
		<%=p.getNome()%><br> Populacao:
		<%=p.getPopulacao()%><br> Area:
		<%=p.getArea()%>
	</p>
	<%
		}
	%>
</body>
</html>