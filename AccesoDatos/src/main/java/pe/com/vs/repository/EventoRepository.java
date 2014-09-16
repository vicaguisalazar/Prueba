/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Eventos;

/**
 *
 * @author Victor
 */
@Repository("EventoRepository")
public interface EventoRepository extends CrudRepository<Eventos, Integer> {
    
    @Query("Select e FROM Eventos e INNER JOIN FETCH e.idUsuario WHERE e.idEventos=?1")
    public Eventos findOneByIdEvento(Integer id);
    
    @Query("FROM Eventos e INNER JOIN FETCH e.idUsuario WHERE e.nEstado='1'")
    public Iterable<Eventos> findAllEventosPersonal();
    
    @Query("FROM Eventos e INNER JOIN FETCH e.idUsuario")
    public Iterable<Eventos> findAllEventosP();
    
}
