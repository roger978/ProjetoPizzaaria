<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="DataAcessObjects.SobremesaDAO,Entidades.Sobremesa;
    "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
	@import "estilo.css";
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastramento de Sobremesas</title>
</head>
<body>

	<div align="center">
		<form action ="">
		Preencha os dados abaixo: <br/>
		Sabor: <input type ="text" name="sabor"><br/>
		Tipo: <input type ="text" name="tipo"><br/>
		Preço: <input type ="text" name="preco"><br/>
		<input type="submit" name="submeter" id="submitbutton"><br/>
		</form>
	</div>
	
	<%
		Sobremesa s = new Sobremesa();
		s.setSabor(request.getParameter("sabor"));
		s.setTipo(request.getParameter("tipo"));
		s.setPreco(request.getParameter("preco"));
		SobremesaDAO dao = (SobremesaDAO) s.getDAO();
		dao.salvaInstancia(s);
	%>
	
</body>
</html>