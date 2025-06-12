/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.proyectov.security;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class Filtro implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest solicitud = (HttpServletRequest) request;
        HttpServletResponse respuesta = (HttpServletResponse) response;
        // at5ributos para validaciones de inicio de sesión
        HttpSession sesion = solicitud.getSession();
        String rutaSolicitud = solicitud.getRequestURI();
        String raiz = solicitud.getContextPath();

        respuesta.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
        respuesta.setHeader("Pragma", "no-cache");
        respuesta.setDateHeader("Expires", 0);

        // Validaciones adicionales:
        //1. Verificar si la sesión es valida
        boolean validarSesion = ((sesion != null) && (sesion.getAttribute("usuario") != null));
        //2. Validar que la ruta de donde proviene el long sea correcta

        boolean validarRutaLogin = ((rutaSolicitud.equals(raiz + "/")) || (rutaSolicitud.equals(raiz + "/login.xhtml")));

        //3. Garantizar que efectivamente se este cargando el contenido estatico
        boolean validarContenido = rutaSolicitud.contains("/resources/");
        if (validarContenido || validarRutaLogin || validarSesion) {
            chain.doFilter(request, response);
        } else {
            respuesta.sendRedirect(raiz);
        }

    }

    @Override
    public void destroy() {
  //      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
