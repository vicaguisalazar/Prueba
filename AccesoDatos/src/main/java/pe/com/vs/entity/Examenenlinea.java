/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Victor
 */
@Entity
@Table(name = "examenenlinea")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Examenenlinea.findAll", query = "SELECT e FROM Examenenlinea e")})
public class Examenenlinea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idExamenEnLinea")
    private Integer idExamenEnLinea;
    @Column(name = "nFechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nFechaInicio;
    @Column(name = "nFechaFinal")
    private String nFechaFinal;
    @Column(name = "nTiempoMaximo")
    private String nTiempoMaximo;
    @Basic(optional = false)
    @Column(name = "nEstadoPublicado")
    private boolean nEstadoPublicado;
    @Column(name = "nTotalPuntaje")
    private Integer nTotalPuntaje;
    @Basic(optional = false)
    @Column(name = "nNombre")
    private String nNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idExamenEnLinea", fetch = FetchType.LAZY)
    private List<Preguntas> preguntasList;
    @JoinColumn(name = "idNota", referencedColumnName = "idNota")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Nota idNota;
    @JoinColumns({
        @JoinColumn(name = "idGrado", referencedColumnName = "idGrado"),
        @JoinColumn(name = "idSeccion", referencedColumnName = "idSeccion")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GradoHasSeccion gradoHasSeccion;

    public Examenenlinea() {
    }

    public Examenenlinea(Integer idExamenEnLinea) {
        this.idExamenEnLinea = idExamenEnLinea;
    }

    public Examenenlinea(Integer idExamenEnLinea, boolean nEstadoPublicado, String nNombre) {
        this.idExamenEnLinea = idExamenEnLinea;
        this.nEstadoPublicado = nEstadoPublicado;
        this.nNombre = nNombre;
    }

    public Integer getIdExamenEnLinea() {
        return idExamenEnLinea;
    }

    public void setIdExamenEnLinea(Integer idExamenEnLinea) {
        this.idExamenEnLinea = idExamenEnLinea;
    }

    public Date getNFechaInicio() {
        return nFechaInicio;
    }

    public void setNFechaInicio(Date nFechaInicio) {
        this.nFechaInicio = nFechaInicio;
    }

    public String getNFechaFinal() {
        return nFechaFinal;
    }

    public void setNFechaFinal(String nFechaFinal) {
        this.nFechaFinal = nFechaFinal;
    }

    public String getNTiempoMaximo() {
        return nTiempoMaximo;
    }

    public void setNTiempoMaximo(String nTiempoMaximo) {
        this.nTiempoMaximo = nTiempoMaximo;
    }

    public boolean getNEstadoPublicado() {
        return nEstadoPublicado;
    }

    public void setNEstadoPublicado(boolean nEstadoPublicado) {
        this.nEstadoPublicado = nEstadoPublicado;
    }

    public Integer getNTotalPuntaje() {
        return nTotalPuntaje;
    }

    public void setNTotalPuntaje(Integer nTotalPuntaje) {
        this.nTotalPuntaje = nTotalPuntaje;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

    @XmlTransient
    public List<Preguntas> getPreguntasList() {
        return preguntasList;
    }

    public void setPreguntasList(List<Preguntas> preguntasList) {
        this.preguntasList = preguntasList;
    }

    public Nota getIdNota() {
        return idNota;
    }

    public void setIdNota(Nota idNota) {
        this.idNota = idNota;
    }

    public GradoHasSeccion getGradoHasSeccion() {
        return gradoHasSeccion;
    }

    public void setGradoHasSeccion(GradoHasSeccion gradoHasSeccion) {
        this.gradoHasSeccion = gradoHasSeccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExamenEnLinea != null ? idExamenEnLinea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Examenenlinea)) {
            return false;
        }
        Examenenlinea other = (Examenenlinea) object;
        if ((this.idExamenEnLinea == null && other.idExamenEnLinea != null) || (this.idExamenEnLinea != null && !this.idExamenEnLinea.equals(other.idExamenEnLinea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Examenenlinea[ idExamenEnLinea=" + idExamenEnLinea + " ]";
    }
    
}
