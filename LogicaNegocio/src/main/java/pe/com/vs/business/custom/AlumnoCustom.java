/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.business.custom;

import java.io.Serializable;
import pe.com.vs.business.base.BaseBusiness;

/**
 *
 * @author Victor
 */
public interface AlumnoCustom <P,H, PK extends Serializable> extends BaseBusiness<H, PK> {
   
    H registrarAlumno(P padre, H hijo);
    
    void ActualizarHijo(P padre,H hijo );
    
    void EliminarAlumno(P padre,H hijo );
    
}
