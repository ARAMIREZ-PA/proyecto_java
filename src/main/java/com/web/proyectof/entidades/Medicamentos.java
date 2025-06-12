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
@Table(name = "medicamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicamentos.findAll", query = "SELECT m FROM Medicamentos m"),
    @NamedQuery(name = "Medicamentos.findById", query = "SELECT m FROM Medicamentos m WHERE m.id = :id"),
    @NamedQuery(name = "Medicamentos.findByMedicoTratante", query = "SELECT m FROM Medicamentos m WHERE m.medicoTratante = :medicoTratante"),
    @NamedQuery(name = "Medicamentos.findByNombreMedicamento", query = "SELECT m FROM Medicamentos m WHERE m.nombreMedicamento = :nombreMedicamento"),
    @NamedQuery(name = "Medicamentos.findByDosificacion", query = "SELECT m FROM Medicamentos m WHERE m.dosificacion = :dosificacion"),
    @NamedQuery(name = "Medicamentos.findByDescripcion", query = "SELECT m FROM Medicamentos m WHERE m.descripcion = :descripcion"),
    @NamedQuery(name = "Medicamentos.findByLaboratorio", query = "SELECT m FROM Medicamentos m WHERE m.laboratorio = :laboratorio"),
    @NamedQuery(name = "Medicamentos.findByConcentracionMedicamento", query = "SELECT m FROM Medicamentos m WHERE m.concentracionMedicamento = :concentracionMedicamento"),
    @NamedQuery(name = "Medicamentos.findByRutaAdministracion", query = "SELECT m FROM Medicamentos m WHERE m.rutaAdministracion = :rutaAdministracion"),
    @NamedQuery(name = "Medicamentos.findByEstadoMedicamento", query = "SELECT m FROM Medicamentos m WHERE m.estadoMedicamento = :estadoMedicamento"),
    @NamedQuery(name = "Medicamentos.findByFechaVencimiento", query = "SELECT m FROM Medicamentos m WHERE m.fechaVencimiento = :fechaVencimiento"),
    @NamedQuery(name = "Medicamentos.findByCategoria", query = "SELECT m FROM Medicamentos m WHERE m.categoria = :categoria"),
    @NamedQuery(name = "Medicamentos.findByFechaFabricacion", query = "SELECT m FROM Medicamentos m WHERE m.fechaFabricacion = :fechaFabricacion"),
    @NamedQuery(name = "Medicamentos.findByNumeroLote", query = "SELECT m FROM Medicamentos m WHERE m.numeroLote = :numeroLote")})
public class Medicamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "MEDICO_TRATANTE")
    private String medicoTratante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "NOMBRE_MEDICAMENTO")
    private String nombreMedicamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DOSIFICACION")
    private String dosificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LABORATORIO")
    private String laboratorio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CONCENTRACION_MEDICAMENTO")
    private String concentracionMedicamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "RUTA_ADMINISTRACION")
    private String rutaAdministracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 46)
    @Column(name = "ESTADO_MEDICAMENTO")
    private String estadoMedicamento;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Size(max = 0)
    @Column(name = "CATEGORIA")
    private String categoria;
    @Column(name = "FECHA_FABRICACION")
    @Temporal(TemporalType.DATE)
    private Date fechaFabricacion;
    @Size(max = 45)
    @Column(name = "NUMERO_LOTE")
    private String numeroLote;
    @Lob
    @Column(name = "FOTO_MEDICAMENTO")
    private byte[] fotoMedicamento;

    public Medicamentos() {
    }

    public Medicamentos(Integer id) {
        this.id = id;
    }

    public Medicamentos(Integer id, String medicoTratante, String nombreMedicamento, String dosificacion, String descripcion, String laboratorio, String concentracionMedicamento, String rutaAdministracion, String estadoMedicamento) {
        this.id = id;
        this.medicoTratante = medicoTratante;
        this.nombreMedicamento = nombreMedicamento;
        this.dosificacion = dosificacion;
        this.descripcion = descripcion;
        this.laboratorio = laboratorio;
        this.concentracionMedicamento = concentracionMedicamento;
        this.rutaAdministracion = rutaAdministracion;
        this.estadoMedicamento = estadoMedicamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(String medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getDosificacion() {
        return dosificacion;
    }

    public void setDosificacion(String dosificacion) {
        this.dosificacion = dosificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getConcentracionMedicamento() {
        return concentracionMedicamento;
    }

    public void setConcentracionMedicamento(String concentracionMedicamento) {
        this.concentracionMedicamento = concentracionMedicamento;
    }

    public String getRutaAdministracion() {
        return rutaAdministracion;
    }

    public void setRutaAdministracion(String rutaAdministracion) {
        this.rutaAdministracion = rutaAdministracion;
    }

    public String getEstadoMedicamento() {
        return estadoMedicamento;
    }

    public void setEstadoMedicamento(String estadoMedicamento) {
        this.estadoMedicamento = estadoMedicamento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public byte[] getFotoMedicamento() {
        return fotoMedicamento;
    }

    public void setFotoMedicamento(byte[] fotoMedicamento) {
        this.fotoMedicamento = fotoMedicamento;
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
        if (!(object instanceof Medicamentos)) {
            return false;
        }
        Medicamentos other = (Medicamentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.web.proyectof.entidades.Medicamentos[ id=" + id + " ]";
    }
    
}
