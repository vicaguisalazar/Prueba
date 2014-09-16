/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "profesor_has_curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfesorHasCurso.findAll", query = "SELECT p FROM ProfesorHasCurso p")})
public class ProfesorHasCurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfesorHasCursoPK profesorHasCursoPK;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @JoinColumn(name = "idProfesor", referencedColumnName = "idProfesor", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Profesor profesor;
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Curso curso;

    public ProfesorHasCurso() {
    }

    public ProfesorHasCurso(ProfesorHasCursoPK profesorHasCursoPK) {
        this.profesorHasCursoPK = profesorHasCursoPK;
    }

    public ProfesorHasCurso(ProfesorHasCursoPK profesorHasCursoPK, boolean nEstado) {
        this.profesorHasCursoPK = profesorHasCursoPK;
        this.nEstado = nEstado;
    }

    public ProfesorHasCurso(int idProfesor, int idCurso) {
        this.profesorHasCursoPK = new ProfesorHasCursoPK(idProfesor, idCurso);
    }

    public ProfesorHasCursoPK getProfesorHasCursoPK() {
        return profesorHasCursoPK;
    }

    public void setProfesorHasCursoPK(ProfesorHasCursoPK profesorHasCursoPK) {
        this.profesorHasCursoPK = profesorHasCursoPK;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
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
        hash += (profesorHasCursoPK != null ? profesorHasCursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfesorHasCurso)) {
            return false;
        }
        ProfesorHasCurso other = (ProfesorHasCurso) object;
        if ((this.profesorHasCursoPK == null && other.profesorHasCursoPK != null) || (this.profesorHasCursoPK != null && !this.profesorHasCursoPK.equals(other.profesorHasCursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.ProfesorHasCurso[ profesorHasCursoPK=" + profesorHasCursoPK + " ]";
    }
    
}
