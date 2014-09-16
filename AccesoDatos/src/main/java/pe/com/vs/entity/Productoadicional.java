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
@Table(name = "productoadicional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productoadicional.findAll", query = "SELECT p FROM Productoadicional p")})
public class Productoadicional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProductoAdicional")
    private Integer idProductoAdicional;
    @Basic(optional = false)
    @Column(name = "nDescripcion")
    private String nDescripcion;
    @Basic(optional = false)
    @Column(name = "nPrecio")
    private String nPrecio;
    @Column(name = "nEstado")
    private Boolean nEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProductoAdicional", fetch = FetchType.LAZY)
    private List<Detallemensualidad> detallemensualidadList;

    public Productoadicional() {
    }

    public Productoadicional(Integer idProductoAdicional) {
        this.idProductoAdicional = idProductoAdicional;
    }

    public Productoadicional(Integer idProductoAdicional, String nDescripcion, String nPrecio) {
        this.idProductoAdicional = idProductoAdicional;
        this.nDescripcion = nDescripcion;
        this.nPrecio = nPrecio;
    }

    public Integer getIdProductoAdicional() {
        return idProductoAdicional;
    }

    public void setIdProductoAdicional(Integer idProductoAdicional) {
        this.idProductoAdicional = idProductoAdicional;
    }

    public String getNDescripcion() {
        return nDescripcion;
    }

    public void setNDescripcion(String nDescripcion) {
        this.nDescripcion = nDescripcion;
    }

    public String getNPrecio() {
        return nPrecio;
    }

    public void setNPrecio(String nPrecio) {
        this.nPrecio = nPrecio;
    }

    public Boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(Boolean nEstado) {
        this.nEstado = nEstado;
    }

    @XmlTransient
    public List<Detallemensualidad> getDetallemensualidadList() {
        return detallemensualidadList;
    }

    public void setDetallemensualidadList(List<Detallemensualidad> detallemensualidadList) {
        this.detallemensualidadList = detallemensualidadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductoAdicional != null ? idProductoAdicional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productoadicional)) {
            return false;
        }
        Productoadicional other = (Productoadicional) object;
        if ((this.idProductoAdicional == null && other.idProductoAdicional != null) || (this.idProductoAdicional != null && !this.idProductoAdicional.equals(other.idProductoAdicional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Productoadicional[ idProductoAdicional=" + idProductoAdicional + " ]";
    }
    
}
