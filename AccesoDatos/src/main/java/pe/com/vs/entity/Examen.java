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
@Table(name = "examen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Examen.findAll", query = "SELECT e FROM Examen e")})
public class Examen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idExamen")
    private Integer idExamen;
    @Basic(optional = false)
    @Column(name = "nDescripcion")
    private String nDescripcion;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examen", fetch = FetchType.LAZY)
    private List<ExamenHasCurso> examenHasCursoList;

    public Examen() {
    }

    public Examen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public Examen(Integer idExamen, String nDescripcion, boolean nEstado) {
        this.idExamen = idExamen;
        this.nDescripcion = nDescripcion;
        this.nEstado = nEstado;
    }

    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public String getNDescripcion() {
        return nDescripcion;
    }

    public void setNDescripcion(String nDescripcion) {
        this.nDescripcion = nDescripcion;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    @XmlTransient
    public List<ExamenHasCurso> getExamenHasCursoList() {
        return examenHasCursoList;
    }

    public void setExamenHasCursoList(List<ExamenHasCurso> examenHasCursoList) {
        this.examenHasCursoList = examenHasCursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExamen != null ? idExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Examen)) {
            return false;
        }
        Examen other = (Examen) object;
        if ((this.idExamen == null && other.idExamen != null) || (this.idExamen != null && !this.idExamen.equals(other.idExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Examen[ idExamen=" + idExamen + " ]";
    }
    
}
