/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Contactanos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface ContactanosFacadeLocal {

    void create(Contactanos contactanos);

    void edit(Contactanos contactanos);

    void remove(Contactanos contactanos);

    Contactanos find(Object id);

    List<Contactanos> findAll();

    List<Contactanos> findRange(int[] range);

    int count();
    
}
