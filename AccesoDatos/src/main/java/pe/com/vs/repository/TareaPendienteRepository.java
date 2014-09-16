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
import pe.com.vs.entity.Tareaspendiente;

/**
 *
 * @author Victor
 */
@Repository("TareaPendienteRepository")
public interface TareaPendienteRepository extends CrudRepository<Tareaspendiente, Integer> {
    
    @Query("FROM Tareaspendiente t INNER JOIN FETCH t.idCurso WHERE t.idTareasPendiente=?1")
    public Tareaspendiente findOneByIdTareaPendiente(Integer id);
    
    @Query("FROM Tareaspendiente t INNER JOIN FETCH t.idCurso WHERE t.nEstado='1'")
    public Tareaspendiente findAllTareaPendientePersonal();
    
    @Query("FROM Tareaspendiente t INNER JOIN FETCH t.idCurso ")
    public Tareaspendiente findAllTareaPendiente();
    
    
    
}
