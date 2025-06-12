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
@Table(name = "examen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Examen.findAll", query = "SELECT e FROM Examen e"),
    @NamedQuery(name = "Examen.findByIdExamen", query = "SELECT e FROM Examen e WHERE e.idExamen = :idExamen"),
    @NamedQuery(name = "Examen.findByIdPaciente", query = "SELECT e FROM Examen e WHERE e.idPaciente = :idPaciente"),
    @NamedQuery(name = "Examen.findByNombreExamen", query = "SELECT e FROM Examen e WHERE e.nombreExamen = :nombreExamen"),
    @NamedQuery(name = "Examen.findByTipoExamen", query = "SELECT e FROM Examen e WHERE e.tipoExamen = :tipoExamen"),
    @NamedQuery(name = "Examen.findByPreparacion", query = "SELECT e FROM Examen e WHERE e.preparacion = :preparacion"),
    @NamedQuery(name = "Examen.findByEstadoExamen", query = "SELECT e FROM Examen e WHERE e.estadoExamen = :estadoExamen"),
    @NamedQuery(name = "Examen.findByDescripcion", query = "SELECT e FROM Examen e WHERE e.descripcion = :descripcion")})
public class Examen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_EXAMEN")
    private Integer idExamen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PACIENTE")
    private int idPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NOMBRE_EXAMEN")
    private String nombreExamen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    @Column(name = "TIPO_EXAMEN")
    private String tipoExamen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PREPARACION")
    private String preparacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ESTADO_EXAMEN")
    private String estadoExamen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Examen() {
    }

    public Examen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public Examen(Integer idExamen, int idPaciente, String nombreExamen, String tipoExamen, String preparacion, String estadoExamen, String descripcion) {
        this.idExamen = idExamen;
        this.idPaciente = idPaciente;
        this.nombreExamen = nombreExamen;
        this.tipoExamen = tipoExamen;
        this.preparacion = preparacion;
        this.estadoExamen = estadoExamen;
        this.descripcion = descripcion;
    }

    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public String getEstadoExamen() {
        return estadoExamen;
    }

    public void setEstadoExamen(String estadoExamen) {
        this.estadoExamen = estadoExamen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExamen != null ? idExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Examen)) {
            return false;
        }
        Examen other = (Examen) object;
        if ((this.idExamen == null && other.idExamen != null) || (this.idExamen != null && !this.idExamen.equals(other.idExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Examen[ idExamen=" + idExamen + " ]";
    }
    
}
