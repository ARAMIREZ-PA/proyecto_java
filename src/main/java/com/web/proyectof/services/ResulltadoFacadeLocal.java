/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Resulltado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface ResulltadoFacadeLocal {

    void create(Resulltado resulltado);

    void edit(Resulltado resulltado);

    void remove(Resulltado resulltado);

    Resulltado find(Object id);

    List<Resulltado> findAll();

    List<Resulltado> findRange(int[] range);

    int count();
    
}
