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
import pe.com.vs.entity.Opcion;

/**
 *
 * @author Victor
 */
@Repository("OpcionRepository")
public interface OpcionRepository extends CrudRepository<Opcion, Integer> {
    
    @Query("FROM Opcion o INNER JOIN FETCH o.idPreguntas WHERE o.idOpcion=?1")
    public Opcion findOneByIdOpcion(Integer id);
    
    @Query("FROM Opcion o INNER JOIN FETCH o.idPreguntas ")
    public Opcion findAllOpcion();
    
}
