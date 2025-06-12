/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.proyectof.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "resulltado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resulltado.findAll", query = "SELECT r FROM Resulltado r"),
    @NamedQuery(name = "Resulltado.findByIdResultado", query = "SELECT r FROM Resulltado r WHERE r.idResultado = :idResultado"),
    @NamedQuery(name = "Resulltado.findByIdPaciente", query = "SELECT r FROM Resulltado r WHERE r.idPaciente = :idPaciente"),
    @NamedQuery(name = "Resulltado.findByEstadoResultado", query = "SELECT r FROM Resulltado r WHERE r.estadoResultado = :estadoResultado"),
    @NamedQuery(name = "Resulltado.findByArchivoResultado", query = "SELECT r FROM Resulltado r WHERE r.archivoResultado = :archivoResultado")})
public class Resulltado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_RESULTADO")
    private Integer idResultado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ID_PACIENTE")
    private String idPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ESTADO_RESULTADO")
    private String estadoResultado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ARCHIVO_RESULTADO")
    private String archivoResultado;

    public Resulltado() {
    }

    public Resulltado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public Resulltado(Integer idResultado, String idPaciente, String estadoResultado, String archivoResultado) {
        this.idResultado = idResultado;
        this.idPaciente = idPaciente;
        this.estadoResultado = estadoResultado;
        this.archivoResultado = archivoResultado;
    }

    public Integer getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getEstadoResultado() {
        return estadoResultado;
    }

    public void setEstadoResultado(String estadoResultado) {
        this.estadoResultado = estadoResultado;
    }

    public String getArchivoResultado() {
        return archivoResultado;
    }

    public void setArchivoResultado(String archivoResultado) {
        this.archivoResultado = archivoResultado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResultado != null ? idResultado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resulltado)) {
            return false;
        }
        Resulltado other = (Resulltado) object;
        if ((this.idResultado == null && other.idResultado != null) || (this.idResultado != null && !this.idResultado.equals(other.idResultado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Resulltado[ idResultado=" + idResultado + " ]";
    }
    
}
