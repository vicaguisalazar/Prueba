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
import pe.com.vs.entity.Personal;

/**
 *
 * @author Victor
 */
@Repository("PersonalRepository")
public interface PersonalRepository extends CrudRepository<Personal, Integer> {
    
    @Query("FROM Personal p INNER JOIN FETCH p.idUsuario WHERE p.idPersonal=?1")
    public Personal findOneByIdPersonal(Integer id);
    
    @Query("Select p FROM Personal p INNER JOIN FETCH p.idUsuario WHERE p.idUsuario.nEstado='1'")
    public Personal findAllPersonal();
    
    @Query("Select p FROM Personal p INNER JOIN FETCH p.idUsuario")
    public Personal findAllPersonaPersonal();
    
}
