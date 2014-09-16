/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Victor
 */
@Entity
@Table(name = "apoderado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apoderado.findAll", query = "SELECT a FROM Apoderado a")})
public class Apoderado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idApoderado")
    private Integer idApoderado;
    @Basic(optional = false)
    @Column(name = "nParentesco")
    private String nParentesco;
    @Basic(optional = false)
    @Column(name = "nEducacion")
    private String nEducacion;
    @ManyToMany(mappedBy = "apoderadoList", fetch = FetchType.LAZY)
    private List<Alumno> alumnoList;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario idUsuario;

    public Apoderado() {
    }

    public Apoderado(Integer idApoderado) {
        this.idApoderado = idApoderado;
    }

    public Apoderado(Integer idApoderado, String nParentesco, String nEducacion) {
        this.idApoderado = idApoderado;
        this.nParentesco = nParentesco;
        this.nEducacion = nEducacion;
    }

    public Integer getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(Integer idApoderado) {
        this.idApoderado = idApoderado;
    }

    public String getNParentesco() {
        return nParentesco;
    }

    public void setNParentesco(String nParentesco) {
        this.nParentesco = nParentesco;
    }

    public String getNEducacion() {
        return nEducacion;
    }

    public void setNEducacion(String nEducacion) {
        this.nEducacion = nEducacion;
    }

    @XmlTransient
    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idApoderado != null ? idApoderado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apoderado)) {
            return false;
        }
        Apoderado other = (Apoderado) object;
        if ((this.idApoderado == null && other.idApoderado != null) || (this.idApoderado != null && !this.idApoderado.equals(other.idApoderado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Apoderado[ idApoderado=" + idApoderado + " ]";
    }
    
}
