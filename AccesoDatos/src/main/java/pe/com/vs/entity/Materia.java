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
@Table(name = "materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materia.findAll", query = "SELECT m FROM Materia m")})
public class Materia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMateria")
    private Integer idMateria;
    @Basic(optional = false)
    @Column(name = "nNombre")
    private String nNombre;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria", fetch = FetchType.LAZY)
    private List<Curso> cursoList;

    public Materia() {
    }

    public Materia(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Materia(Integer idMateria, String nNombre, boolean nEstado) {
        this.idMateria = idMateria;
        this.nNombre = nNombre;
        this.nEstado = nEstado;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    @XmlTransient
    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateria != null ? idMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materia)) {
            return false;
        }
        Materia other = (Materia) object;
        if ((this.idMateria == null && other.idMateria != null) || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Materia[ idMateria=" + idMateria + " ]";
    }
    
}
