/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.web.proyectov.controller;

import com.web.proyectof.entidades.Usuario;
import com.web.proyectof.services.UsuarioFacade;
import com.web.proyectof.services.UsuarioFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@Named(value = "login")
@SessionScoped
public class Login implements Serializable {
private Usuario usuarioValidado;     
private String usuario;
private String contrasenna;
@EJB
private UsuarioFacadeLocal ufl;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String iniciarSesion(){
        
        usuarioValidado = this.ufl.iniciarSesion(usuario, contrasenna);
        if(usuarioValidado.getId()!=null){
            HttpSession sesion = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            sesion.setAttribute("usuario", usuario);
            return "inicio";
        }else{
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña Incorrectos", "MSG_INFO");
            fc.addMessage(null, fm);
            return null;
        }
    
    }

    public Login() {
    }
}
