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
@Table(name = "control")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Control.findAll", query = "SELECT c FROM Control c"),
    @NamedQuery(name = "Control.findByIdControl", query = "SELECT c FROM Control c WHERE c.idControl = :idControl"),
    @NamedQuery(name = "Control.findByIdPatologia", query = "SELECT c FROM Control c WHERE c.idPatologia = :idPatologia"),
    @NamedQuery(name = "Control.findByFechaControl", query = "SELECT c FROM Control c WHERE c.fechaControl = :fechaControl"),
    @NamedQuery(name = "Control.findByNivelGlucosa", query = "SELECT c FROM Control c WHERE c.nivelGlucosa = :nivelGlucosa"),
    @NamedQuery(name = "Control.findByCantidadInsulina", query = "SELECT c FROM Control c WHERE c.cantidadInsulina = :cantidadInsulina"),
    @NamedQuery(name = "Control.findByPresionArterial", query = "SELECT c FROM Control c WHERE c.presionArterial = :presionArterial"),
    @NamedQuery(name = "Control.findByTiroides", query = "SELECT c FROM Control c WHERE c.tiroides = :tiroides"),
    @NamedQuery(name = "Control.findByEstadoAnimo", query = "SELECT c FROM Control c WHERE c.estadoAnimo = :estadoAnimo"),
    @NamedQuery(name = "Control.findByFechaInicio", query = "SELECT c FROM Control c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Control.findByDuracion", query = "SELECT c FROM Control c WHERE c.duracion = :duracion"),
    @NamedQuery(name = "Control.findByDescripcionSintoma", query = "SELECT c FROM Control c WHERE c.descripcionSintoma = :descripcionSintoma"),
    @NamedQuery(name = "Control.findByIntensidadSintoma", query = "SELECT c FROM Control c WHERE c.intensidadSintoma = :intensidadSintoma")})
public class Control implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CONTROL")
    private Integer idControl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PATOLOGIA")
    private int idPatologia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CONTROL")
    @Temporal(TemporalType.DATE)
    private Date fechaControl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NIVEL_GLUCOSA")
    private String nivelGlucosa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CANTIDAD_INSULINA")
    private String cantidadInsulina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "PRESION_ARTERIAL")
    private String presionArterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TIROIDES")
    private String tiroides;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ESTADO_ANIMO")
    private String estadoAnimo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "DURACION")
    private String duracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "DESCRIPCION_SINTOMA")
    private String descripcionSintoma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "INTENSIDAD_SINTOMA")
    private String intensidadSintoma;

    public Control() {
    }

    public Control(Integer idControl) {
        this.idControl = idControl;
    }

    public Control(Integer idControl, int idPatologia, Date fechaControl, String nivelGlucosa, String cantidadInsulina, String presionArterial, String tiroides, String estadoAnimo, Date fechaInicio, String duracion, String descripcionSintoma, String intensidadSintoma) {
        this.idControl = idControl;
        this.idPatologia = idPatologia;
        this.fechaControl = fechaControl;
        this.nivelGlucosa = nivelGlucosa;
        this.cantidadInsulina = cantidadInsulina;
        this.presionArterial = presionArterial;
        this.tiroides = tiroides;
        this.estadoAnimo = estadoAnimo;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.descripcionSintoma = descripcionSintoma;
        this.intensidadSintoma = intensidadSintoma;
    }

    public Integer getIdControl() {
        return idControl;
    }

    public void setIdControl(Integer idControl) {
        this.idControl = idControl;
    }

    public int getIdPatologia() {
        return idPatologia;
    }

    public void setIdPatologia(int idPatologia) {
        this.idPatologia = idPatologia;
    }

    public Date getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(Date fechaControl) {
        this.fechaControl = fechaControl;
    }

    public String getNivelGlucosa() {
        return nivelGlucosa;
    }

    public void setNivelGlucosa(String nivelGlucosa) {
        this.nivelGlucosa = nivelGlucosa;
    }

    public String getCantidadInsulina() {
        return cantidadInsulina;
    }

    public void setCantidadInsulina(String cantidadInsulina) {
        this.cantidadInsulina = cantidadInsulina;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public String getTiroides() {
        return tiroides;
    }

    public void setTiroides(String tiroides) {
        this.tiroides = tiroides;
    }

    public String getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(String estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcionSintoma() {
        return descripcionSintoma;
    }

    public void setDescripcionSintoma(String descripcionSintoma) {
        this.descripcionSintoma = descripcionSintoma;
    }

    public String getIntensidadSintoma() {
        return intensidadSintoma;
    }

    public void setIntensidadSintoma(String intensidadSintoma) {
        this.intensidadSintoma = intensidadSintoma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idControl != null ? idControl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Control)) {
            return false;
        }
        Control other = (Control) object;
        if ((this.idControl == null && other.idControl != null) || (this.idControl != null && !this.idControl.equals(other.idControl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Control[ idControl=" + idControl + " ]";
    }
    
}
