
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pe.com.vs.business.SeccionBusiness;
import pe.com.vs.business.UsuarioBusiness;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victoralfonsoaguilarsalazar
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/java//pe/com/vs/configuration/Services.xml" })
public class NegocioTest {
    
  @Autowired
  private UsuarioBusiness usuarioBusiness;
  
  @Autowired
  private SeccionBusiness seccionBusiness;
  
  @Test
  public void metUsuario(){
       assertNotNull(usuarioBusiness);
   }
  
  @Test
  public void metSeccion(){
       assertNotNull(seccionBusiness);
   }
  
          
    
}
