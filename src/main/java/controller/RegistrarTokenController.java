package controller;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import entities.*;
import model.*;

/**
 * Servlet implementation class RegistrarToken
 */
@WebServlet("/RegistrarTokenController")
public class RegistrarTokenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarTokenController() {
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
		String usuario = String.valueOf(request.getAttribute("usuario"));
		String type = request.getParameter("type");
		String host = request.getParameter("host");
		String userdb = request.getParameter("userdb");
		String pass = request.getParameter("pass");
		String db = request.getParameter("db");
		String token = request.getParameter("token");
		String port = request.getParameter("port");
		String state = request.getParameter("state");
		
		ConnectionToken c = new ConnectionToken();
		ConnectionTokenDao cDao = new ConnectionTokenDao();
		UsuarioDao uDao = new UsuarioDao();
		TypedbDao tdDao = new TypedbDao();
		Typedb tp = tdDao.find(Integer.parseInt(type));
		
		Usuario u = uDao.find(Integer.parseInt(usuario));
		
		
		c = new ConnectionToken(host, userdb, pass, db, token, Integer.parseInt(port), Integer.parseInt(state), u, tp);
		cDao.insert(c);

		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);	
		
	}

}
