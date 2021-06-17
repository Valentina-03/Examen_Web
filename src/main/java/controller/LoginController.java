package controller;

import java.io.IOException;

import entities.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UsuarioDao;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String next = request.getParameter("next");
		if(next.equals("iniciar_sesion")) {
			String user = request.getParameter("username");
			String pass = request.getParameter("pass");
			
			UsuarioDao uDao = new UsuarioDao();
			Usuario u = uDao.findByName(user);
			
			if(u!=null && u.getPass().equals(pass) && u.getState()==1) {
				String usuario = String.valueOf(u.getId());
				request.setAttribute("usuario", usuario);
				RequestDispatcher rd = request.getRequestDispatcher("usuario.jsp");
				rd.include(request, response);
				rd.forward(request, response);				
			}
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("registrar_usuario.jsp");
			rd.forward(request, response);			
		}
	}

}
