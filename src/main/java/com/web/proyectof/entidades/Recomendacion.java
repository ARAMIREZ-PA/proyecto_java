/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.proyectof.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "recomendacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recomendacion.findAll", query = "SELECT r FROM Recomendacion r"),
    @NamedQuery(name = "Recomendacion.findByIdRecomendacion", query = "SELECT r FROM Recomendacion r WHERE r.idRecomendacion = :idRecomendacion"),
    @NamedQuery(name = "Recomendacion.findByIdPaciente", query = "SELECT r FROM Recomendacion r WHERE r.idPaciente = :idPaciente"),
    @NamedQuery(name = "Recomendacion.findByIdDoctor", query = "SELECT r FROM Recomendacion r WHERE r.idDoctor = :idDoctor"),
    @NamedQuery(name = "Recomendacion.findByFechaRecomendacion", query = "SELECT r FROM Recomendacion r WHERE r.fechaRecomendacion = :fechaRecomendacion"),
    @NamedQuery(name = "Recomendacion.findByDescripccionRecomendacion", query = "SELECT r FROM Recomendacion r WHERE r.descripccionRecomendacion = :descripccionRecomendacion")})
public class Recomendacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_RECOMENDACION")
    private Integer idRecomendacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PACIENTE")
    private int idPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DOCTOR")
    private int idDoctor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_RECOMENDACION")
    @Temporal(TemporalType.DATE)
    private Date fechaRecomendacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "DESCRIPCCION RECOMENDACION")
    private String descripccionRecomendacion;

    public Recomendacion() {
    }

    public Recomendacion(Integer idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public Recomendacion(Integer idRecomendacion, int idPaciente, int idDoctor, Date fechaRecomendacion, String descripccionRecomendacion) {
        this.idRecomendacion = idRecomendacion;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.fechaRecomendacion = fechaRecomendacion;
        this.descripccionRecomendacion = descripccionRecomendacion;
    }

    public Integer getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(Integer idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Date getFechaRecomendacion() {
        return fechaRecomendacion;
    }

    public void setFechaRecomendacion(Date fechaRecomendacion) {
        this.fechaRecomendacion = fechaRecomendacion;
    }

    public String getDescripccionRecomendacion() {
        return descripccionRecomendacion;
    }

    public void setDescripccionRecomendacion(String descripccionRecomendacion) {
        this.descripccionRecomendacion = descripccionRecomendacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecomendacion != null ? idRecomendacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recomendacion)) {
            return false;
        }
        Recomendacion other = (Recomendacion) object;
        if ((this.idRecomendacion == null && other.idRecomendacion != null) || (this.idRecomendacion != null && !this.idRecomendacion.equals(other.idRecomendacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Recomendacion[ idRecomendacion=" + idRecomendacion + " ]";
    }
    
}
