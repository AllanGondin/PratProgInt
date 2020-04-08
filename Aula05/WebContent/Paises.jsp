<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Paises"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cadastro Realizado</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">

<title>Paises</title>
</head>
<body>
	<% Paises paises = (Paises) request.getAttribute("paises");
	%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">PAISES</a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#textoNavbar" aria-controls="textoNavbar" aria-expanded="false" aria-label="Alterna navegação">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="textoNavbar">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home <span class="sr-only">(Página atual)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Melhores Paises</a>
            </li>
          </ul>
        </div>

	  </nav>
	  
	<div class="container">
		
		<h3 class="page-header">Pais Cadastrado <%=paises.getId()%> </h3>
			<div class="row">
				<div class="col-md-12">
					<p><strong>Nome</strong></p>
					<p><%=paises.getNome() %></p>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6">
					<p><strong>População</strong></p>
					<p><%=paises.getPopulacao() %></p>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6">
					<p><strong>Area</strong></p>
					<p><%=paises.getArea() %></p>
				</div>
			</div>
			<hr />
			<div id="actions" class="row">
                <div class="col-md-12">
                    <a href="index.html" class="btn btn-default">Voltar</a>
                </div>
            </div>
	</div>
</body>
</html>