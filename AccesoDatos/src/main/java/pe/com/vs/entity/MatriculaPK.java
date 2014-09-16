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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Victor
 */
@Embeddable
public class MatriculaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idMatricula")
    private int idMatricula;
    @Basic(optional = false)
    @Column(name = "idAlumno")
    private int idAlumno;
    @Basic(optional = false)
    @Column(name = "nA\u00f1o")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nAño;

    public MatriculaPK() {
    }

    public MatriculaPK(int idMatricula, int idAlumno, Date nAño) {
        this.idMatricula = idMatricula;
        this.idAlumno = idAlumno;
        this.nAño = nAño;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Date getNAño() {
        return nAño;
    }

    public void setNAño(Date nAño) {
        this.nAño = nAño;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idMatricula;
        hash += (int) idAlumno;
        hash += (nAño != null ? nAño.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MatriculaPK)) {
            return false;
        }
        MatriculaPK other = (MatriculaPK) object;
        if (this.idMatricula != other.idMatricula) {
            return false;
        }
        if (this.idAlumno != other.idAlumno) {
            return false;
        }
        if ((this.nAño == null && other.nAño != null) || (this.nAño != null && !this.nAño.equals(other.nAño))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.MatriculaPK[ idMatricula=" + idMatricula + ", idAlumno=" + idAlumno + ", nA\u00f1o=" + nAño + " ]";
    }
    
}
