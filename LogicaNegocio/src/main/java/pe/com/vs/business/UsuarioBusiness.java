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
import pe.com.vs.entity.Usuario;
import pe.com.vs.repository.UsuarioRepository;

/**
 *
 * @author Victor
 */
@Service("UsuarioBusiness")
public class UsuarioBusiness implements BaseBusiness<Usuario, Integer> {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario ejecutar(OperacionEnum operacionEnum, Usuario entidad, Integer id) {
        Usuario resultado = null;
        switch(operacionEnum){
            case REGISTRAR:
                usuarioRepository.save(entidad);
                break;
            case EDITAR:
                usuarioRepository.save(entidad);
                break;
            case ELIMINAR:
                usuarioRepository.save(entidad);
                break;
            case OBTENER:
                resultado = usuarioRepository.findOne(id);
                break;
        }
        return resultado;
    }

    @Override
    public Iterable<Usuario> ListarTodo() {
        return usuarioRepository.findAll();
    }

    @Override
    public Iterable<Usuario> ListarPersonalizado() {
        return null;
    }
    
}
