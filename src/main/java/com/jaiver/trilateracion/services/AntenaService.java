/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaiver.trilateracion.services;

import com.jaiver.trilateracion.interfaces.Servicios;
import com.jaiver.trilateracion.models.Posicion;
import com.lemmingapex.trilateration.NonLinearLeastSquaresSolver;
import com.lemmingapex.trilateration.TrilaterationFunction;
import org.apache.commons.math3.fitting.leastsquares.LeastSquaresOptimizer.Optimum;
import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class AntenaService implements Servicios {

    /**
     *
     * @param mensajes
     * @return
     */
    @Override
    public String obtenerMensaje(String[][] mensajes) {
        String mensaje = "";

        if (mensajes.length > 0) {
            int tamaño = mensajes[0].length;
            for (int i = 1; i < mensajes.length; i++) {
                if (mensajes[i].length > tamaño) {
                    tamaño = mensajes[i].length;
                }
            }
            String[] arr = new String[tamaño];
            for (int i = 0; i < mensajes.length; i++) {
                for (int j = 0; j < mensajes[i].length; j++) {
                    if (!mensajes[i][j].equals("")) {
                        arr[j] = mensajes[i][j];
                    }
                }
            }
            for (String palabra : arr) {
                mensaje += palabra+" ";
            }
        }
        return mensaje.trim();
    }

    @Override
    public Posicion obtenerPosicion(double[][] posiciones, double[] distancias) {
        NonLinearLeastSquaresSolver solver = new NonLinearLeastSquaresSolver(
                new TrilaterationFunction(posiciones, distancias),
                new LevenbergMarquardtOptimizer());
        Optimum optimum = solver.solve();
        double[] centro = optimum.getPoint().toArray();
        return new Posicion(centro[0], centro[1]);
    }

}
