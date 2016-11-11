package com.marioaliaga.builder;

/**
 * Created by maliaga on 11/11/16.
 */
public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;
    public abstract void construyeSolicitudPedido(String nombreCliente);
    public abstract void construyeSolicitudMatriculacion (String nombreSolicitante);
    public Documentacion resultado()
    {
        return documentacion;
    }
}
