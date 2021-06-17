package model;

import entities.ConnectionToken;
import utils.Conexion;

public class ConnectionTokenDao extends Conexion<ConnectionToken> implements GenericDao<ConnectionToken>{
    public ConnectionTokenDao(){
        super(ConnectionToken.class);
    }
}