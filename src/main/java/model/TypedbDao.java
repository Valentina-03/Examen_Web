package model;

import entities.Typedb;
import utils.Conexion;

public class TypedbDao extends Conexion<Typedb> implements GenericDao<Typedb>{
    public TypedbDao(){
        super(Typedb.class);
    }
}