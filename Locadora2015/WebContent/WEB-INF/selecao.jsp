<%@page import="java.util.*, java.text.*"%>
<%@page import="model.*, to.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Cidades Por Estado</title>
<link rel="stylesheet" href="./css/main.css" />
</head>
<body>
	<h2>Lista de Cidades Por Estado</h2>
<br><br><br>
	<form method="post" action="selecao.do">
	<%
	LocalidadesTO locTO = (LocalidadesTO)request.getSession().getAttribute("localidades");
	%>
		<p>Selecione um estado</p>
		<fieldset>
			<div>
				<label>Estado:</label> <select name="estado" size="1">
					<%
					for(Estado estado: locTO.getListaEstados()){
					%>
					<option value="<%=estado.getId()%>"><%=estado.getNome()%></option>
					<%
					}
					%>
				</select>
			</div>
		</fieldset>
		<br>
<div class='submitWrapper'>    
<input type='submit' name='submit' value='Listar'> 
 </div>
	</form>

</body>
</html>