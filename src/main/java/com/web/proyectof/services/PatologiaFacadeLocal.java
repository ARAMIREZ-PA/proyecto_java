/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Patologia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface PatologiaFacadeLocal {

    void create(Patologia patologia);

    void edit(Patologia patologia);

    void remove(Patologia patologia);

    Patologia find(Object id);

    List<Patologia> findAll();

    List<Patologia> findRange(int[] range);

    int count();
    
}
