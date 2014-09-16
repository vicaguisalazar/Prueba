/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.business;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.vs.business.base.BaseBusiness;
import pe.com.vs.business.base.OperacionEnum;
import pe.com.vs.entity.Materia;
import pe.com.vs.repository.MateriaRepository;

/**
 *
 * @author Victor
 */
@Service("MateriaBusiness")
public class MateriaBusiness implements BaseBusiness<Materia, Integer> {

    @Autowired
    private MateriaRepository materiaRepository;
    
    @Override
    public Materia ejecutar(OperacionEnum operacionEnum, Materia entidad, Integer id) {
        
        Materia resultado = null;
        switch(operacionEnum){
            case REGISTRAR:
                materiaRepository.save(entidad);
                break;
            case EDITAR:
                materiaRepository.save(entidad);
                break;
            case ELIMINAR:
                materiaRepository.save(entidad);
                break;
            case OBTENER:
                resultado = materiaRepository.findOne(id);
                break;
        }
        return resultado;
    }

    @Override
    public Iterable<Materia> ListarTodo() {
        return materiaRepository.findAll();
    }

    @Override
    public Iterable<Materia> ListarPersonalizado() {
        return materiaRepository.findAllMateriaPersonal();
    }
    
}
