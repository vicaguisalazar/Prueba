/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Victor
 */
@Entity
@Table(name = "eventos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventos.findAll", query = "SELECT e FROM Eventos e")})
public class Eventos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEventos")
    private Integer idEventos;
    @Basic(optional = false)
    @Column(name = "nNombreEvento")
    private String nNombreEvento;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @Basic(optional = false)
    @Column(name = "nFecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nFecha;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario idUsuario;

    public Eventos() {
    }

    public Eventos(Integer idEventos) {
        this.idEventos = idEventos;
    }

    public Eventos(Integer idEventos, String nNombreEvento, boolean nEstado, Date nFecha) {
        this.idEventos = idEventos;
        this.nNombreEvento = nNombreEvento;
        this.nEstado = nEstado;
        this.nFecha = nFecha;
    }

    public Integer getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(Integer idEventos) {
        this.idEventos = idEventos;
    }

    public String getNNombreEvento() {
        return nNombreEvento;
    }

    public void setNNombreEvento(String nNombreEvento) {
        this.nNombreEvento = nNombreEvento;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    public Date getNFecha() {
        return nFecha;
    }

    public void setNFecha(Date nFecha) {
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
        hash += (idEventos != null ? idEventos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventos)) {
            return false;
        }
        Eventos other = (Eventos) object;
        if ((this.idEventos == null && other.idEventos != null) || (this.idEventos != null && !this.idEventos.equals(other.idEventos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Eventos[ idEventos=" + idEventos + " ]";
    }
    
}
