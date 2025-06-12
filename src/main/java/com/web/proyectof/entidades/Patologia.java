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
@Table(name = "patologia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patologia.findAll", query = "SELECT p FROM Patologia p"),
    @NamedQuery(name = "Patologia.findByIdPatologia", query = "SELECT p FROM Patologia p WHERE p.idPatologia = :idPatologia"),
    @NamedQuery(name = "Patologia.findByNombrePatologia", query = "SELECT p FROM Patologia p WHERE p.nombrePatologia = :nombrePatologia"),
    @NamedQuery(name = "Patologia.findByFechaInicio", query = "SELECT p FROM Patologia p WHERE p.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Patologia.findByFechaFin", query = "SELECT p FROM Patologia p WHERE p.fechaFin = :fechaFin"),
    @NamedQuery(name = "Patologia.findByCitas", query = "SELECT p FROM Patologia p WHERE p.citas = :citas")})
public class Patologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PATOLOGIA")
    private Integer idPatologia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NOMBRE_PATOLOGIA")
    private String nombrePatologia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "CITAS")
    private String citas;

    public Patologia() {
    }

    public Patologia(Integer idPatologia) {
        this.idPatologia = idPatologia;
    }

    public Patologia(Integer idPatologia, String nombrePatologia, Date fechaInicio, Date fechaFin, String citas) {
        this.idPatologia = idPatologia;
        this.nombrePatologia = nombrePatologia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.citas = citas;
    }

    public Integer getIdPatologia() {
        return idPatologia;
    }

    public void setIdPatologia(Integer idPatologia) {
        this.idPatologia = idPatologia;
    }

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCitas() {
        return citas;
    }

    public void setCitas(String citas) {
        this.citas = citas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPatologia != null ? idPatologia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patologia)) {
            return false;
        }
        Patologia other = (Patologia) object;
        if ((this.idPatologia == null && other.idPatologia != null) || (this.idPatologia != null && !this.idPatologia.equals(other.idPatologia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Patologia[ idPatologia=" + idPatologia + " ]";
    }
    
}
