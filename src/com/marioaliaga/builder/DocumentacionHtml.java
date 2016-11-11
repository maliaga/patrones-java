package com.marioaliaga.builder;

/**
 * Created by maliaga on 11/11/16.
 */
public class DocumentacionHtml extends Documentacion {
    @Override
    public void agregaDocumento(String document) {
        if(document.startsWith("<HTML>"))
            contenido.add(document);
    }

    @Override
    public void imprimir() {
        System.out.println("Documentacion HTML");

        for (String s: contenido)
            System.out.println(s);
    }
}
