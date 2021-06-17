package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import entities.*;
import model.*;

@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UsuarioController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idrol = request.getParameter("rol");
		String user = request.getParameter("usuario");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		RolDao rd = new RolDao();
		UsuarioDao ud = new UsuarioDao();
		
		Rol r = rd.find(Integer.parseInt(idrol));
		Usuario u = new Usuario(user, email, pass, r, 1);
		ud.insert(u);
	}

}
