/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Examenenlinea;

/**
 *
 * @author Victor
 */
@Repository("ExamenEnLineaRepository")
public interface ExamenEnLineaRepository extends CrudRepository<Examenenlinea, Integer> {
    
    
    @Query("FROM Examenenlinea e INNER JOIN FETCH e.idNota INNER JOIN FETCH e.gradoHasSeccion WHERE e.idExamenEnLinea=?1")
    public Examenenlinea findOneByIdExamenEnLinea(Integer idExamenEnLinea);
    
    @Query("FROM Examenenlinea e INNER JOIN FETCH e.idNota INNER JOIN FETCH e.gradoHasSeccion")
    public Iterable<Examenenlinea> findAllExamenEnLinea();
    
    @Query("FROM Examenenlinea e INNER JOIN FETCH e.idNota INNER JOIN FETCH e.gradoHasSeccion WHERE e.nEstadoPublicado='1'")
    public Iterable<Examenenlinea> findAllExamenEnLineaPersonal();
}
