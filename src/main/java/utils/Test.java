package utils;
import java.util.List;

import entities.*;
import model.*;

public class Test {
	public static void main (String [] args) {
		System.out.println("sfas");
		UsuarioDao ud = new UsuarioDao();
		RolDao r = new RolDao();
		Rol rol = r.find(1);
		Usuario u = new Usuario();
		u.setUsuario("paula");
		u.setEmail("paula@gmail.com");
		u.setPass("12345");
		u.setRole(rol);
		u.setState(1);
		ud.insert(u);
	}

}
