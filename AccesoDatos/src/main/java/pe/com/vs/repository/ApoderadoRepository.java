/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Apoderado;

/**
 *
 * @author Victor
 */
@Repository("ApoderadoRepository")
public interface ApoderadoRepository extends CrudRepository<Apoderado, Integer> {
    
    @Query("FROM Apoderado a INNER JOIN FETCH a.idUsuario where a.idApoderado=?1")
    public Apoderado findByOneIdApoderado(Integer id);
    
    @Query("FROM Apoderado a INNER JOIN FETCH a.idUsuario where a.idUsuario.nEstado='1'")
    public Iterable<Apoderado> findAllApoderadoPersonal();
    
    @Query("FROM Apoderado a INNER JOIN FETCH a.idUsuario")
    public Iterable<Apoderado> findAllApoderado();
    
}
