/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaiver.trilateracion.controllers;

import com.jaiver.trilateracion.models.Mensaje;
import com.jaiver.trilateracion.models.Posicion;
import com.jaiver.trilateracion.models.request.AntenaRequest;
import com.jaiver.trilateracion.services.AntenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jaiver
 */
@Controller
@RequestMapping("/antenas")
public class AntenaController {

    @Autowired
    AntenaService antenaService;

    @PostMapping("/calcular")
    public ResponseEntity<Mensaje> calcular(@RequestBody AntenaRequest request) {
        String txt = antenaService.obtenerMensaje(request.getMensajes());
        Posicion posicion = antenaService.obtenerPosicion(
                request.getPosiciones(), request.getDistancias());
        Mensaje mensaje = new Mensaje(posicion, txt);
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    }
    
    @GetMapping("/dibujar")
    public String dibujar() {
                return "draw";
    }
}
