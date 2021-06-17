package model;

import entities.Rol;
import utils.Conexion;

public class RolDao extends Conexion<Rol> implements GenericDao<Rol>{
	public RolDao() {
		super(Rol.class);
	}
}