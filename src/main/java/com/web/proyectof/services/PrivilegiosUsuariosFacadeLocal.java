/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.web.proyectof.services;

import com.web.proyectof.entidades.PrivilegiosUsuarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface PrivilegiosUsuariosFacadeLocal {

    void create(PrivilegiosUsuarios privilegiosUsuarios);

    void edit(PrivilegiosUsuarios privilegiosUsuarios);

    void remove(PrivilegiosUsuarios privilegiosUsuarios);

    PrivilegiosUsuarios find(Object id);

    List<PrivilegiosUsuarios> findAll();

    List<PrivilegiosUsuarios> findRange(int[] range);

    int count();
    
}
