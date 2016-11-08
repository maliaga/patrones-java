package com.marioaliaga.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maliaga on 11/8/16.
 */
public abstract class Documentation {
    protected List<String> contenido = new ArrayList<>(0);

    public abstract void agregaDocumento(String documento);
    public abstract void imprimir();
}
