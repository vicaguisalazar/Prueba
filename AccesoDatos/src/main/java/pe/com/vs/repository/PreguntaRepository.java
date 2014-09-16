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
import pe.com.vs.entity.Preguntas;

/**
 *
 * @author Victor
 */
@Repository("PreguntaRepository")
public interface PreguntaRepository extends CrudRepository<Preguntas, Integer> {
    
    @Query("FROM Preguntas p INNER JOIN FETCH p.idExamenEnLinea WHERE p.idPreguntas=?1")
    public Preguntas findOneByPreguntas(Integer id);
    
    @Query("FROM Preguntas p INNER JOIN FETCH p.idExamenEnLinea")
    public Preguntas findAllPreguntas();
    
    
}
