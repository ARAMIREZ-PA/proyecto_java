package com.web.proyectov.controller;

import com.web.proyectof.entidades.Solicitudes;
import com.web.proyectof.entidades.Usuario;
import com.web.proyectof.services.UsuarioFacadeLocal;
import java.awt.event.ActionEvent;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named(value = "login")
@SessionScoped
public class Login implements Serializable {

    private Usuario con = new Usuario(); // Usuario para registro
    private Usuario usuarioValidado;     // Usuario autenticado
    private String usuario;
    private String contrasenna;

    @EJB
    private UsuarioFacadeLocal ufl;

    public Login() {
    }

    // Getters y Setters
    public Usuario getCon() {
        return con;
    }

    public void setCon(Usuario con) {
        this.con = con;
    }

    public Usuario getUsuarioValidado() {
        return usuarioValidado;
    }

    public void setUsuarioValidado(Usuario usuarioValidado) {
        this.usuarioValidado = usuarioValidado;
    }

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

    /**
     * Método de login
     *
     * @return
     */
    public String iniciarSesion() {
        try {
            usuarioValidado = ufl.iniciarSesion(usuario, contrasenna);

            if (usuarioValidado != null && usuarioValidado.getId() != null) {
                // Guardar en sesión HTTP
                HttpSession sesion = (HttpSession) FacesContext.getCurrentInstance()
                        .getExternalContext().getSession(true);
                sesion.setAttribute("usuario", usuarioValidado);
                return "/views/TemPaginaPrin.xhtml?faces-redirect=true";
            } else {
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "Usuario y/o contraseña incorrectos", null);
                FacesContext.getCurrentInstance().addMessage(null, msg);
                return null;
            }

        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_FATAL,
                    "Error interno al iniciar sesión", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return null;
        }
    }

    /**
     * Método que se llama al cargar la vista de login
     */
    public void init() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        } catch (Exception e) {
            // Si no hay sesión activa aún, no pasa nada
        }
    }

    /**
     * Cierra la sesión actual
     *
     * @return
     */
    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login.xhtml?faces-redirect=true";
    }

}
