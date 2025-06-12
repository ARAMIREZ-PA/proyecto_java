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
@Table(name = "sedes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sedes.findAll", query = "SELECT s FROM Sedes s"),
    @NamedQuery(name = "Sedes.findByIdSede", query = "SELECT s FROM Sedes s WHERE s.idSede = :idSede"),
    @NamedQuery(name = "Sedes.findByNombreSede", query = "SELECT s FROM Sedes s WHERE s.nombreSede = :nombreSede"),
    @NamedQuery(name = "Sedes.findByDireccionSede", query = "SELECT s FROM Sedes s WHERE s.direccionSede = :direccionSede"),
    @NamedQuery(name = "Sedes.findByTelefonoSede", query = "SELECT s FROM Sedes s WHERE s.telefonoSede = :telefonoSede"),
    @NamedQuery(name = "Sedes.findByCorreoSede", query = "SELECT s FROM Sedes s WHERE s.correoSede = :correoSede")})
public class Sedes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SEDE")
    private Integer idSede;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE_SEDE")
    private String nombreSede;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "DIRECCION_SEDE")
    private String direccionSede;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TELEFONO_SEDE")
    private String telefonoSede;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CORREO_SEDE")
    private String correoSede;

    public Sedes() {
    }

    public Sedes(Integer idSede) {
        this.idSede = idSede;
    }

    public Sedes(Integer idSede, String nombreSede, String direccionSede, String telefonoSede, String correoSede) {
        this.idSede = idSede;
        this.nombreSede = nombreSede;
        this.direccionSede = direccionSede;
        this.telefonoSede = telefonoSede;
        this.correoSede = correoSede;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    public String getTelefonoSede() {
        return telefonoSede;
    }

    public void setTelefonoSede(String telefonoSede) {
        this.telefonoSede = telefonoSede;
    }

    public String getCorreoSede() {
        return correoSede;
    }

    public void setCorreoSede(String correoSede) {
        this.correoSede = correoSede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSede != null ? idSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sedes)) {
            return false;
        }
        Sedes other = (Sedes) object;
        if ((this.idSede == null && other.idSede != null) || (this.idSede != null && !this.idSede.equals(other.idSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Sedes[ idSede=" + idSede + " ]";
    }
    
}
