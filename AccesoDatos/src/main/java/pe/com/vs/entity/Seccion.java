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
@Table(name = "seccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seccion.findAll", query = "SELECT s FROM Seccion s")})
public class Seccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSeccion")
    private Integer idSeccion;
    @Basic(optional = false)
    @Column(name = "nSeccion")
    private String nSeccion;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "seccion", fetch = FetchType.LAZY)
    private List<GradoHasSeccion> gradoHasSeccionList;

    public Seccion() {
    }

    public Seccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
    }

    public Seccion(Integer idSeccion, String nSeccion, boolean nEstado) {
        this.idSeccion = idSeccion;
        this.nSeccion = nSeccion;
        this.nEstado = nEstado;
    }

    public Integer getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getNSeccion() {
        return nSeccion;
    }

    public void setNSeccion(String nSeccion) {
        this.nSeccion = nSeccion;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    @XmlTransient
    public List<GradoHasSeccion> getGradoHasSeccionList() {
        return gradoHasSeccionList;
    }

    public void setGradoHasSeccionList(List<GradoHasSeccion> gradoHasSeccionList) {
        this.gradoHasSeccionList = gradoHasSeccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeccion != null ? idSeccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seccion)) {
            return false;
        }
        Seccion other = (Seccion) object;
        if ((this.idSeccion == null && other.idSeccion != null) || (this.idSeccion != null && !this.idSeccion.equals(other.idSeccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Seccion[ idSeccion=" + idSeccion + " ]";
    }
    
}
