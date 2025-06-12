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
@Table(name = "solicitudes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitudes.findAll", query = "SELECT s FROM Solicitudes s"),
    @NamedQuery(name = "Solicitudes.findByIdSolicitud", query = "SELECT s FROM Solicitudes s WHERE s.idSolicitud = :idSolicitud"),
    @NamedQuery(name = "Solicitudes.findByTipoDocumento", query = "SELECT s FROM Solicitudes s WHERE s.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Solicitudes.findByNumeroDocumento", query = "SELECT s FROM Solicitudes s WHERE s.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Solicitudes.findByNombreCompleto", query = "SELECT s FROM Solicitudes s WHERE s.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Solicitudes.findByDireccionResidencia", query = "SELECT s FROM Solicitudes s WHERE s.direccionResidencia = :direccionResidencia"),
    @NamedQuery(name = "Solicitudes.findByIndicaciones", query = "SELECT s FROM Solicitudes s WHERE s.indicaciones = :indicaciones"),
    @NamedQuery(name = "Solicitudes.findByCiudad", query = "SELECT s FROM Solicitudes s WHERE s.ciudad = :ciudad"),
    @NamedQuery(name = "Solicitudes.findByDepartamento", query = "SELECT s FROM Solicitudes s WHERE s.departamento = :departamento"),
    @NamedQuery(name = "Solicitudes.findByCorreoElectronico", query = "SELECT s FROM Solicitudes s WHERE s.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Solicitudes.findByConfirmacionCorreo", query = "SELECT s FROM Solicitudes s WHERE s.confirmacionCorreo = :confirmacionCorreo"),
    @NamedQuery(name = "Solicitudes.findByCelular", query = "SELECT s FROM Solicitudes s WHERE s.celular = :celular"),
    @NamedQuery(name = "Solicitudes.findByConfirmacionCelular", query = "SELECT s FROM Solicitudes s WHERE s.confirmacionCelular = :confirmacionCelular"),
    @NamedQuery(name = "Solicitudes.findByOrdenMedica", query = "SELECT s FROM Solicitudes s WHERE s.ordenMedica = :ordenMedica"),
    @NamedQuery(name = "Solicitudes.findByConfirmaTerminos", query = "SELECT s FROM Solicitudes s WHERE s.confirmaTerminos = :confirmaTerminos")})
public class Solicitudes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SOLICITUD")
    private Integer idSolicitud;
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
    @Size(min = 1, max = 120)
    @Column(name = "NOMBRE_COMPLETO")
    private String nombreCompleto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "DIRECCION_RESIDENCIA")
    private String direccionResidencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "INDICACIONES")
    private String indicaciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CIUDAD")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "CONFIRMACION_CORREO")
    private String confirmacionCorreo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CELULAR")
    private String celular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CONFIRMACION_CELULAR")
    private String confirmacionCelular;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "CARGAR_ORDEN_MEDICA")
    private byte[] cargarOrdenMedica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ORDEN_MEDICA")
    private String ordenMedica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CONFIRMA_TERMINOS")
    private short confirmaTerminos;

    public Solicitudes() {
    }

    public Solicitudes(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Solicitudes(Integer idSolicitud, String tipoDocumento, int numeroDocumento, String nombreCompleto, String direccionResidencia, String indicaciones, String ciudad, String departamento, String correoElectronico, String confirmacionCorreo, String celular, String confirmacionCelular, byte[] cargarOrdenMedica, String ordenMedica, short confirmaTerminos) {
        this.idSolicitud = idSolicitud;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
        this.indicaciones = indicaciones;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.correoElectronico = correoElectronico;
        this.confirmacionCorreo = confirmacionCorreo;
        this.celular = celular;
        this.confirmacionCelular = confirmacionCelular;
        this.cargarOrdenMedica = cargarOrdenMedica;
        this.ordenMedica = ordenMedica;
        this.confirmaTerminos = confirmaTerminos;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
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

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getConfirmacionCorreo() {
        return confirmacionCorreo;
    }

    public void setConfirmacionCorreo(String confirmacionCorreo) {
        this.confirmacionCorreo = confirmacionCorreo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getConfirmacionCelular() {
        return confirmacionCelular;
    }

    public void setConfirmacionCelular(String confirmacionCelular) {
        this.confirmacionCelular = confirmacionCelular;
    }

    public byte[] getCargarOrdenMedica() {
        return cargarOrdenMedica;
    }

    public void setCargarOrdenMedica(byte[] cargarOrdenMedica) {
        this.cargarOrdenMedica = cargarOrdenMedica;
    }

    public String getOrdenMedica() {
        return ordenMedica;
    }

    public void setOrdenMedica(String ordenMedica) {
        this.ordenMedica = ordenMedica;
    }

    public short getConfirmaTerminos() {
        return confirmaTerminos;
    }

    public void setConfirmaTerminos(short confirmaTerminos) {
        this.confirmaTerminos = confirmaTerminos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitud != null ? idSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitudes)) {
            return false;
        }
        Solicitudes other = (Solicitudes) object;
        if ((this.idSolicitud == null && other.idSolicitud != null) || (this.idSolicitud != null && !this.idSolicitud.equals(other.idSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Solicitudes[ idSolicitud=" + idSolicitud + " ]";
    }
    
}
