<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário</title>
</head>
<body>
	<form method="post" action="/agenda-servlets/mensagem">
		<p>Digite seu nome: 
			<input type="text" name="nomeUsuario"/>
		</p>
		<button type="submit">Enviar!</button>
	</form>
</body>
</html>