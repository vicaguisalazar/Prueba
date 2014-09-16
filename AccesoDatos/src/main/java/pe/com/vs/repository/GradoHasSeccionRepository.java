/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.GradoHasSeccion;
import pe.com.vs.entity.GradoHasSeccionPK;

/**
 *
 * @author Victor
 */
@Repository("GradoHasSeccionRepository")
public interface GradoHasSeccionRepository extends CrudRepository<GradoHasSeccion, GradoHasSeccionPK>{
    
    @Query("FROM GradoHasSeccion g INNER JOIN FETCH g.grado INNER JOIN FETCH g.seccion WHERE g.gradoHasSeccionPK.idSeccion=?1 AND g.gradoHasSeccionPK.idGrado=?2 ")
    public GradoHasSeccion findOneByIdGradoHasSeccion(Integer idSeccion, Integer idGrado);
    
    @Query("FROM GradoHasSeccion g INNER JOIN FETCH g.grado INER JOIN g.seccion WHERE g.nEstado='1'")
    public Iterable<GradoHasSeccion> findAllGradoHasSeccionPersonal();
    
    @Query("FROM GradoHasSeccion g INNER JOIN FETCH g.grado INER JOIN g.seccion")
    public Iterable<GradoHasSeccion> findAllGradoHasSeccion();
    
}
