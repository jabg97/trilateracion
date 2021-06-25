/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaiver.trilateracion.models.request;

/**
 *
 * @author admin
 */
public class AntenaRequest {

    public double[][] posiciones;
    public double[] distancias;
    public String[][] mensajes;

    public AntenaRequest() {
    }

    public AntenaRequest(double[][] posiciones, double[] distancias, String[][] mensajes) {
        this.posiciones = posiciones;
        this.distancias = distancias;
        this.mensajes = mensajes;
    }

    public double[][] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(double[][] posiciones) {
        this.posiciones = posiciones;
    }

    public double[] getDistancias() {
        return distancias;
    }

    public void setDistancias(double[] distancias) {
        this.distancias = distancias;
    }

    public String[][] getMensajes() {
        return mensajes;
    }

    public void setMensajes(String[][] mensajes) {
        this.mensajes = mensajes;
    }

    
}
