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
@Table(name = "curricula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curricula.findAll", query = "SELECT c FROM Curricula c")})
public class Curricula implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nPeriodo")
    private String nPeriodo;
    @Basic(optional = false)
    @Column(name = "nTema")
    private String nTema;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @Id
    @Basic(optional = false)
    @Column(name = "idCurricula")
    private Integer idCurricula;
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Curso idCurso;

    public Curricula() {
    }

    public Curricula(Integer idCurricula) {
        this.idCurricula = idCurricula;
    }

    public Curricula(Integer idCurricula, String nPeriodo, String nTema, boolean nEstado) {
        this.idCurricula = idCurricula;
        this.nPeriodo = nPeriodo;
        this.nTema = nTema;
        this.nEstado = nEstado;
    }

    public String getNPeriodo() {
        return nPeriodo;
    }

    public void setNPeriodo(String nPeriodo) {
        this.nPeriodo = nPeriodo;
    }

    public String getNTema() {
        return nTema;
    }

    public void setNTema(String nTema) {
        this.nTema = nTema;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    public Integer getIdCurricula() {
        return idCurricula;
    }

    public void setIdCurricula(Integer idCurricula) {
        this.idCurricula = idCurricula;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCurricula != null ? idCurricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curricula)) {
            return false;
        }
        Curricula other = (Curricula) object;
        if ((this.idCurricula == null && other.idCurricula != null) || (this.idCurricula != null && !this.idCurricula.equals(other.idCurricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Curricula[ idCurricula=" + idCurricula + " ]";
    }
    
}
