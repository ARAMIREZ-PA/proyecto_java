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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "sintomas_has_patologia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SintomasHasPatologia.findAll", query = "SELECT s FROM SintomasHasPatologia s"),
    @NamedQuery(name = "SintomasHasPatologia.findByIdSintomaPatologia", query = "SELECT s FROM SintomasHasPatologia s WHERE s.idSintomaPatologia = :idSintomaPatologia"),
    @NamedQuery(name = "SintomasHasPatologia.findBySintomasIDSINTOMAS", query = "SELECT s FROM SintomasHasPatologia s WHERE s.sintomasIDSINTOMAS = :sintomasIDSINTOMAS")})
public class SintomasHasPatologia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SINTOMA_PATOLOGIA")
    private Integer idSintomaPatologia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sintomas_ID_SINTOMAS")
    private int sintomasIDSINTOMAS;

    public SintomasHasPatologia() {
    }

    public SintomasHasPatologia(Integer idSintomaPatologia) {
        this.idSintomaPatologia = idSintomaPatologia;
    }

    public SintomasHasPatologia(Integer idSintomaPatologia, int sintomasIDSINTOMAS) {
        this.idSintomaPatologia = idSintomaPatologia;
        this.sintomasIDSINTOMAS = sintomasIDSINTOMAS;
    }

    public Integer getIdSintomaPatologia() {
        return idSintomaPatologia;
    }

    public void setIdSintomaPatologia(Integer idSintomaPatologia) {
        this.idSintomaPatologia = idSintomaPatologia;
    }

    public int getSintomasIDSINTOMAS() {
        return sintomasIDSINTOMAS;
    }

    public void setSintomasIDSINTOMAS(int sintomasIDSINTOMAS) {
        this.sintomasIDSINTOMAS = sintomasIDSINTOMAS;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSintomaPatologia != null ? idSintomaPatologia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SintomasHasPatologia)) {
            return false;
        }
        SintomasHasPatologia other = (SintomasHasPatologia) object;
        if ((this.idSintomaPatologia == null && other.idSintomaPatologia != null) || (this.idSintomaPatologia != null && !this.idSintomaPatologia.equals(other.idSintomaPatologia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.SintomasHasPatologia[ idSintomaPatologia=" + idSintomaPatologia + " ]";
    }
    
}
