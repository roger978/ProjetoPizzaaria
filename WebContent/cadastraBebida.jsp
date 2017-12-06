<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="DataAcessObjects.BebidaDAO,Entidades.Bebida;
    "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
	@import "estilo.css";
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastramento de Bebidas</title>
</head>
<body>

	<div align="center">
		<form action ="">
		Preencha os dados abaixo: <br/>
		Nome: <input type ="text" name="nome"><br/>
		Tipo: <input type ="text" name="tipo"><br/>
		Tamanho: <input type ="text" name="tamanho"><br/>
		Preço: <input type ="text" name="preco"><br/>
		<input type="submit" name="submeter" id="submitbutton"><br/>
		</form>
	</div>
	
	<%
		Bebida b = new Bebida();
		b.setNome(request.getParameter("nome"));
		b.setTipo(request.getParameter("tipo"));
		b.setTamanho(request.getParameter("tamanho"));		
		b.setPreco(request.getParameter("preco"));
		
		BebidaDAO dao = (BebidaDAO) b.getDAO();
		dao.salvaInstancia(b);
	%>
	
</body>
</html>