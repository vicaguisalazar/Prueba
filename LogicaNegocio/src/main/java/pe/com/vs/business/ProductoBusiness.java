/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.business;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.vs.business.base.BaseBusiness;
import pe.com.vs.business.base.OperacionEnum;
import pe.com.vs.entity.Productoadicional;
import pe.com.vs.repository.ProductoRepository;

/**
 *
 * @author Victor
 */
public class ProductoBusiness implements BaseBusiness<Productoadicional, Integer> {
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Productoadicional ejecutar(OperacionEnum operacionEnum, Productoadicional entidad, Integer id) {
        Productoadicional resultado = null;
        switch(operacionEnum){
            case REGISTRAR:
                productoRepository.save(entidad);
                break;
            case EDITAR:
                productoRepository.save(entidad);
                break;
            case ELIMINAR:
                productoRepository.save(entidad);
                break;
            case OBTENER:
                resultado = productoRepository.findOne(id);
                break;
        }
        return resultado;
    }

    @Override
    public Iterable<Productoadicional> ListarTodo() {
        return productoRepository.findAll();
    }

    @Override
    public Iterable<Productoadicional> ListarPersonalizado() {
        return productoRepository.findAllProductoPersonal();
    }
    
}
