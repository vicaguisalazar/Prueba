/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "mensualidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mensualidad.findAll", query = "SELECT m FROM Mensualidad m")})
public class Mensualidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMensualidad")
    private Integer idMensualidad;
    @Basic(optional = false)
    @Column(name = "nFecha")
    private String nFecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "nTotal")
    private BigDecimal nTotal;
    @Basic(optional = false)
    @Column(name = "nFechaVencimiento")
    private String nFechaVencimiento;
    @Basic(optional = false)
    @Column(name = "nFechaEmision")
    private String nFechaEmision;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMensualidad", fetch = FetchType.LAZY)
    private List<Detallemensualidad> detallemensualidadList;
    @JoinColumn(name = "idModalidad", referencedColumnName = "idModalidad")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Modalidad idModalidad;
    @JoinColumn(name = "idAlumno", referencedColumnName = "idAlumno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alumno idAlumno;

    public Mensualidad() {
    }

    public Mensualidad(Integer idMensualidad) {
        this.idMensualidad = idMensualidad;
    }

    public Mensualidad(Integer idMensualidad, String nFecha, BigDecimal nTotal, String nFechaVencimiento, String nFechaEmision) {
        this.idMensualidad = idMensualidad;
        this.nFecha = nFecha;
        this.nTotal = nTotal;
        this.nFechaVencimiento = nFechaVencimiento;
        this.nFechaEmision = nFechaEmision;
    }

    public Integer getIdMensualidad() {
        return idMensualidad;
    }

    public void setIdMensualidad(Integer idMensualidad) {
        this.idMensualidad = idMensualidad;
    }

    public String getNFecha() {
        return nFecha;
    }

    public void setNFecha(String nFecha) {
        this.nFecha = nFecha;
    }

    public BigDecimal getNTotal() {
        return nTotal;
    }

    public void setNTotal(BigDecimal nTotal) {
        this.nTotal = nTotal;
    }

    public String getNFechaVencimiento() {
        return nFechaVencimiento;
    }

    public void setNFechaVencimiento(String nFechaVencimiento) {
        this.nFechaVencimiento = nFechaVencimiento;
    }

    public String getNFechaEmision() {
        return nFechaEmision;
    }

    public void setNFechaEmision(String nFechaEmision) {
        this.nFechaEmision = nFechaEmision;
    }

    @XmlTransient
    public List<Detallemensualidad> getDetallemensualidadList() {
        return detallemensualidadList;
    }

    public void setDetallemensualidadList(List<Detallemensualidad> detallemensualidadList) {
        this.detallemensualidadList = detallemensualidadList;
    }

    public Modalidad getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(Modalidad idModalidad) {
        this.idModalidad = idModalidad;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMensualidad != null ? idMensualidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mensualidad)) {
            return false;
        }
        Mensualidad other = (Mensualidad) object;
        if ((this.idMensualidad == null && other.idMensualidad != null) || (this.idMensualidad != null && !this.idMensualidad.equals(other.idMensualidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Mensualidad[ idMensualidad=" + idMensualidad + " ]";
    }
    
}
