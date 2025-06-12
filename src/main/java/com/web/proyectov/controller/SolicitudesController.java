/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.web.proyectov.controller;

import com.web.proyectof.entidades.Solicitudes;
import com.web.proyectof.services.SolicitudesFacadeLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author User
 */
@Named(value = "solicitudesController")
@ViewScoped
public class SolicitudesController implements Serializable {

    private Solicitudes con = new Solicitudes();
    @EJB
    private SolicitudesFacadeLocal sfl;

    public Solicitudes getCon() {
        return con;
    }

    public void setCon(Solicitudes con) {
        this.con = con;
    }

    public List<Solicitudes> obtenerSolicitudes() {
        return this.sfl.findAll();
    }

    public SolicitudesController() {
    }

}
