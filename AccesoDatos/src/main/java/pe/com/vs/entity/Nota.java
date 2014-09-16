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
@Table(name = "nota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nota.findAll", query = "SELECT n FROM Nota n")})
public class Nota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNota")
    private Integer idNota;
    @Column(name = "nNota")
    private Integer nNota;
    @Column(name = "nA\u00f1o")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nAño;
    @Column(name = "nPeriodo")
    private String nPeriodo;
    @JoinColumns({
        @JoinColumn(name = "idExamen", referencedColumnName = "idExamen"),
        @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ExamenHasCurso examenHasCurso;
    @JoinColumn(name = "idAlumno", referencedColumnName = "idAlumno")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Alumno idAlumno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNota", fetch = FetchType.LAZY)
    private List<Examenenlinea> examenenlineaList;

    public Nota() {
    }

    public Nota(Integer idNota) {
        this.idNota = idNota;
    }

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public Integer getNNota() {
        return nNota;
    }

    public void setNNota(Integer nNota) {
        this.nNota = nNota;
    }

    public Date getNAño() {
        return nAño;
    }

    public void setNAño(Date nAño) {
        this.nAño = nAño;
    }

    public String getNPeriodo() {
        return nPeriodo;
    }

    public void setNPeriodo(String nPeriodo) {
        this.nPeriodo = nPeriodo;
    }

    public ExamenHasCurso getExamenHasCurso() {
        return examenHasCurso;
    }

    public void setExamenHasCurso(ExamenHasCurso examenHasCurso) {
        this.examenHasCurso = examenHasCurso;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    @XmlTransient
    public List<Examenenlinea> getExamenenlineaList() {
        return examenenlineaList;
    }

    public void setExamenenlineaList(List<Examenenlinea> examenenlineaList) {
        this.examenenlineaList = examenenlineaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNota != null ? idNota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nota)) {
            return false;
        }
        Nota other = (Nota) object;
        if ((this.idNota == null && other.idNota != null) || (this.idNota != null && !this.idNota.equals(other.idNota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Nota[ idNota=" + idNota + " ]";
    }
    
}
