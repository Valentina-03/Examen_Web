package model;

import entities.Seguimiento;
import utils.Conexion;

public class SeguimientoDao extends Conexion<Seguimiento> implements GenericDao<Seguimiento>{
    public SeguimientoDao(){
        super(Seguimiento.class);
    }
}