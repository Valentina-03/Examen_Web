package controller;

import java.io.IOException;
import java.io.PrintWriter;

import entities.Rol;
import entities.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
		
		PrintWriter out=new PrintWriter(response.getOutputStream());
		out.println(idrol + " " + user);
		out.close();

		
		RolDao rd = new RolDao();
		UsuarioDao ud = new UsuarioDao();
		
		Rol r = rd.find(Integer.parseInt(idrol));
		Usuario u = new Usuario();
		u.setRole(r);
		u.setUsuario(user);
		u.setPass(pass);
		u.setEmail(email);
		u.setState(1);
		
		ud.insert(u);
	}
}