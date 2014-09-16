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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "matricula")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matricula.findAll", query = "SELECT m FROM Matricula m")})
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MatriculaPK matriculaPK;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @JoinColumn(name = "idModalidad", referencedColumnName = "idModalidad")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Modalidad idModalidad;
    @JoinColumns({
        @JoinColumn(name = "idGrado", referencedColumnName = "idGrado"),
        @JoinColumn(name = "idSeccion", referencedColumnName = "idSeccion")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GradoHasSeccion gradoHasSeccion;
    @JoinColumn(name = "idAlumno", referencedColumnName = "idAlumno", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alumno alumno;

    public Matricula() {
    }

    public Matricula(MatriculaPK matriculaPK) {
        this.matriculaPK = matriculaPK;
    }

    public Matricula(MatriculaPK matriculaPK, boolean nEstado) {
        this.matriculaPK = matriculaPK;
        this.nEstado = nEstado;
    }

    public Matricula(int idMatricula, int idAlumno, Date nAño) {
        this.matriculaPK = new MatriculaPK(idMatricula, idAlumno, nAño);
    }

    public MatriculaPK getMatriculaPK() {
        return matriculaPK;
    }

    public void setMatriculaPK(MatriculaPK matriculaPK) {
        this.matriculaPK = matriculaPK;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    public Modalidad getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(Modalidad idModalidad) {
        this.idModalidad = idModalidad;
    }

    public GradoHasSeccion getGradoHasSeccion() {
        return gradoHasSeccion;
    }

    public void setGradoHasSeccion(GradoHasSeccion gradoHasSeccion) {
        this.gradoHasSeccion = gradoHasSeccion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matriculaPK != null ? matriculaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matricula)) {
            return false;
        }
        Matricula other = (Matricula) object;
        if ((this.matriculaPK == null && other.matriculaPK != null) || (this.matriculaPK != null && !this.matriculaPK.equals(other.matriculaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Matricula[ matriculaPK=" + matriculaPK + " ]";
    }
    
}
