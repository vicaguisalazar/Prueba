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
import pe.com.vs.entity.Mensualidad;

/**
 *
 * @author Victor
 */
@Repository("MensualidadRepository")
public interface MensualidadRepository extends CrudRepository<Mensualidad, Integer> {
    
    @Query("FROM Mensualidad m INNER JOIN FETCH m.idModalidad INNER JOIN FETCH m.idAlumno WHERE m.idMensualidad=?1")
    public Mensualidad findOneByIdMensualidad(Integer id);
    
    @Query("Select m FROM Mensualidad m INNER JOIN FETCH m.idModalidad INNER JOIN FETCH m.idAlumno")
    public Iterable<Mensualidad> findAllMensualidad();
    
    
}
