/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author User
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "com.web_Proyectof_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Usuario iniciarSesion(String usuario, String password) {
        System.out.println("mensaje");
         try {
        Query query = em.createQuery("SELECT U from Usuario U where U.numeroDocumento=:usuario AND u.passwordConfirmado=:password");
        query.setParameter("usuario", usuario);
        query.setParameter("password", password);
       return (Usuario) query.getSingleResult();
       }catch (Exception e) {
           System.out.println(e.getMessage());
       }
       Usuario usuarioVacio = new Usuario();
       return usuarioVacio; 
    }
    
}
