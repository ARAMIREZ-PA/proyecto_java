package com.web.proyectof.services;

import com.web.proyectof.entidades.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

    /**
     * Registro de usuario (persistencia personalizada)
     */
    @Override
    public void create(Usuario usuario) {
        em.persist(usuario);
        em.flush(); // lanza error si falla
    }

    /**
     * Inicio de sesión con verificación por número de documento y contraseña
     */
    @Override
    public Usuario iniciarSesion(String usuario, String password) {
        try {
            Query query = em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.numeroDocumento = :usuario AND u.passwordConfirmado = :password"
            );
            query.setParameter("usuario", usuario);
            query.setParameter("password", password);
            return (Usuario) query.getSingleResult();
        } catch (Exception e) {
            System.err.println("⚠️ Error en inicio de sesión: " + e.getMessage());
        }
        return null;
    }
}
