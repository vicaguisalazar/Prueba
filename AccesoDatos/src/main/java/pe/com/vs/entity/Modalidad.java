/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Victor
 */
@Entity
@Table(name = "modalidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modalidad.findAll", query = "SELECT m FROM Modalidad m")})
public class Modalidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idModalidad")
    private Integer idModalidad;
    @Basic(optional = false)
    @Column(name = "nModalidad")
    private String nModalidad;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModalidad", fetch = FetchType.LAZY)
    private List<Mensualidad> mensualidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idModalidad", fetch = FetchType.LAZY)
    private List<Matricula> matriculaList;

    public Modalidad() {
    }

    public Modalidad(Integer idModalidad) {
        this.idModalidad = idModalidad;
    }

    public Modalidad(Integer idModalidad, String nModalidad, boolean nEstado) {
        this.idModalidad = idModalidad;
        this.nModalidad = nModalidad;
        this.nEstado = nEstado;
    }

    public Integer getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(Integer idModalidad) {
        this.idModalidad = idModalidad;
    }

    public String getNModalidad() {
        return nModalidad;
    }

    public void setNModalidad(String nModalidad) {
        this.nModalidad = nModalidad;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    @XmlTransient
    public List<Mensualidad> getMensualidadList() {
        return mensualidadList;
    }

    public void setMensualidadList(List<Mensualidad> mensualidadList) {
        this.mensualidadList = mensualidadList;
    }

    @XmlTransient
    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idModalidad != null ? idModalidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modalidad)) {
            return false;
        }
        Modalidad other = (Modalidad) object;
        if ((this.idModalidad == null && other.idModalidad != null) || (this.idModalidad != null && !this.idModalidad.equals(other.idModalidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Modalidad[ idModalidad=" + idModalidad + " ]";
    }
    
}
