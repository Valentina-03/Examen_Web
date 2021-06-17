package model;
import java.util.List;
import entities.Usuario;
import utils.Conexion;

public class UsuarioDao extends Conexion<Usuario>implements GenericDao<Usuario>{
	public UsuarioDao() {
		super(Usuario.class);
	}
	public Usuario findByName(String user){
		try {
			getEm().getTransaction().begin();
			List<Usuario> lista=list();
			for(Usuario cur:lista) {
				if(cur.getUsuario().equals(user)) return cur;
			}
			getEm().getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//getEm().close();
		}
		return null;
	}
}