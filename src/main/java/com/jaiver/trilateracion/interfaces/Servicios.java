/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaiver.trilateracion.interfaces;

import com.jaiver.trilateracion.models.Posicion;

/**
 *
 * @author admin
 */
public interface Servicios {

    /**
     *
     * @param mensajes
     * @return
     */
    public String obtenerMensaje(String[][] mensajes);

    /**
     *
     * @param posiciones
     * @param distancias
     * @return Posicion
     */
    public Posicion obtenerPosicion(double[][] posiciones, double[] distancias);
}
