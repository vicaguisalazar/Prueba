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
@Table(name = "opcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Opcion.findAll", query = "SELECT o FROM Opcion o")})
public class Opcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOpcion")
    private Integer idOpcion;
    @Basic(optional = false)
    @Column(name = "nNombreOpcion")
    private String nNombreOpcion;
    @JoinColumn(name = "idPreguntas", referencedColumnName = "idPreguntas")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Preguntas idPreguntas;

    public Opcion() {
    }

    public Opcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public Opcion(Integer idOpcion, String nNombreOpcion) {
        this.idOpcion = idOpcion;
        this.nNombreOpcion = nNombreOpcion;
    }

    public Integer getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    public String getNNombreOpcion() {
        return nNombreOpcion;
    }

    public void setNNombreOpcion(String nNombreOpcion) {
        this.nNombreOpcion = nNombreOpcion;
    }

    public Preguntas getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(Preguntas idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOpcion != null ? idOpcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opcion)) {
            return false;
        }
        Opcion other = (Opcion) object;
        if ((this.idOpcion == null && other.idOpcion != null) || (this.idOpcion != null && !this.idOpcion.equals(other.idOpcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Opcion[ idOpcion=" + idOpcion + " ]";
    }
    
}
