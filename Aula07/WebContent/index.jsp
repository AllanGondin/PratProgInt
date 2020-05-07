<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Paises</title>
<link href="css/bootstrap.min.css" rel="stylesheet">

</head>
	<!-- Barra superior com os menus de navegacao -->
	<c:import url="Menu.jsp"/>
<body>

 <div class="container">

        <div class="page-header">
            <h1>Formulário de Paises</h1>
        </div>

        <div class="row">
            <div class="col-md-6">
                <h3>Cadastre o País</h3>

                <form action="ManterPaises.do" method="get">
                    <div class="form-group">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" name="nome" id="nome" placeholder="Nome">
                    </div>

                    <div class="row">
                        <div class="form-group col-md-6">
                            <label for="populacao">Populacao</label>
                            <input type="text" class="form-control" name="populacao" id="populacao" placeholder="População">
                        </div>

                        <div class="form-group col-md-6">
                            <label for="area">Area</label>
                            <input type="text" class="form-control" name="area" id="area" placeholder="Area">
                        </div>
                    </div>
                    <hr /> 

                    <div id="actions" class="row">
                        <div class="col-md-2">
                            <button type="submit" class="btn btn-primary" name="acao" value="Incluir">Salvar</button>
                        </div>
                        <div class="col-md-2">
                            <button type="submit" class="btn btn-primary" name="acao" value="Listar">Listar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>