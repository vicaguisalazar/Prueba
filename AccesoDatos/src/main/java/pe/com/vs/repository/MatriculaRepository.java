/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Matricula;
import pe.com.vs.entity.MatriculaPK;

/**
 *
 * @author Victor
 */
@Repository("MatriculaRepository")
public interface MatriculaRepository extends CrudRepository<Matricula, MatriculaPK> {
    
    @Query("FROM Matricula m INNER JOIN FETCH m.gradoHasSeccion INNER JOIN FETCH m.idModalidad INNER JOIN FETCH m.alumno WHERE m.matriculaPK.idMatricula=?1")
    public Matricula finOneByIdMatriculaPK(Integer idMatricula);
    
    @Query("FROM Matricula m INNER JOIN FETCH m.gradoHasSeccion INNER JOIN FETCH m.idModalidad INNER JOIN FETCH m.alumno WHERE m.nEstado='1'")
    public Matricula finOneByMatriculaPersonal();
    
    @Query("FROM Matricula m INNER JOIN FETCH m.gradoHasSeccion INNER JOIN FETCH m.idModalidad INNER JOIN FETCH m.alumno")
    public Matricula finOneByMatricula();
    
}
