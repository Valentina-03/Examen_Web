package utils;
import java.util.List;

import entities.*;
import model.*;

public class Test {
	public static void main (String [] args) {
		System.out.println("erre");
		UsuarioDao ud = new UsuarioDao();
		RolDao r = new RolDao();
		Usuario u = new Usuario();
		u.setId(1);
		u.setUsuario("paula");
		u.setEmail("paula@gmail.com");
		u.setPass("12345");
		u.setRole(r.find(1));
		u.setState(1);
		ud.insert(u);
	}

}
