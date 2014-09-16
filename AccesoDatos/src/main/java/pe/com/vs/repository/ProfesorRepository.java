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
import pe.com.vs.entity.Profesor;

/**
 *
 * @author Victor
 */
@Repository("ProfesorRepository")
public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {
    
    @Query("FROM Profesor p INNER JOIN FETCH p.idUsuario WHERE p.idProfesor=?1")
    public Profesor findOneByIdProfesor(Integer id);
    
    @Query("FROM Profesor p INNER JOIN FETCH p.idUsuario WHERE p.idUsuario.nEstado='1'")
    public Profesor findAllProfesorPersonal();
    
    @Query("FROM Profesor p INNER JOIN FETCH p.idUsuario ")
    public Profesor findAllProfesor();
    
}
