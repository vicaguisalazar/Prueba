/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Curricula;

/**
 *
 * @author Victor
 */
@Repository("CurriculaRepository")
public interface CurriculaRepository extends CrudRepository<Curricula, Integer> {
    
    @Query("Select c FROM Curricula c INNER JOIN FETCH c.idCurso WHERE c.idCurricula=?1")
    public Curricula findByOneIdCurricula(Integer id);
    
    @Query("FROM Curricula c INNER JOIN FETCH c.idCurso WHERE c.nEstado='1'")
    public Iterable<Curricula> findAllCurriculaPersonal();
    
    @Query("FROM Curricula c INNER JOIN FETCH c.idCurso")
    public Iterable<Curricula> findAllCurricula();
    
}
