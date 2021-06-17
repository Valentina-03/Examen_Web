<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Votar</title>
<%--    <link href="<%=request.getContextPath()%>//css/style.css" rel="stylesheet"> --%>
   
</head>

<body>
	<form id="msform">
		<fieldset>
			<h2 class="fs-title">Iniciar Sesion</h2>			
			<p>Ingrese sus datos</p>
			<input type="text" name="documento" placeholder="Documento" required/>
			<input type="text" name="nombre" placeholder="Nombre" required/>
			<input type="text" name="email" placeholder="Email" required/>		
			<input type="hidden" id="next" name="next" value=""/>		
			<input type="submit" name="registrar_candidato" class="next action-button" onclick="javascript:document.getElementById('next').value = 'registro_candidato';" value="Registrar Candidato" />
			<input type="submit" name="registrar_votante" class="next action-button" onclick="javascript:document.getElementById('next').value = 'registro_votante';" value="Registrar Votante" />
			<input type="submit" name="votar" class="next action-button" onclick="javascript:document.getElementById('next').value = 'validar_datos';" value="Votar Ahora" />
			<input type="submit" name="resultados" class="next action-button" onclick="javascript:document.getElementById('next').value = 'consultarElecciones';" value="Consultar Resultados" />
		</fieldset>
	</form>
	
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>