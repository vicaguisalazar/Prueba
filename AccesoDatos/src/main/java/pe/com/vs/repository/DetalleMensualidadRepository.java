/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Detallemensualidad;

/**
 *
 * @author Victor
 */
@Repository("DetalleMensualidadRepository")
public interface DetalleMensualidadRepository extends CrudRepository<Detallemensualidad, Integer> {
    
    @Query("FROM Detallemensualidad d INNER JOIN FETCH d.idMensualidad INNER JOIN FETCH d.idProductoAdicional WHERE d.idDetalleMensualidad=?1")
    public Detallemensualidad findOneByIdDetalleMensualidad(Integer id);
    
    @Query("FROM Detallemensualidad d INNER JOIN FETCH d.idMensualidad INNER JOIN FETCH d.idProductoAdicional ")
    public Detallemensualidad findAllDetalleMensualidad();
    
}
