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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "grado_has_seccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GradoHasSeccion.findAll", query = "SELECT g FROM GradoHasSeccion g")})
public class GradoHasSeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GradoHasSeccionPK gradoHasSeccionPK;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @JoinColumn(name = "idSeccion", referencedColumnName = "idSeccion", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Seccion seccion;
    @JoinColumn(name = "idGrado", referencedColumnName = "idGrado", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Grado grado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gradoHasSeccion", fetch = FetchType.LAZY)
    private List<Examenenlinea> examenenlineaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gradoHasSeccion", fetch = FetchType.LAZY)
    private List<Matricula> matriculaList;

    public GradoHasSeccion() {
    }

    public GradoHasSeccion(GradoHasSeccionPK gradoHasSeccionPK) {
        this.gradoHasSeccionPK = gradoHasSeccionPK;
    }

    public GradoHasSeccion(GradoHasSeccionPK gradoHasSeccionPK, boolean nEstado) {
        this.gradoHasSeccionPK = gradoHasSeccionPK;
        this.nEstado = nEstado;
    }

    public GradoHasSeccion(int idGrado, int idSeccion) {
        this.gradoHasSeccionPK = new GradoHasSeccionPK(idGrado, idSeccion);
    }

    public GradoHasSeccionPK getGradoHasSeccionPK() {
        return gradoHasSeccionPK;
    }

    public void setGradoHasSeccionPK(GradoHasSeccionPK gradoHasSeccionPK) {
        this.gradoHasSeccionPK = gradoHasSeccionPK;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    @XmlTransient
    public List<Examenenlinea> getExamenenlineaList() {
        return examenenlineaList;
    }

    public void setExamenenlineaList(List<Examenenlinea> examenenlineaList) {
        this.examenenlineaList = examenenlineaList;
    }

    @XmlTransient
    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gradoHasSeccionPK != null ? gradoHasSeccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GradoHasSeccion)) {
            return false;
        }
        GradoHasSeccion other = (GradoHasSeccion) object;
        if ((this.gradoHasSeccionPK == null && other.gradoHasSeccionPK != null) || (this.gradoHasSeccionPK != null && !this.gradoHasSeccionPK.equals(other.gradoHasSeccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.GradoHasSeccion[ gradoHasSeccionPK=" + gradoHasSeccionPK + " ]";
    }
    
}
