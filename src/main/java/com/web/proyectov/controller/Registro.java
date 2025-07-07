/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.proyectov.controller;

import com.web.proyectof.entidades.Usuario;
import com.web.proyectof.services.UsuarioFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 *
 * @author User
 */

@Named(value = "registro")
@ViewScoped
public class Registro implements Serializable {

    private Usuario con = new Usuario(); // Usuario para registro

    @EJB
    private UsuarioFacadeLocal rfl;

    public Registro() {
    }

    // Getters y Setters
    public Usuario getCon() {
        return con;
    }

    public void setCon(Usuario con) {
        this.con = con;
    }


    public String crearP1() {
        this.con = new Usuario();
        return "/TemplateRegistro.xhtml"; // nota el slash inicial y la extensión .xhtml
    }

    /**
     * Registra un nuevo usuario
     *
     * @return
     */
public String crearP2() {
    System.out.println("🟢 Entró al método crearP2()");
    try {
        System.out.println("👤 Usuario a registrar: " + con);
        rfl.create(con);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario registrado correctamente", null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        this.con = new Usuario();
        return "/login.xhtml?faces-redirect=true";
} catch (javax.validation.ConstraintViolationException ex) {
    for (javax.validation.ConstraintViolation<?> cv : ex.getConstraintViolations()) {
        System.err.println("⚠️ Violación: " + cv.getPropertyPath() + " - " + cv.getMessage());
    }
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
        FacesMessage.SEVERITY_ERROR, "Error de validación", "Revisa los datos ingresados."));
    ex.printStackTrace();
    return null;
} catch (Exception e) {
    System.err.println("❌ Excepción general al registrar usuario:");
    e.printStackTrace();
    return null;
}
}
}

