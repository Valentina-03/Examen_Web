<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Usuario</title>
   <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">   
</head>
<body>
	<form id="msform" action="<%=request.getContextPath()%>/UserController" method="post">
		<fieldset>
			<h2 class="fs-title">Usuario</h2>
			<input class="next action-button" type="hidden" id="usuario" name="usuario" value="">
			<input class="next action-button" type="hidden" id="next" name="next" value="">
			<input class="next action-button" type="submit" name="registrar_db" onclick="javascript:document.getElementById('next').value = 'registrar_db';" value="Registrar tipo">
			<input class="next action-button" type="submit" name="registrar_token" onclick="javascript:document.getElementById('next').value = 'registrar_token';" value="Registrar Token">
			<input class="next action-button" type="submit" name="dashboard" onclick="javascript:document.getElementById('next').value = 'datos';" value="Ver Registros">
		</fieldset>
	</form>
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>