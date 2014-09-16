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
@Table(name = "detallemensualidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallemensualidad.findAll", query = "SELECT d FROM Detallemensualidad d")})
public class Detallemensualidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleMensualidad")
    private Integer idDetalleMensualidad;
    @Basic(optional = false)
    @Column(name = "idDescuento")
    private int idDescuento;
    @JoinColumn(name = "idProductoAdicional", referencedColumnName = "idProductoAdicional")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Productoadicional idProductoAdicional;
    @JoinColumn(name = "idMensualidad", referencedColumnName = "idMensualidad")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Mensualidad idMensualidad;

    public Detallemensualidad() {
    }

    public Detallemensualidad(Integer idDetalleMensualidad) {
        this.idDetalleMensualidad = idDetalleMensualidad;
    }

    public Detallemensualidad(Integer idDetalleMensualidad, int idDescuento) {
        this.idDetalleMensualidad = idDetalleMensualidad;
        this.idDescuento = idDescuento;
    }

    public Integer getIdDetalleMensualidad() {
        return idDetalleMensualidad;
    }

    public void setIdDetalleMensualidad(Integer idDetalleMensualidad) {
        this.idDetalleMensualidad = idDetalleMensualidad;
    }

    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public Productoadicional getIdProductoAdicional() {
        return idProductoAdicional;
    }

    public void setIdProductoAdicional(Productoadicional idProductoAdicional) {
        this.idProductoAdicional = idProductoAdicional;
    }

    public Mensualidad getIdMensualidad() {
        return idMensualidad;
    }

    public void setIdMensualidad(Mensualidad idMensualidad) {
        this.idMensualidad = idMensualidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleMensualidad != null ? idDetalleMensualidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallemensualidad)) {
            return false;
        }
        Detallemensualidad other = (Detallemensualidad) object;
        if ((this.idDetalleMensualidad == null && other.idDetalleMensualidad != null) || (this.idDetalleMensualidad != null && !this.idDetalleMensualidad.equals(other.idDetalleMensualidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Detallemensualidad[ idDetalleMensualidad=" + idDetalleMensualidad + " ]";
    }
    
}
