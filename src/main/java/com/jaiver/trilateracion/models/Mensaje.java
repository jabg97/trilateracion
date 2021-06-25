/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaiver.trilateracion.models;

/**
 *
 * @author admin
 */
public class Mensaje {

    public Posicion posicion;
    public String txt;

    public Mensaje(Posicion posicion, String txt) {
        this.posicion = posicion;
        this.txt = txt;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

}
