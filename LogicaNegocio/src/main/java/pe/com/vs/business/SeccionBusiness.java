/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.business;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.vs.business.base.BaseBusiness;
import pe.com.vs.business.base.OperacionEnum;
import pe.com.vs.entity.Seccion;
import pe.com.vs.repository.SeccionRepository;

/**
 *
 * @author Victor
 */
@Service("SeccionBusiness")
public class SeccionBusiness implements BaseBusiness<Seccion, Integer> {

    @Autowired
    private SeccionRepository seccionRepository;
    
    @Override
    public Seccion ejecutar(OperacionEnum operacionEnum, Seccion entidad, Integer id) {
        
        Seccion resultado = null;
        switch(operacionEnum){
            case REGISTRAR:
                seccionRepository.save(entidad);
                break;
            case EDITAR:
                seccionRepository.save(entidad);
                break;
            case ELIMINAR:
                seccionRepository.save(entidad);
                break;
            case OBTENER:
                resultado = seccionRepository.findOne(id);
                break;
        }
        return resultado;
                
        
    }

    @Override
    public Iterable<Seccion> ListarTodo() {
        return seccionRepository.findAll();
    }

    @Override
    public Iterable<Seccion> ListarPersonalizado() {
        return seccionRepository.finAllSeccionPersonal();
    }
    
}
