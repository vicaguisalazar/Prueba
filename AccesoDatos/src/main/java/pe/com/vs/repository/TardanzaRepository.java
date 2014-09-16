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
import pe.com.vs.entity.Tardanza;

/**
 *
 * @author Victor
 */
@Repository("TardanzaRepository")
public interface TardanzaRepository extends CrudRepository<Tardanza, Integer> {
    
    @Query("FROM Tardanza t INNER JOIN FETCH t.idUsuario WHERE t.idTardanza='1'")
    public Tardanza findOneByIdTardanza(Integer id);
    
    @Query("FROM Tardanza t INNER JOIN FETCH t.idUsuario")
    public Tardanza findAllIdTardanza();
}
