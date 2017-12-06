<!DOCTYPE html>
<html>
<head>

<script type="text/javascript" src="ConsultaScript.js"></script>

<style>
	@import "estilo.css";
</style>

<meta charset="ISO-8859-1">
<title>Pizzaria</title>
</head>
<body>

	<h1>Pizzaria</h1>
	
	<div class="botoes">
		<form method="POST" action="/ProjetoWeb/ConsultaServlet">	
			<input type="text" name="usuario"><br>
			<input type="submit" value="Pesquisa Usuario" name="submit" id="submitbutton">
		</form>
		<br/>
		<form method="POST" action="/ProjetoWeb/ConsultaServlet">
			<input type="text" name="usuario"><br>
			<input type="submit" value="Pesquisa Pizza" name="submit" id="submitbutton">
		</form>
		<br/>
		<form method="POST" action="/ProjetoWeb/ConsultaServlet">
			<input type="text" name="usuario"><br>
			<input type="submit" value="Pesquisa Bebida" name="submit" id="submitbutton">
		</form>
		<br/>
		<form method="POST" action="/ProjetoWeb/ConsultaServlet">
			<input type="text" name="usuario"><br>
			<input type="submit" value="Pesquisa Sobremesa" name="submit" id="submitbutton">
		</form>
		<br/>
		<form method="POST" action="/ProjetoWeb/ConsultaServlet">
			<input type="text" name="usuario"><br>
			<input type="submit" value="Pesquisa Pedido" name="submit" id="submitbutton">
		</form>
	</div>
</body>
</html>