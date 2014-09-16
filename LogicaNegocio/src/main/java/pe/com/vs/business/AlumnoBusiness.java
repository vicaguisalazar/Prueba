/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.vs.business.base.OperacionEnum;
import pe.com.vs.business.custom.AlumnoCustom;
import pe.com.vs.entity.Alumno;
import pe.com.vs.entity.Usuario;
import pe.com.vs.repository.AlumnoRepository;
import pe.com.vs.repository.UsuarioRepository;

/**
 *
 * @author Victor
 */
@Service("AlumnoBusiness")
public class AlumnoBusiness implements AlumnoCustom<Usuario, Alumno, Integer> {

    @Autowired
    private AlumnoRepository alumnoRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Alumno registrarAlumno(Usuario padre, Alumno hijo) {
        Alumno resultado = null;
        
        if(padre!=null){
            hijo.setIdUsuario(padre);
            resultado = alumnoRepository.save(hijo);
        }
        
        return resultado;
    }
    
    @Override
    public Alumno ejecutar(OperacionEnum operacionEnum, Alumno entidad, Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Alumno> ListarTodo() {
        return alumnoRepository.findAllAlumno();
    }

    @Override
    public Iterable<Alumno> ListarPersonalizado() {
        return alumnoRepository.findAllAlumnoPersonal();
    }

    @Override
    public void ActualizarHijo(Usuario padre, Alumno hijo) {
       if(padre!=null){
            hijo.setIdUsuario(padre);
            alumnoRepository.save(hijo);
        }
    }

    @Override
    public void EliminarAlumno(Usuario padre, Alumno hijo) {
        
        if(padre!=null){
            padre.setNEstado(false);
            hijo.setIdUsuario(padre);
            alumnoRepository.save(hijo);
        }
        
    }
    
    
    
    
}
