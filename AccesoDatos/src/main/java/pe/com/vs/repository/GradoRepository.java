/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Grado;

/**
 *
 * @author Victor
 */
@Repository("GradoRepository")
public interface GradoRepository extends CrudRepository<Grado, Integer> {
    
    @Query("SELECT g FROM Grado g where g.nEstado='1'")
    public Iterable<Grado> findAllGradoPersonal();
    
}
