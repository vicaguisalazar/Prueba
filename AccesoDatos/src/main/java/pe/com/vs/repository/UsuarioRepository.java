/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.vs.entity.Usuario;

/**
 *
 * @author Victor
 */
@Repository("UsuarioRepository")
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
}
