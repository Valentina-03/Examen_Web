<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="entities.Typedb" %>
<%@page import="model.TypedbDao" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Registrar Token</title>
   <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">   
</head>
<body>
	<form id="msform" action="<%=request.getContextPath()%>/RegistrardbController" method="post">
		<fieldset>
			<h2 class="fs-title">Registrar Token</h2>
			<input type="hidden" name="usuario" value="">
			<select class="form-control" name="type" required>
				<option disabled="disabled" selected="selected">Seleccione el tipo de base</option>
				<%
				TypedbDao tDao = new TypedbDao();
					List<Typedb> tipos = tDao.list();					
				  	if(tipos != null)
				  		for(Typedb t: tipos) { %>
					  	<option value="<%=t.getId()%>"><%=t.getDescription()%></option>
				<%}%>
			</select>
			<input type="text" name="host" placeholder="Host" required>
			<input type="text" name="userdb" placeholder="UserDB" required>
			<input type="text" name="pass" placeholder="Clave" required>
			<input type="text" name="db" placeholder="DB" required>
			<input type="text" name="token" placeholder="Token" required>
			<input type="text" name="port" placeholder="Puerto" required>
			<input type="text" name="state" placeholder="Estado" required>
		</fieldset>
	</form>
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>