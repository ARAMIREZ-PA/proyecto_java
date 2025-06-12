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
@Table(name = "contactanos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactanos.findAll", query = "SELECT c FROM Contactanos c"),
    @NamedQuery(name = "Contactanos.findByIdContacto", query = "SELECT c FROM Contactanos c WHERE c.idContacto = :idContacto"),
    @NamedQuery(name = "Contactanos.findByTipoDocumento", query = "SELECT c FROM Contactanos c WHERE c.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Contactanos.findByNombreCompleto", query = "SELECT c FROM Contactanos c WHERE c.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Contactanos.findByCorreoElectronico", query = "SELECT c FROM Contactanos c WHERE c.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Contactanos.findByCelular", query = "SELECT c FROM Contactanos c WHERE c.celular = :celular"),
    @NamedQuery(name = "Contactanos.findByObservaciones", query = "SELECT c FROM Contactanos c WHERE c.observaciones = :observaciones")})
public class Contactanos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CONTACTO")
    private Integer idContacto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "NOMBRE COMPLETO")
    private String nombreCompleto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CELULAR")
    private int celular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public Contactanos() {
    }

    public Contactanos(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public Contactanos(Integer idContacto, String tipoDocumento, String nombreCompleto, String correoElectronico, int celular, String observaciones) {
        this.idContacto = idContacto;
        this.tipoDocumento = tipoDocumento;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.observaciones = observaciones;
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
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
        hash += (idContacto != null ? idContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactanos)) {
            return false;
        }
        Contactanos other = (Contactanos) object;
        if ((this.idContacto == null && other.idContacto != null) || (this.idContacto != null && !this.idContacto.equals(other.idContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Contactanos[ idContacto=" + idContacto + " ]";
    }
    
}
