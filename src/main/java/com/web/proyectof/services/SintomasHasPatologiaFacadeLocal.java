/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.SintomasHasPatologia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface SintomasHasPatologiaFacadeLocal {

    void create(SintomasHasPatologia sintomasHasPatologia);

    void edit(SintomasHasPatologia sintomasHasPatologia);

    void remove(SintomasHasPatologia sintomasHasPatologia);

    SintomasHasPatologia find(Object id);

    List<SintomasHasPatologia> findAll();

    List<SintomasHasPatologia> findRange(int[] range);

    int count();
    
}
