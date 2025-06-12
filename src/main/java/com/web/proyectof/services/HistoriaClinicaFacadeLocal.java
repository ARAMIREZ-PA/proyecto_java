/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.HistoriaClinica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface HistoriaClinicaFacadeLocal {

    void create(HistoriaClinica historiaClinica);

    void edit(HistoriaClinica historiaClinica);

    void remove(HistoriaClinica historiaClinica);

    HistoriaClinica find(Object id);

    List<HistoriaClinica> findAll();

    List<HistoriaClinica> findRange(int[] range);

    int count();
    
}
