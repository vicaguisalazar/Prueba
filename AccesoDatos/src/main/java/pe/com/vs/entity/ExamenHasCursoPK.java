/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Victor
 */
@Embeddable
public class ExamenHasCursoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idExamen")
    private int idExamen;
    @Basic(optional = false)
    @Column(name = "idCurso")
    private int idCurso;

    public ExamenHasCursoPK() {
    }

    public ExamenHasCursoPK(int idExamen, int idCurso) {
        this.idExamen = idExamen;
        this.idCurso = idCurso;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idExamen;
        hash += (int) idCurso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenHasCursoPK)) {
            return false;
        }
        ExamenHasCursoPK other = (ExamenHasCursoPK) object;
        if (this.idExamen != other.idExamen) {
            return false;
        }
        if (this.idCurso != other.idCurso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.ExamenHasCursoPK[ idExamen=" + idExamen + ", idCurso=" + idCurso + " ]";
    }
    
}
