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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")})
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCurso")
    private Integer idCurso;
    @Basic(optional = false)
    @Column(name = "nNombre")
    private String nNombre;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @Basic(optional = false)
    @Column(name = "nCantidadHora")
    private int nCantidadHora;
    @JoinTable(name = "curso_has_grado", joinColumns = {
        @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")}, inverseJoinColumns = {
        @JoinColumn(name = "idGrado", referencedColumnName = "idGrado")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Grado> gradoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curso", fetch = FetchType.LAZY)
    private List<ExamenHasCurso> examenHasCursoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCurso", fetch = FetchType.LAZY)
    private List<Tareaspendiente> tareaspendienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curso", fetch = FetchType.LAZY)
    private List<ProfesorHasCurso> profesorHasCursoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCurso", fetch = FetchType.LAZY)
    private List<Curricula> curriculaList;
    @JoinColumn(name = "idMateria", referencedColumnName = "idMateria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Materia idMateria;

    public Curso() {
    }

    public Curso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Curso(Integer idCurso, String nNombre, boolean nEstado, int nCantidadHora) {
        this.idCurso = idCurso;
        this.nNombre = nNombre;
        this.nEstado = nEstado;
        this.nCantidadHora = nCantidadHora;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    public int getNCantidadHora() {
        return nCantidadHora;
    }

    public void setNCantidadHora(int nCantidadHora) {
        this.nCantidadHora = nCantidadHora;
    }

    @XmlTransient
    public List<Grado> getGradoList() {
        return gradoList;
    }

    public void setGradoList(List<Grado> gradoList) {
        this.gradoList = gradoList;
    }

    @XmlTransient
    public List<ExamenHasCurso> getExamenHasCursoList() {
        return examenHasCursoList;
    }

    public void setExamenHasCursoList(List<ExamenHasCurso> examenHasCursoList) {
        this.examenHasCursoList = examenHasCursoList;
    }

    @XmlTransient
    public List<Tareaspendiente> getTareaspendienteList() {
        return tareaspendienteList;
    }

    public void setTareaspendienteList(List<Tareaspendiente> tareaspendienteList) {
        this.tareaspendienteList = tareaspendienteList;
    }

    @XmlTransient
    public List<ProfesorHasCurso> getProfesorHasCursoList() {
        return profesorHasCursoList;
    }

    public void setProfesorHasCursoList(List<ProfesorHasCurso> profesorHasCursoList) {
        this.profesorHasCursoList = profesorHasCursoList;
    }

    @XmlTransient
    public List<Curricula> getCurriculaList() {
        return curriculaList;
    }

    public void setCurriculaList(List<Curricula> curriculaList) {
        this.curriculaList = curriculaList;
    }

    public Materia getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Materia idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Curso[ idCurso=" + idCurso + " ]";
    }
    
}
