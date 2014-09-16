/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Victor
 */
@Entity
@Table(name = "alumnoretirado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumnoretirado.findAll", query = "SELECT a FROM Alumnoretirado a")})
public class Alumnoretirado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAlumnoRetirado")
    private Integer idAlumnoRetirado;
    @Basic(optional = false)
    @Column(name = "nFechaRetiro")
    private String nFechaRetiro;
    @Basic(optional = false)
    @Column(name = "nMotivo")
    private String nMotivo;
    @Basic(optional = false)
    @Column(name = "nPeriodo")
    private String nPeriodo;
    @JoinColumn(name = "idGrado", referencedColumnName = "idGrado")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Grado idGrado;
    @JoinColumn(name = "idAlumno", referencedColumnName = "idAlumno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alumno idAlumno;

    public Alumnoretirado() {
    }

    public Alumnoretirado(Integer idAlumnoRetirado) {
        this.idAlumnoRetirado = idAlumnoRetirado;
    }

    public Alumnoretirado(Integer idAlumnoRetirado, String nFechaRetiro, String nMotivo, String nPeriodo) {
        this.idAlumnoRetirado = idAlumnoRetirado;
        this.nFechaRetiro = nFechaRetiro;
        this.nMotivo = nMotivo;
        this.nPeriodo = nPeriodo;
    }

    public Integer getIdAlumnoRetirado() {
        return idAlumnoRetirado;
    }

    public void setIdAlumnoRetirado(Integer idAlumnoRetirado) {
        this.idAlumnoRetirado = idAlumnoRetirado;
    }

    public String getNFechaRetiro() {
        return nFechaRetiro;
    }

    public void setNFechaRetiro(String nFechaRetiro) {
        this.nFechaRetiro = nFechaRetiro;
    }

    public String getNMotivo() {
        return nMotivo;
    }

    public void setNMotivo(String nMotivo) {
        this.nMotivo = nMotivo;
    }

    public String getNPeriodo() {
        return nPeriodo;
    }

    public void setNPeriodo(String nPeriodo) {
        this.nPeriodo = nPeriodo;
    }

    public Grado getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(Grado idGrado) {
        this.idGrado = idGrado;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumnoRetirado != null ? idAlumnoRetirado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnoretirado)) {
            return false;
        }
        Alumnoretirado other = (Alumnoretirado) object;
        if ((this.idAlumnoRetirado == null && other.idAlumnoRetirado != null) || (this.idAlumnoRetirado != null && !this.idAlumnoRetirado.equals(other.idAlumnoRetirado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Alumnoretirado[ idAlumnoRetirado=" + idAlumnoRetirado + " ]";
    }
    
}
