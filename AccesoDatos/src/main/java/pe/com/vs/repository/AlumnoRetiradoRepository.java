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
import pe.com.vs.entity.Alumnoretirado;

/**
 *
 * @author Victor
 */
@Repository("AlumnoRetiradoRepository")
public interface AlumnoRetiradoRepository extends CrudRepository<Alumnoretirado, Integer> {
    
    @Query("FROM Alumnoretirado a INNER JOIN FETCH a.idAlumno INNER JOIN FETCH a.idGrado WHERE a.idAlumnoRetirado=?1")
    public Alumnoretirado findOneByIdAlumnoRetirado(Integer id);
    
  
    @Query("FROM Alumnoretirado a INNER JOIN FETCH a.idAlumno INNER JOIN FETCH a.idGrado")
    public Iterable<Alumnoretirado> findAllAlumnoRetirado();
    
    
}
