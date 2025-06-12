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
@Table(name = "alerta_dosificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlertaDosificacion.findAll", query = "SELECT a FROM AlertaDosificacion a"),
    @NamedQuery(name = "AlertaDosificacion.findByIdAlerta", query = "SELECT a FROM AlertaDosificacion a WHERE a.idAlerta = :idAlerta"),
    @NamedQuery(name = "AlertaDosificacion.findByIdPaciente", query = "SELECT a FROM AlertaDosificacion a WHERE a.idPaciente = :idPaciente"),
    @NamedQuery(name = "AlertaDosificacion.findByIdMedicamento", query = "SELECT a FROM AlertaDosificacion a WHERE a.idMedicamento = :idMedicamento"),
    @NamedQuery(name = "AlertaDosificacion.findByFechaAlerta", query = "SELECT a FROM AlertaDosificacion a WHERE a.fechaAlerta = :fechaAlerta"),
    @NamedQuery(name = "AlertaDosificacion.findByTipoAlerta", query = "SELECT a FROM AlertaDosificacion a WHERE a.tipoAlerta = :tipoAlerta"),
    @NamedQuery(name = "AlertaDosificacion.findByDosisRecomendada", query = "SELECT a FROM AlertaDosificacion a WHERE a.dosisRecomendada = :dosisRecomendada"),
    @NamedQuery(name = "AlertaDosificacion.findByEstadoAlerta", query = "SELECT a FROM AlertaDosificacion a WHERE a.estadoAlerta = :estadoAlerta"),
    @NamedQuery(name = "AlertaDosificacion.findByComentarios", query = "SELECT a FROM AlertaDosificacion a WHERE a.comentarios = :comentarios")})
public class AlertaDosificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ALERTA")
    private Integer idAlerta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PACIENTE")
    private int idPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MEDICAMENTO")
    private int idMedicamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_ALERTA")
    @Temporal(TemporalType.DATE)
    private Date fechaAlerta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "TIPO_ALERTA")
    private String tipoAlerta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DOSIS_RECOMENDADA")
    private String dosisRecomendada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ESTADO_ALERTA")
    private String estadoAlerta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "COMENTARIOS")
    private String comentarios;

    public AlertaDosificacion() {
    }

    public AlertaDosificacion(Integer idAlerta) {
        this.idAlerta = idAlerta;
    }

    public AlertaDosificacion(Integer idAlerta, int idPaciente, int idMedicamento, Date fechaAlerta, String tipoAlerta, String dosisRecomendada, String estadoAlerta, String comentarios) {
        this.idAlerta = idAlerta;
        this.idPaciente = idPaciente;
        this.idMedicamento = idMedicamento;
        this.fechaAlerta = fechaAlerta;
        this.tipoAlerta = tipoAlerta;
        this.dosisRecomendada = dosisRecomendada;
        this.estadoAlerta = estadoAlerta;
        this.comentarios = comentarios;
    }

    public Integer getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(Integer idAlerta) {
        this.idAlerta = idAlerta;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public Date getFechaAlerta() {
        return fechaAlerta;
    }

    public void setFechaAlerta(Date fechaAlerta) {
        this.fechaAlerta = fechaAlerta;
    }

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public String getDosisRecomendada() {
        return dosisRecomendada;
    }

    public void setDosisRecomendada(String dosisRecomendada) {
        this.dosisRecomendada = dosisRecomendada;
    }

    public String getEstadoAlerta() {
        return estadoAlerta;
    }

    public void setEstadoAlerta(String estadoAlerta) {
        this.estadoAlerta = estadoAlerta;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlerta != null ? idAlerta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlertaDosificacion)) {
            return false;
        }
        AlertaDosificacion other = (AlertaDosificacion) object;
        if ((this.idAlerta == null && other.idAlerta != null) || (this.idAlerta != null && !this.idAlerta.equals(other.idAlerta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.AlertaDosificacion[ idAlerta=" + idAlerta + " ]";
    }
    
}
