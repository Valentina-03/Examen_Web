<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Registrar Db</title>
   <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">   
</head>
<body>
	<form id="msform" action="<%=request.getContextPath()%>/RegistrardbController" method="post">
		<fieldset>
			<h2 class="fs-title">Registrar Base de datos</h2>
			<input type="text" name="id" placeholder="Id" required>
			<input type="text" name="descripcion" placeholder="Descripcion" required>
			<input type="text" name="driver" placeholder="Driver" required>
			<input type="text" name="adicional" placeholder="Adicional" required>
			<input type="submit" class="next action-button" name="registrar_db" value="Registrar">
		</fieldset>
	</form>
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>
		</fieldset>
	</form>
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>