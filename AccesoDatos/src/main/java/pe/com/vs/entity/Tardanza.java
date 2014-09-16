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
@Table(name = "tardanza")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tardanza.findAll", query = "SELECT t FROM Tardanza t")})
public class Tardanza implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTardanza")
    private Integer idTardanza;
    @Basic(optional = false)
    @Column(name = "nFecha")
    private String nFecha;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario idUsuario;

    public Tardanza() {
    }

    public Tardanza(Integer idTardanza) {
        this.idTardanza = idTardanza;
    }

    public Tardanza(Integer idTardanza, String nFecha) {
        this.idTardanza = idTardanza;
        this.nFecha = nFecha;
    }

    public Integer getIdTardanza() {
        return idTardanza;
    }

    public void setIdTardanza(Integer idTardanza) {
        this.idTardanza = idTardanza;
    }

    public String getNFecha() {
        return nFecha;
    }

    public void setNFecha(String nFecha) {
        this.nFecha = nFecha;
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
        hash += (idTardanza != null ? idTardanza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tardanza)) {
            return false;
        }
        Tardanza other = (Tardanza) object;
        if ((this.idTardanza == null && other.idTardanza != null) || (this.idTardanza != null && !this.idTardanza.equals(other.idTardanza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Tardanza[ idTardanza=" + idTardanza + " ]";
    }
    
}
