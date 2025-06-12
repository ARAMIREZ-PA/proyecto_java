/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.Medicamentos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface MedicamentosFacadeLocal {

    void create(Medicamentos medicamentos);

    void edit(Medicamentos medicamentos);

    void remove(Medicamentos medicamentos);

    Medicamentos find(Object id);

    List<Medicamentos> findAll();

    List<Medicamentos> findRange(int[] range);

    int count();
    
}
