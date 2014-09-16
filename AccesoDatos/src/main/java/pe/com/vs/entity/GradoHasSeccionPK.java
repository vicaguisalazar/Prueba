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
public class GradoHasSeccionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idGrado")
    private int idGrado;
    @Basic(optional = false)
    @Column(name = "idSeccion")
    private int idSeccion;

    public GradoHasSeccionPK() {
    }

    public GradoHasSeccionPK(int idGrado, int idSeccion) {
        this.idGrado = idGrado;
        this.idSeccion = idSeccion;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public int getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(int idSeccion) {
        this.idSeccion = idSeccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idGrado;
        hash += (int) idSeccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GradoHasSeccionPK)) {
            return false;
        }
        GradoHasSeccionPK other = (GradoHasSeccionPK) object;
        if (this.idGrado != other.idGrado) {
            return false;
        }
        if (this.idSeccion != other.idSeccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.GradoHasSeccionPK[ idGrado=" + idGrado + ", idSeccion=" + idSeccion + " ]";
    }
    
}
