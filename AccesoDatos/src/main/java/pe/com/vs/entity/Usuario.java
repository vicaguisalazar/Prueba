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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "nNombre")
    private String nNombre;
    @Basic(optional = false)
    @Column(name = "nApellido")
    private String nApellido;
    @Basic(optional = false)
    @Column(name = "nDni")
    private String nDni;
    @Basic(optional = false)
    @Column(name = "nDireccion")
    private String nDireccion;
    @Basic(optional = false)
    @Column(name = "nTelefono")
    private String nTelefono;
    @Basic(optional = false)
    @Column(name = "nFechaNacimiento")
    private String nFechaNacimiento;
    @Basic(optional = false)
    @Column(name = "nEstado")
    private boolean nEstado;
    @Basic(optional = false)
    @Column(name = "nRutaImagen")
    private String nRutaImagen;
    @Basic(optional = false)
    @Column(name = "nPrivilegio")
    private Character nPrivilegio;
    @Basic(optional = false)
    @Column(name = "nEmail")
    private String nEmail;
    @Basic(optional = false)
    @Column(name = "nUserID")
    private String nUserID;
    @Basic(optional = false)
    @Column(name = "nClave")
    private String nClave;
    @Basic(optional = false)
    @Column(name = "nGenero")
    private String nGenero;
    @Basic(optional = false)
    @Column(name = "nNacionalidad")
    private String nNacionalidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Profesor> profesorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Eventos> eventosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Alumno> alumnoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Personal> personalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Tardanza> tardanzaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Apoderado> apoderadoList;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String nNombre, String nApellido, String nDni, String nDireccion, String nTelefono, String nFechaNacimiento, boolean nEstado, String nRutaImagen, Character nPrivilegio, String nEmail, String nUserID, String nClave, String nGenero, String nNacionalidad) {
        this.idUsuario = idUsuario;
        this.nNombre = nNombre;
        this.nApellido = nApellido;
        this.nDni = nDni;
        this.nDireccion = nDireccion;
        this.nTelefono = nTelefono;
        this.nFechaNacimiento = nFechaNacimiento;
        this.nEstado = nEstado;
        this.nRutaImagen = nRutaImagen;
        this.nPrivilegio = nPrivilegio;
        this.nEmail = nEmail;
        this.nUserID = nUserID;
        this.nClave = nClave;
        this.nGenero = nGenero;
        this.nNacionalidad = nNacionalidad;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNNombre() {
        return nNombre;
    }

    public void setNNombre(String nNombre) {
        this.nNombre = nNombre;
    }

    public String getNApellido() {
        return nApellido;
    }

    public void setNApellido(String nApellido) {
        this.nApellido = nApellido;
    }

    public String getNDni() {
        return nDni;
    }

    public void setNDni(String nDni) {
        this.nDni = nDni;
    }

    public String getNDireccion() {
        return nDireccion;
    }

    public void setNDireccion(String nDireccion) {
        this.nDireccion = nDireccion;
    }

    public String getNTelefono() {
        return nTelefono;
    }

    public void setNTelefono(String nTelefono) {
        this.nTelefono = nTelefono;
    }

    public String getNFechaNacimiento() {
        return nFechaNacimiento;
    }

    public void setNFechaNacimiento(String nFechaNacimiento) {
        this.nFechaNacimiento = nFechaNacimiento;
    }

    public boolean getNEstado() {
        return nEstado;
    }

    public void setNEstado(boolean nEstado) {
        this.nEstado = nEstado;
    }

    public String getNRutaImagen() {
        return nRutaImagen;
    }

    public void setNRutaImagen(String nRutaImagen) {
        this.nRutaImagen = nRutaImagen;
    }

    public Character getNPrivilegio() {
        return nPrivilegio;
    }

    public void setNPrivilegio(Character nPrivilegio) {
        this.nPrivilegio = nPrivilegio;
    }

    public String getNEmail() {
        return nEmail;
    }

    public void setNEmail(String nEmail) {
        this.nEmail = nEmail;
    }

    public String getNUserID() {
        return nUserID;
    }

    public void setNUserID(String nUserID) {
        this.nUserID = nUserID;
    }

    public String getNClave() {
        return nClave;
    }

    public void setNClave(String nClave) {
        this.nClave = nClave;
    }

    public String getNGenero() {
        return nGenero;
    }

    public void setNGenero(String nGenero) {
        this.nGenero = nGenero;
    }

    public String getNNacionalidad() {
        return nNacionalidad;
    }

    public void setNNacionalidad(String nNacionalidad) {
        this.nNacionalidad = nNacionalidad;
    }

    @XmlTransient
    public List<Profesor> getProfesorList() {
        return profesorList;
    }

    public void setProfesorList(List<Profesor> profesorList) {
        this.profesorList = profesorList;
    }

    @XmlTransient
    public List<Eventos> getEventosList() {
        return eventosList;
    }

    public void setEventosList(List<Eventos> eventosList) {
        this.eventosList = eventosList;
    }

    @XmlTransient
    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    @XmlTransient
    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    @XmlTransient
    public List<Tardanza> getTardanzaList() {
        return tardanzaList;
    }

    public void setTardanzaList(List<Tardanza> tardanzaList) {
        this.tardanzaList = tardanzaList;
    }

    @XmlTransient
    public List<Apoderado> getApoderadoList() {
        return apoderadoList;
    }

    public void setApoderadoList(List<Apoderado> apoderadoList) {
        this.apoderadoList = apoderadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.vs.entity.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
