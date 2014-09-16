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
public class ProfesorHasCursoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idProfesor")
    private int idProfesor;
    @Basic(optional = false)
    @Column(name = "idCurso")
    private int idCurso;

    public ProfesorHasCursoPK() {
    }

    public ProfesorHasCursoPK(int idProfesor, int idCurso) {
        this.idProfesor = idProfesor;
        this.idCurso = idCurso;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
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
        hash += (int) idProfesor;
        hash += (int) idCurso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfesorHasCursoPK)) {
            return false;
        }
        ProfesorHasCursoPK other = (ProfesorHasCursoPK) object;
        if (this.idProfesor != other.idProfesor) {
            return false;
        }
        if (this.idCurso != other.idCurso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.ProfesorHasCursoPK[ idProfesor=" + idProfesor + ", idCurso=" + idCurso + " ]";
    }
    
}
