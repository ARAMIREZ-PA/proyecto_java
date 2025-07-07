/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.web.proyectov.controller;

import com.web.proyectof.entidades.Solicitudes;
import com.web.proyectof.services.SolicitudesFacadeLocal;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.enterprise.context.SessionScoped;
import javax.servlet.http.Part;

/**
 *
 * @author User
 */
@Named(value = "solicitudesController")
@SessionScoped
public class SolicitudesController implements Serializable {

    private Solicitudes con = new Solicitudes();
    private List<SelectItem> listaSolicitudes;
    private Part archivoOrdenMedica;

    public Part getArchivoOrdenMedica() {
        return archivoOrdenMedica;
    }

    public void setArchivoOrdenMedica(Part archivoOrdenMedica) {
        this.archivoOrdenMedica = archivoOrdenMedica;
    }

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

    public List<SelectItem> listarSolicitudes() {
        listaSolicitudes = new ArrayList<>();
        try {
            for (Solicitudes con : this.sfl.findAll()) {
                SelectItem itemm = new SelectItem(con.getNumeroDocumento(), con.getNombreCompleto());
                listaSolicitudes.add(itemm);
            }
            return listaSolicitudes;
        } catch (Exception e) {
        }
        return null;
    }

    public String crearP1() {
        this.con = new Solicitudes();
        return "/views/CrearActualizar.xhtml?faces-redirect=true";
    }

    public void crearP2() {
        try {
            if (archivoOrdenMedica != null) {
                InputStream input = archivoOrdenMedica.getInputStream();
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();

                int nRead;
                byte[] data = new byte[1024];
                while ((nRead = input.read(data, 0, data.length)) != -1) {
                    buffer.write(data, 0, nRead);
                }

                buffer.flush();
                byte[] bytesArchivo = buffer.toByteArray();
                con.setCargarOrdenMedica(bytesArchivo);
            }

            sfl.create(con);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Solicitud registrada correctamente", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            this.con = new Solicitudes();
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al registrar solicitud", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            e.printStackTrace();
        }
    }

    public String editarSolicitudP1(Solicitudes item) {
        this.con = item;
        return "/views/CrearActualizar.xhtml?faces-redirect=true";
    }

    public void editarSolicitudP2() {
        try {
            if (archivoOrdenMedica != null) {
                InputStream input = archivoOrdenMedica.getInputStream();
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();

                int nRead;
                byte[] data = new byte[1024];
                while ((nRead = input.read(data, 0, data.length)) != -1) {
                    buffer.write(data, 0, nRead);
                }

                buffer.flush();
                byte[] bytesArchivo = buffer.toByteArray();
                con.setCargarOrdenMedica(bytesArchivo);
            }

            this.sfl.edit(con);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Solicitud editada correctamente", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
        }
    }

    public void eliminarSolicitud(Solicitudes item) {
        try {
            this.sfl.remove(item);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Solicitud eliminada exitosamente", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
        }
    }
}
