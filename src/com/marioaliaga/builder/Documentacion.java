package com.marioaliaga.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maliaga on 11/8/16.
 */
public abstract class Documentacion {
    protected List<String> contenido = new ArrayList<>(0);

    public abstract void agregaDocumento(String document);
    public abstract void imprimir();
}
