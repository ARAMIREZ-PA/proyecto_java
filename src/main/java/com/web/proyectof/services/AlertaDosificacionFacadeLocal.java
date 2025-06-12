/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.AlertaDosificacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface AlertaDosificacionFacadeLocal {

    void create(AlertaDosificacion alertaDosificacion);

    void edit(AlertaDosificacion alertaDosificacion);

    void remove(AlertaDosificacion alertaDosificacion);

    AlertaDosificacion find(Object id);

    List<AlertaDosificacion> findAll();

    List<AlertaDosificacion> findRange(int[] range);

    int count();
    
}
