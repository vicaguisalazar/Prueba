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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "preguntas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Preguntas.findAll", query = "SELECT p FROM Preguntas p")})
public class Preguntas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPreguntas")
    private Integer idPreguntas;
    @Basic(optional = false)
    @Column(name = "nCantidadOpcion")
    private int nCantidadOpcion;
    @Basic(optional = false)
    @Column(name = "Puntaje")
    private int puntaje;
    @Basic(optional = false)
    @Column(name = "nPregunta")
    private String nPregunta;
    @JoinColumn(name = "idExamenEnLinea", referencedColumnName = "idExamenEnLinea")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Examenenlinea idExamenEnLinea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPreguntas", fetch = FetchType.LAZY)
    private List<Opcion> opcionList;

    public Preguntas() {
    }

    public Preguntas(Integer idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public Preguntas(Integer idPreguntas, int nCantidadOpcion, int puntaje, String nPregunta) {
        this.idPreguntas = idPreguntas;
        this.nCantidadOpcion = nCantidadOpcion;
        this.puntaje = puntaje;
        this.nPregunta = nPregunta;
    }

    public Integer getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(Integer idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public int getNCantidadOpcion() {
        return nCantidadOpcion;
    }

    public void setNCantidadOpcion(int nCantidadOpcion) {
        this.nCantidadOpcion = nCantidadOpcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getNPregunta() {
        return nPregunta;
    }

    public void setNPregunta(String nPregunta) {
        this.nPregunta = nPregunta;
    }

    public Examenenlinea getIdExamenEnLinea() {
        return idExamenEnLinea;
    }

    public void setIdExamenEnLinea(Examenenlinea idExamenEnLinea) {
        this.idExamenEnLinea = idExamenEnLinea;
    }

    @XmlTransient
    public List<Opcion> getOpcionList() {
        return opcionList;
    }

    public void setOpcionList(List<Opcion> opcionList) {
        this.opcionList = opcionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPreguntas != null ? idPreguntas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Preguntas)) {
            return false;
        }
        Preguntas other = (Preguntas) object;
        if ((this.idPreguntas == null && other.idPreguntas != null) || (this.idPreguntas != null && !this.idPreguntas.equals(other.idPreguntas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Preguntas[ idPreguntas=" + idPreguntas + " ]";
    }
    
}
