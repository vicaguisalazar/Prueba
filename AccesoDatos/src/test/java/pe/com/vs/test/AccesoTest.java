/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.vs.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pe.com.vs.repository.GradoHasSeccionRepository;
import pe.com.vs.repository.AlumnoRepository;
import pe.com.vs.repository.AlumnoRetiradoRepository;
import pe.com.vs.repository.ApoderadoRepository;
import pe.com.vs.repository.CurriculaRepository;
import pe.com.vs.repository.CursoRepository;
import pe.com.vs.repository.DetalleMensualidadRepository;
import pe.com.vs.repository.EventoRepository;
import pe.com.vs.repository.ExamenEnLineaRepository;
import pe.com.vs.repository.ExamenRepository;
import pe.com.vs.repository.GradoRepository;
import pe.com.vs.repository.MateriaRepository;
import pe.com.vs.repository.MatriculaRepository;
import pe.com.vs.repository.MensualidadRepository;
import pe.com.vs.repository.ModalidadRepository;
import pe.com.vs.repository.NotaRepository;
import pe.com.vs.repository.OpcionRepository;
import pe.com.vs.repository.PersonalRepository;
import pe.com.vs.repository.ProductoRepository;
import pe.com.vs.repository.ProfesorHasCursoRepository;
import pe.com.vs.repository.ProfesorRepository;
import pe.com.vs.repository.SeccionRepository;
import pe.com.vs.repository.TardanzaRepository;
import pe.com.vs.repository.TareaPendienteRepository;
import pe.com.vs.repository.UsuarioRepository;

/**
 *
 * @author Victor
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/java//pe/com/vs/configuration/SpringContext.xml" })
public class AccesoTest {
    
    @Autowired
    private SeccionRepository seccionRepository;
    
    @Autowired
    private GradoRepository gradoRepository;
    
    @Autowired
    private MateriaRepository materiaRepository;
    
    @Autowired
    private ExamenRepository examenRepository;
    
    @Autowired
    private ProductoRepository productoRepository;
   
    @Autowired
    private AlumnoRepository alumnoRepository;
    
    @Autowired
    private AlumnoRetiradoRepository alumnoRetiradoRepository;
    
    @Autowired
    private ApoderadoRepository apoderadoRepository;
    
    @Autowired
    private CurriculaRepository curriculaRepository;
    
    @Autowired
    private CursoRepository cursoRepository;
    
    @Autowired
    private EventoRepository eventoRepository;
    
    @Autowired
    private GradoHasSeccionRepository gradoHasSeccionRepository;
    
    @Autowired
    private ExamenEnLineaRepository examenEnLineaRepository;
    
    @Autowired
    private MatriculaRepository matriculaRepository;
    
    @Autowired
    private MensualidadRepository mensualidadRepository;
    
    @Autowired
    private ModalidadRepository modalidadRepository;
    
    @Autowired
    private NotaRepository notaRepository;
    
    @Autowired
    private OpcionRepository opcionRepository;
    
    @Autowired
    private PersonalRepository personalRepository;
    
    @Autowired
    private ProfesorRepository profesorRepository;
    
    @Autowired
    private ProfesorHasCursoRepository profesorHasCursoRepository;
   
    @Autowired
    private TardanzaRepository tardanzaRepository;
    
    @Autowired
    private TareaPendienteRepository tareaPendienteRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private DetalleMensualidadRepository detalleMensualidadRepository;
    
   @Test
   public void metSeccion(){
       assertNotNull(seccionRepository);
   }
   
   @Test
   public void metGrado(){
       assertNotNull(gradoRepository);
   }
    
   @Test
   public void metMateria(){
       assertNotNull(materiaRepository);
   }
   
   @Test
   public void metExamen(){
       assertNotNull(examenRepository);
   }
   
   @Test
   public void metProducto(){
       assertNotNull(productoRepository);
   }
   
   @Test
   public void metAlumno(){
       assertNotNull(alumnoRepository);
   }
   
   @Test
   public void metAlumnoRetirado(){
       assertNotNull(alumnoRetiradoRepository);
   }
   
   @Test
   public void metApoderado(){
       assertNotNull(apoderadoRepository);
   }
   
   @Test
   public void metCurricula(){
       assertNotNull(curriculaRepository);
   }
   
   @Test
   public void metCurso(){
       assertNotNull(cursoRepository);
   }
   
   @Test
   public void metEvento(){
       assertNotNull(eventoRepository);
   }
  
   @Test
   public void metGradoHasSeccion(){
       assertNotNull(gradoHasSeccionRepository);
   }
   
   @Test
   public void metExamenEnLinea(){
       assertNotNull(examenEnLineaRepository);
   }
   
   @Test
   public void metMatricula(){
       assertNotNull(matriculaRepository);
   }
   
   @Test
   public void metMensualidad(){
       assertNotNull(mensualidadRepository);
   }
   
   @Test
   public void metModalidad(){
       assertNotNull(modalidadRepository);
   }
   
   @Test
   public void metNota(){
       assertNotNull(notaRepository);
   }
   
   @Test
   public void metOpcion(){
       assertNotNull(opcionRepository);
   }
   
   @Test
   public void metPersonal(){
       assertNotNull(personalRepository);
   }
   
   @Test
   public void metProfesor(){
       assertNotNull(profesorRepository);
   }
   
   @Test
   public void metProfesorCurso(){
       assertNotNull(profesorHasCursoRepository);
   }
   
   @Test
   public void metTardanza(){
       assertNotNull(tardanzaRepository);
   }
   
   @Test
   public void metTareaPendiente(){
       assertNotNull(tareaPendienteRepository);
   }
   
   @Test
   public void metDetalleMensualidad(){
       assertNotNull(detalleMensualidadRepository);
   }
   
   @Test
   public void metUsuario(){
       assertNotNull(usuarioRepository);
   }
   
}
