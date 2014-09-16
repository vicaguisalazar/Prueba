/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Victor
 */
@Entity
@Table(name = "tareaspendiente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tareaspendiente.findAll", query = "SELECT t FROM Tareaspendiente t")})
public class Tareaspendiente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTareasPendiente")
    private Integer idTareasPendiente;
    @Basic(optional = false)
    @Column(name = "nNombreTarea")
    private String nNombreTarea;
    @Basic(optional = false)
    @Column(name = "FechaEntrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private String nEstado;
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Curso idCurso;

    public Tareaspendiente() {
    }

    public Tareaspendiente(Integer idTareasPendiente) {
        this.idTareasPendiente = idTareasPendiente;
    }

    public Tareaspendiente(Integer idTareasPendiente, String nNombreTarea, Date fechaEntrega, String nEstado) {
        this.idTareasPendiente = idTareasPendiente;
        this.nNombreTarea = nNombreTarea;
        this.fechaEntrega = fechaEntrega;
        this.nEstado = nEstado;
    }

    public Integer getIdTareasPendiente() {
        return idTareasPendiente;
    }

    public void setIdTareasPendiente(Integer idTareasPendiente) {
        this.idTareasPendiente = idTareasPendiente;
    }

    public String getNNombreTarea() {
        return nNombreTarea;
    }

    public void setNNombreTarea(String nNombreTarea) {
        this.nNombreTarea = nNombreTarea;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getNEstado() {
        return nEstado;
    }

    public void setNEstado(String nEstado) {
        this.nEstado = nEstado;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTareasPendiente != null ? idTareasPendiente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tareaspendiente)) {
            return false;
        }
        Tareaspendiente other = (Tareaspendiente) object;
        if ((this.idTareasPendiente == null && other.idTareasPendiente != null) || (this.idTareasPendiente != null && !this.idTareasPendiente.equals(other.idTareasPendiente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Tareaspendiente[ idTareasPendiente=" + idTareasPendiente + " ]";
    }
    
}
