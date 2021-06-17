<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="entities.Rol" %>
<%@page import="model.RolDao" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>Registrar Usuario</title>
<%--    <link href="<%=request.getContextPath()%>//css/style.css" rel="stylesheet"> --%>
   
</head>

<body>
	<form id="msform">
		<fieldset>
			<h2 class="fs-title">Registrar Usuario</h2>			
			<p>Ingrese sus datos</p>
			
			<select class="form-control" name="tipodocumento">
				<option disabled="disabled" selected="selected">Tipo de Documento</option>
				<%
					RolDao rDao = new RolDao();
					List<Rol> roles = rDao.list();					
				  	if(roles != null)
				  		for(Rol r: roles) { %>
					  	<option value="<%=r.getId()%>"><%=r.getDescripcion()%></option>
				<%}%>
			</select>
			<input type="text" name="usuario" placeholder="Usuario" required/>
			<input type="text" name="email" placeholder="Email" required/>
			<input type="text" name="pass" placeholder="Contraseña" required/>
			<input type="submit" name="registrar_usuario" class="next action-button" value="Rgistrar Usuario" />
		</fieldset>
	</form>
	
	<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js"></script>
</body>
</html>