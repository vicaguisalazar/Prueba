/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Materia;

/**
 *
 * @author Victor
 */
@Repository("MateriaRepository")
public interface MateriaRepository extends CrudRepository<Materia, Integer> {
    
    @Query("SELECT m FROM Materia m where m.nEstado='1'")
    public Iterable<Materia> findAllMateriaPersonal();
    
}
