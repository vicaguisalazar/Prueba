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
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a")})
public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAlumno")
    private Integer idAlumno;
    @JoinTable(name = "apoderado_has_alumno", joinColumns = {
        @JoinColumn(name = "idAlumno", referencedColumnName = "idAlumno")}, inverseJoinColumns = {
        @JoinColumn(name = "idApoderado", referencedColumnName = "idApoderado")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Apoderado> apoderadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlumno", fetch = FetchType.LAZY)
    private List<Nota> notaList;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlumno", fetch = FetchType.LAZY)
    private List<Alumnoretirado> alumnoretiradoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAlumno", fetch = FetchType.LAZY)
    private List<Mensualidad> mensualidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno", fetch = FetchType.LAZY)
    private List<Matricula> matriculaList;

    public Alumno() {
    }

    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    @XmlTransient
    public List<Apoderado> getApoderadoList() {
        return apoderadoList;
    }

    public void setApoderadoList(List<Apoderado> apoderadoList) {
        this.apoderadoList = apoderadoList;
    }

    @XmlTransient
    public List<Nota> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Nota> notaList) {
        this.notaList = notaList;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<Alumnoretirado> getAlumnoretiradoList() {
        return alumnoretiradoList;
    }

    public void setAlumnoretiradoList(List<Alumnoretirado> alumnoretiradoList) {
        this.alumnoretiradoList = alumnoretiradoList;
    }

    @XmlTransient
    public List<Mensualidad> getMensualidadList() {
        return mensualidadList;
    }

    public void setMensualidadList(List<Mensualidad> mensualidadList) {
        this.mensualidadList = mensualidadList;
    }

    @XmlTransient
    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumno != null ? idAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.idAlumno == null && other.idAlumno != null) || (this.idAlumno != null && !this.idAlumno.equals(other.idAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Alumno[ idAlumno=" + idAlumno + " ]";
    }
    
}
