<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="frd.dds.domain.Client" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Administración de Clientes</title>
	<link href="css/bootstrap.css" rel="stylesheet">
	<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
	<div class="content">
		<div class="row">
			<div class="col-md-12">
				<h1>Administración de Clientes</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<form action="addClient" class="form-inline">
					<div class="form-group">
						<label for="name">Nombre</label> <input type="text"
							class="form-control" id="name"
							placeholder="Ingrese Nombre">
					</div>
					<div class="form-group">
						<label for="direccion">Direcci&oacute;n</label> <input type="text"
							class="form-control" id="direccion"
							placeholder="Ingrese Dirección">
					</div>
					<button type="submit" class="btn btn-default">Agregar</button>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>ID</th>
							<th>NOMBRE</th>
							<th>DIRECCION</th>
						</tr>
					</thead>
					<tbody>
					<% for(Client c : (List<Client>)request.getAttribute( "clients" )) { %>
						<tr>
							<td><%= c.getId() %></td>
							<td><%= c.getName() %></td>
							<td><%= c.getAddress() %></td>
						</tr>
					<% } %>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>