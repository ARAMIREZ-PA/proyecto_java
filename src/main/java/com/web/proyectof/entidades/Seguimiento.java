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
import javax.persistence.Lob;
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
@Table(name = "seguimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seguimiento.findAll", query = "SELECT s FROM Seguimiento s"),
    @NamedQuery(name = "Seguimiento.findByIdSeguimiento", query = "SELECT s FROM Seguimiento s WHERE s.idSeguimiento = :idSeguimiento"),
    @NamedQuery(name = "Seguimiento.findByIdPatologia", query = "SELECT s FROM Seguimiento s WHERE s.idPatologia = :idPatologia"),
    @NamedQuery(name = "Seguimiento.findByIdPaciente", query = "SELECT s FROM Seguimiento s WHERE s.idPaciente = :idPaciente"),
    @NamedQuery(name = "Seguimiento.findByObservaciones", query = "SELECT s FROM Seguimiento s WHERE s.observaciones = :observaciones")})
public class Seguimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SEGUIMIENTO")
    private Integer idSeguimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PATOLOGIA")
    private int idPatologia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PACIENTE")
    private int idPaciente;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "INFORME")
    private byte[] informe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public Seguimiento() {
    }

    public Seguimiento(Integer idSeguimiento) {
        this.idSeguimiento = idSeguimiento;
    }

    public Seguimiento(Integer idSeguimiento, int idPatologia, int idPaciente, byte[] informe, String observaciones) {
        this.idSeguimiento = idSeguimiento;
        this.idPatologia = idPatologia;
        this.idPaciente = idPaciente;
        this.informe = informe;
        this.observaciones = observaciones;
    }

    public Integer getIdSeguimiento() {
        return idSeguimiento;
    }

    public void setIdSeguimiento(Integer idSeguimiento) {
        this.idSeguimiento = idSeguimiento;
    }

    public int getIdPatologia() {
        return idPatologia;
    }

    public void setIdPatologia(int idPatologia) {
        this.idPatologia = idPatologia;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public byte[] getInforme() {
        return informe;
    }

    public void setInforme(byte[] informe) {
        this.informe = informe;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeguimiento != null ? idSeguimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seguimiento)) {
            return false;
        }
        Seguimiento other = (Seguimiento) object;
        if ((this.idSeguimiento == null && other.idSeguimiento != null) || (this.idSeguimiento != null && !this.idSeguimiento.equals(other.idSeguimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Seguimiento[ idSeguimiento=" + idSeguimiento + " ]";
    }
    
}
