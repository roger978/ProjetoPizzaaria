<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="DataAcessObjects.UsuarioDAO,Entidades.Usuario;
    "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
	@import "estilo.css";
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastramento de Usuário</title>
</head>
<body>

	<div align="center">
		<form action ="">
		Preencha os dados abaixo: <br/>
		Nome: <input type ="text" name="nome"><br/>
		Sobrenome: <input type ="text" name="sobrenome"><br/>
		Usuario: <input type ="text" name="usuario"><br/>
		Senha: <input type ="password" name="senha"><br/>
		<input type="submit" name="submeter" id="submitbutton"><br/>
		</form>
	</div>
	
	<%
		Usuario u = new Usuario();
		u.setNome(request.getParameter("nome"));
		u.setSobrenome(request.getParameter("sobrenome"));
		u.setUsuario(request.getParameter("usuario"));
		u.setSenha(request.getParameter("senha"));
		UsuarioDAO dao = (UsuarioDAO) u.getDAO();
		dao.salvaInstancia(u);
	%>
	
</body>
</html>