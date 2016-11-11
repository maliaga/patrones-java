package com.marioaliaga.builder;

/**
 * Created by maliaga on 11/11/16.
 */
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente) {
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatriculacion
                (nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }

}
