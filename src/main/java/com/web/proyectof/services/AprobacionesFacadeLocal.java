/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Aprobaciones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface AprobacionesFacadeLocal {

    void create(Aprobaciones aprobaciones);

    void edit(Aprobaciones aprobaciones);

    void remove(Aprobaciones aprobaciones);

    Aprobaciones find(Object id);

    List<Aprobaciones> findAll();

    List<Aprobaciones> findRange(int[] range);

    int count();
    
}
