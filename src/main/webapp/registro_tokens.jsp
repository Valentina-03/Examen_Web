<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.List"%>
<%@page import="entities.Rol" %>
<%@page import="model.RolDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
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
		<input type="text" name="host" placeholder="Host" required>
		<input type="text" name="userdb" placeholder="UserDB" required>
		<input type="text" name="pass" placeholder="Clave" required>
		<input type="text" name="db" placeholder="DB" required>
		<input type="text" name="token" placeholder="Token" required>
		<input type="text" name="port" placeholder="Puerto" required>
		<input type="text" name="state" placeholder="Estado" required>
	</form>

</body>
</html>