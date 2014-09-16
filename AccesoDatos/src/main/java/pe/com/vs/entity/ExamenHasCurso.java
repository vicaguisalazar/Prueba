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
@Table(name = "examen_has_curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExamenHasCurso.findAll", query = "SELECT e FROM ExamenHasCurso e")})
public class ExamenHasCurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExamenHasCursoPK examenHasCursoPK;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examenHasCurso", fetch = FetchType.LAZY)
    private List<Nota> notaList;
    @JoinColumn(name = "idExamen", referencedColumnName = "idExamen", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Examen examen;
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Curso curso;

    public ExamenHasCurso() {
    }

    public ExamenHasCurso(ExamenHasCursoPK examenHasCursoPK) {
        this.examenHasCursoPK = examenHasCursoPK;
    }

    public ExamenHasCurso(ExamenHasCursoPK examenHasCursoPK, boolean nEstado) {
        this.examenHasCursoPK = examenHasCursoPK;
        this.nEstado = nEstado;
    }

    public ExamenHasCurso(int idExamen, int idCurso) {
        this.examenHasCursoPK = new ExamenHasCursoPK(idExamen, idCurso);
    }

    public ExamenHasCursoPK getExamenHasCursoPK() {
        return examenHasCursoPK;
    }

    public void setExamenHasCursoPK(ExamenHasCursoPK examenHasCursoPK) {
        this.examenHasCursoPK = examenHasCursoPK;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    @XmlTransient
    public List<Nota> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Nota> notaList) {
        this.notaList = notaList;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (examenHasCursoPK != null ? examenHasCursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenHasCurso)) {
            return false;
        }
        ExamenHasCurso other = (ExamenHasCurso) object;
        if ((this.examenHasCursoPK == null && other.examenHasCursoPK != null) || (this.examenHasCursoPK != null && !this.examenHasCursoPK.equals(other.examenHasCursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.ExamenHasCurso[ examenHasCursoPK=" + examenHasCursoPK + " ]";
    }
    
}
