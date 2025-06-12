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
@Table(name = "inicio_sesion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InicioSesion.findAll", query = "SELECT i FROM InicioSesion i"),
    @NamedQuery(name = "InicioSesion.findById", query = "SELECT i FROM InicioSesion i WHERE i.id = :id"),
    @NamedQuery(name = "InicioSesion.findByTipoDocumento", query = "SELECT i FROM InicioSesion i WHERE i.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "InicioSesion.findByNumeroDocumento", query = "SELECT i FROM InicioSesion i WHERE i.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "InicioSesion.findByPasswordUsuario", query = "SELECT i FROM InicioSesion i WHERE i.passwordUsuario = :passwordUsuario"),
    @NamedQuery(name = "InicioSesion.findByFechaIngreso", query = "SELECT i FROM InicioSesion i WHERE i.fechaIngreso = :fechaIngreso")})
public class InicioSesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_DOCUMENTO")
    private int numeroDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "PASSWORD_USUARIO")
    private String passwordUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    public InicioSesion() {
    }

    public InicioSesion(Integer id) {
        this.id = id;
    }

    public InicioSesion(Integer id, String tipoDocumento, int numeroDocumento, String passwordUsuario, Date fechaIngreso) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.passwordUsuario = passwordUsuario;
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InicioSesion)) {
            return false;
        }
        InicioSesion other = (InicioSesion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.InicioSesion[ id=" + id + " ]";
    }
    
}
