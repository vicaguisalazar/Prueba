/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.ProfesorHasCurso;
import pe.com.vs.entity.ProfesorHasCursoPK;

/**
 *
 * @author Victor
 */
@Repository("ProfesorHasCursoRepository")
public interface ProfesorHasCursoRepository extends CrudRepository<ProfesorHasCurso, ProfesorHasCursoPK> {

    @Query("FROM ProfesorHasCurso p INNER JOIN FETCH p.curso INNER JOIN FETCH p.profesor WHERE p.profesorHasCursoPK.idProfesor=?1 AND p.profesorHasCursoPK.idCurso=?2")
    public ProfesorHasCurso findOneByIdProfesorCurso(Integer idProfesor,Integer idCurso);
    
    @Query("FROM ProfesorHasCurso p INNER JOIN FETCH p.curso INNER JOIN FETCH p.profesor WHERE p.nEstado='1'")
    public ProfesorHasCurso findAllCursoPersonal();
    
    @Query("FROM ProfesorHasCurso p INNER JOIN FETCH p.curso INNER JOIN FETCH p.profesor ")
    public ProfesorHasCurso findAllCurso();
    
    
    
    
    
}
