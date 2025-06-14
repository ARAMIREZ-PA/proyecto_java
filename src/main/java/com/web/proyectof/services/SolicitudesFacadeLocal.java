/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Solicitudes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface SolicitudesFacadeLocal {

    void create(Solicitudes solicitudes);

    void edit(Solicitudes solicitudes);

    void remove(Solicitudes solicitudes);

    Solicitudes find(Object id);

    List<Solicitudes> findAll();

    List<Solicitudes> findRange(int[] range);

    int count();
    
}
