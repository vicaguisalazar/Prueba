/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Examen;

/**
 *
 * @author Victor
 */
@Repository("ExamenRepository")
public interface ExamenRepository extends CrudRepository<Examen, Integer> {

    @Query("SELECT e FROM Examen e where e.nEstado='1'")
    public Iterable<Examen> findAllExamenPersonal(); 
    
}
