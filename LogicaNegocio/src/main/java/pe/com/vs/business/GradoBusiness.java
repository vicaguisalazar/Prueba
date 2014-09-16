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
import pe.com.vs.entity.Grado;
import pe.com.vs.repository.GradoRepository;

/**
 *
 * @author Victor
 */
@Service("GradoBusiness")
public class GradoBusiness implements BaseBusiness<Grado, Integer> {

    @Autowired
    private GradoRepository gradoRepository;
    
    @Override
    public Grado ejecutar(OperacionEnum operacionEnum, Grado entidad, Integer id) {
        
        Grado resultado = null;
        switch(operacionEnum){
            case REGISTRAR:
                gradoRepository.save(entidad);
                break;
            case EDITAR:
                gradoRepository.save(entidad);
                break;
            case ELIMINAR:
                gradoRepository.save(entidad);
                break;
            case OBTENER:
                resultado = gradoRepository.findOne(id);
                break;
        
        }
        return resultado;
        
    }

    @Override
    public Iterable<Grado> ListarTodo() {
        return gradoRepository.findAll();
    }

    @Override
    public Iterable<Grado> ListarPersonalizado() {
        return gradoRepository.findAllGradoPersonal();
    }
    
}
