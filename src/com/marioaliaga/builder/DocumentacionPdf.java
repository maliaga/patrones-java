package com.marioaliaga.builder;

/**
 * Created by maliaga on 11/11/16.
 */
public class DocumentacionPdf extends Documentacion {
    @Override
    public void agregaDocumento(String document) {
        if (document.startsWith("<PDF>"))
            contenido.add(document);
    }

    @Override
    public void imprimir() {
        System.out.println("Documentacion PDF");
        for (String s : contenido)
            System.out.println(s);
    }
}
