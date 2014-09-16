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
import pe.com.vs.entity.Nota;

/**
 *
 * @author Victor
 */
@Repository("NotaRepository")
public interface NotaRepository extends CrudRepository<Nota, Integer> {
    
    @Query("FROM Nota n INNER JOIN FETCH n.examenHasCurso INNER JOIN FETCH n.idAlumno WHERE n.idNota=?1")
    public Nota findOneByIdNota(Integer id);
    
    @Query("FROM Nota n INNER JOIN FETCH n.examenHasCurso INNER JOIN FETCH n.idAlumno ")
    public Nota findAllNota();
    
}
