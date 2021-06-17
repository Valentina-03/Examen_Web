package model;

import entities.Reporte;
import utils.Conexion;

public class ReporteDao extends Conexion<Reporte> implements GenericDao<Reporte>{
    public ReporteDao(){
        super(Reporte.class);
    }
}

