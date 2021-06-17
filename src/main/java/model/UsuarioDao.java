package model;
import java.util.List;
import entities.Usuario;
import utils.Conexion;

public class UsuarioDao extends Conexion<Usuario>implements GenericDao<Usuario>{
	public UsuarioDao() {
		super(Usuario.class);
	}
}