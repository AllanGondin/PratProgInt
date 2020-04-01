<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Paises, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Paises</title>
</head>
<body>
<%
	ArrayList<Paises> paisesA = (ArrayList<Paises>) request.getAttribute("paisesA");
	for(Paises ps:paisesA){
%>
<p>
<label>ID:</label> <%=ps.getId() %>
<label>Nome:</label> <%=ps.getNome() %><br>
<label>Populacao:</label> <%=ps.getPopulacao() %><br>
<label>Area:</label> <%=ps.getArea()%>
</p>
<%} %>
</body>
</html>