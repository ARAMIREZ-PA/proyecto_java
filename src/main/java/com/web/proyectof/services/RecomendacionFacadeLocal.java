/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Recomendacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface RecomendacionFacadeLocal {

    void create(Recomendacion recomendacion);

    void edit(Recomendacion recomendacion);

    void remove(Recomendacion recomendacion);

    Recomendacion find(Object id);

    List<Recomendacion> findAll();

    List<Recomendacion> findRange(int[] range);

    int count();
    
}
