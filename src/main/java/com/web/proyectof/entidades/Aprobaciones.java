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
import javax.persistence.Lob;
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
@Table(name = "aprobaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aprobaciones.findAll", query = "SELECT a FROM Aprobaciones a"),
    @NamedQuery(name = "Aprobaciones.findByIdAprobaciones", query = "SELECT a FROM Aprobaciones a WHERE a.idAprobaciones = :idAprobaciones"),
    @NamedQuery(name = "Aprobaciones.findByIdAdministrador", query = "SELECT a FROM Aprobaciones a WHERE a.idAdministrador = :idAdministrador"),
    @NamedQuery(name = "Aprobaciones.findByTipoAprobacion", query = "SELECT a FROM Aprobaciones a WHERE a.tipoAprobacion = :tipoAprobacion"),
    @NamedQuery(name = "Aprobaciones.findByEstado", query = "SELECT a FROM Aprobaciones a WHERE a.estado = :estado"),
    @NamedQuery(name = "Aprobaciones.findByMotivoRechazo", query = "SELECT a FROM Aprobaciones a WHERE a.motivoRechazo = :motivoRechazo"),
    @NamedQuery(name = "Aprobaciones.findByFechaProceso", query = "SELECT a FROM Aprobaciones a WHERE a.fechaProceso = :fechaProceso"),
    @NamedQuery(name = "Aprobaciones.findByRolIdUsuarioPaciente", query = "SELECT a FROM Aprobaciones a WHERE a.rolIdUsuarioPaciente = :rolIdUsuarioPaciente"),
    @NamedQuery(name = "Aprobaciones.findByFechaSolicitud", query = "SELECT a FROM Aprobaciones a WHERE a.fechaSolicitud = :fechaSolicitud"),
    @NamedQuery(name = "Aprobaciones.findByIdAprobacion", query = "SELECT a FROM Aprobaciones a WHERE a.idAprobacion = :idAprobacion")})
public class Aprobaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_APROBACIONES")
    private Integer idAprobaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ADMINISTRADOR")
    private int idAdministrador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "TIPO_APROBACION")
    private String tipoAprobacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 254)
    @Column(name = "MOTIVO_RECHAZO")
    private String motivoRechazo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_PROCESO")
    @Temporal(TemporalType.DATE)
    private Date fechaProceso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROL_ID_USUARIO_PACIENTE")
    private int rolIdUsuarioPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA SOLICITUD")
    @Temporal(TemporalType.DATE)
    private Date fechaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_APROBACION")
    private int idAprobacion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "DOCUMENTO_ADJUNTO")
    private byte[] documentoAdjunto;

    public Aprobaciones() {
    }

    public Aprobaciones(Integer idAprobaciones) {
        this.idAprobaciones = idAprobaciones;
    }

    public Aprobaciones(Integer idAprobaciones, int idAdministrador, String tipoAprobacion, String estado, String motivoRechazo, Date fechaProceso, int rolIdUsuarioPaciente, Date fechaSolicitud, int idAprobacion, byte[] documentoAdjunto) {
        this.idAprobaciones = idAprobaciones;
        this.idAdministrador = idAdministrador;
        this.tipoAprobacion = tipoAprobacion;
        this.estado = estado;
        this.motivoRechazo = motivoRechazo;
        this.fechaProceso = fechaProceso;
        this.rolIdUsuarioPaciente = rolIdUsuarioPaciente;
        this.fechaSolicitud = fechaSolicitud;
        this.idAprobacion = idAprobacion;
        this.documentoAdjunto = documentoAdjunto;
    }

    public Integer getIdAprobaciones() {
        return idAprobaciones;
    }

    public void setIdAprobaciones(Integer idAprobaciones) {
        this.idAprobaciones = idAprobaciones;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getTipoAprobacion() {
        return tipoAprobacion;
    }

    public void setTipoAprobacion(String tipoAprobacion) {
        this.tipoAprobacion = tipoAprobacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }

    public Date getFechaProceso() {
        return fechaProceso;
    }

    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }

    public int getRolIdUsuarioPaciente() {
        return rolIdUsuarioPaciente;
    }

    public void setRolIdUsuarioPaciente(int rolIdUsuarioPaciente) {
        this.rolIdUsuarioPaciente = rolIdUsuarioPaciente;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public int getIdAprobacion() {
        return idAprobacion;
    }

    public void setIdAprobacion(int idAprobacion) {
        this.idAprobacion = idAprobacion;
    }

    public byte[] getDocumentoAdjunto() {
        return documentoAdjunto;
    }

    public void setDocumentoAdjunto(byte[] documentoAdjunto) {
        this.documentoAdjunto = documentoAdjunto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAprobaciones != null ? idAprobaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aprobaciones)) {
            return false;
        }
        Aprobaciones other = (Aprobaciones) object;
        if ((this.idAprobaciones == null && other.idAprobaciones != null) || (this.idAprobaciones != null && !this.idAprobaciones.equals(other.idAprobaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Aprobaciones[ idAprobaciones=" + idAprobaciones + " ]";
    }
    
}
