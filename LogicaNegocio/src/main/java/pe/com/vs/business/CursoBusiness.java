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
import pe.com.vs.entity.Curso;
import pe.com.vs.repository.CursoRepository;

/**
 *
 * @author Victor
 */
@Service("CursoBusiness")
public class CursoBusiness implements BaseBusiness<Curso, Integer> {

    @Autowired
    private CursoRepository cursoRepository;
    
    @Override
    public Curso ejecutar(OperacionEnum operacionEnum, Curso entidad, Integer id) {
        
        Curso resultado = null;
        
        switch(operacionEnum){
            case REGISTRAR:
                cursoRepository.save(entidad);
                break;
                
            case EDITAR:
                cursoRepository.save(entidad);
                break;
                
            case ELIMINAR:
                cursoRepository.save(entidad);
                break;
                
            case OBTENER:
                resultado = cursoRepository.findByOneIdCurso(id);
                break;
        }
        
        return resultado;
    }

    @Override
    public Iterable<Curso> ListarTodo() {
        return cursoRepository.findAllCurso();
    }

    @Override
    public Iterable<Curso> ListarPersonalizado() {
        return cursoRepository.findAllCursoPersonal();
    }
    
}
