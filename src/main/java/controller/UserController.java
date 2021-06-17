package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public UserController() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String next = request.getParameter("next");
		if(next.equals("registrar_token")) {
			String usuario = String.valueOf(request.getAttribute("usuario"));
			request.setAttribute("usuario", usuario);
			RequestDispatcher rd = request.getRequestDispatcher(next + ".jsp");
			rd.include(request, response);
			rd.forward(request, response);
		}
		RequestDispatcher rd = request.getRequestDispatcher(next + ".jsp");
		rd.forward(request, response);
	}

}
