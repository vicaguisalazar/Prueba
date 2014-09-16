/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Alumno;

/**
 *
 * @author Victor
 */
@Repository("AlumnoRepository")
public interface AlumnoRepository extends CrudRepository<Alumno, Integer>{
    
    @Query("SELECT a FROM Alumno a INNER JOIN FETCH a.idUsuario WHERE a.idAlumno = ?1")
    public Alumno findOneByIdAlumno(Integer id);
    
    @Query("SELECT a FROM Alumno a INNER JOIN FETCH a.idUsuario where a.idUsuario.nEstado='1'")
    public Iterable<Alumno> findAllAlumnoPersonal();
    
    @Query("SELECT a FROM Alumno a INNER JOIN FETCH a.idUsuario")
    public Iterable<Alumno> findAllAlumno();
    
    
}
