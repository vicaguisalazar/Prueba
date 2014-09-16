/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Curso;

/**
 *
 * @author Victor
 */
@Repository("CursoRepository")
public interface CursoRepository extends CrudRepository<Curso, Integer> {
    
    @Query("SELECT c FROM Curso c INNER JOIN FETCH c.idMateria WHERE c.idCurso = ?1")
    public Curso findByOneIdCurso(Integer id);
    
    @Query("FROM Curso c INNER JOIN FETCH c.idMateria")
    public Iterable<Curso> findAllCurso();
    
     @Query("FROM Curso c INNER JOIN FETCH c.idMateria WHERE c.nEstado='1'")
    public Iterable<Curso> findAllCursoPersonal();
}
