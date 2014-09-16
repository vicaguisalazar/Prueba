/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Seccion;



/**
 *
 * @author Victor
 */
@Repository("SeccionRepository")
public interface SeccionRepository extends CrudRepository<Seccion, Integer> {
    
    @Query("SELECT s FROM Seccion s where s.nEstado='1'")
    public Iterable<Seccion> finAllSeccionPersonal();
    
}
