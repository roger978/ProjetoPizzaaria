<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="DataAcessObjects.PizzaDAO,Entidades.Pizza;
    "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
	@import "estilo.css";
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastramento de Pizzas</title>
</head>
<body>

	<div align="center">
		<form action ="">
		Preencha os dados abaixo: <br/>
		Sabor: <input type ="text" name="sabor"><br/>
		Tamanho: <input type ="text" name="tamanho"><br/>
		Preço: <input type ="text" name="preco"><br/>
		<input type="submit" name="submeter" id="submitbutton"><br/>
		</form>
	</div>
	
	<%
		Pizza p = new Pizza();
		p.setSabor(request.getParameter("sabor"));
		p.setTamanho(request.getParameter("tamanho"));
		p.setPreco(request.getParameter("preco"));
		PizzaDAO dao = (PizzaDAO) p.getDAO();
		dao.salvaInstancia(p);
	%>
	
</body>
</html>