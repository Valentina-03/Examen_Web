package utils;
import java.util.List;

import entities.*;
import model.*;

public class Test {
	public static void main (String [] args) {
		RolDao rd = new RolDao();
		Rol r = new Rol ();
		r.setDescripcion("Administrador");
		rd.insert(r);
	}

}
