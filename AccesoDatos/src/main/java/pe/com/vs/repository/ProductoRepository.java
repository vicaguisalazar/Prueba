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
import pe.com.vs.entity.Productoadicional;

/**
 *
 * @author Victor
 */
@Repository("ProductoRepository")
public interface ProductoRepository extends  CrudRepository<Productoadicional, Integer> {
    
    @Query("SELECT p FROM Productoadicional p where p.nEstado='1'")
    public Iterable<Productoadicional> findAllProductoPersonal();
    
}
