/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Resulltado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class ResulltadoFacade extends AbstractFacade<Resulltado> implements ResulltadoFacadeLocal {

    @PersistenceContext(unitName = "com.web_Proyectof_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResulltadoFacade() {
        super(Resulltado.class);
    }
    
}
