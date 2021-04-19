package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.CiudadResidencia;
import co.edu.uniquindio.proyecto.repositorios.CiudadResidenciaRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CiudadResidenciaTest
{
    @Autowired
    private CiudadResidenciaRepo ciudadResidenciaRepo;

    /*
    //metodo de prueba para crear una ciudad
    @Test
    public void registrarCiudadTest()
    {
        //se crea una ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

        //se comprueba de que si se haya guardado
        Assertions.assertNotNull(ciudadGuardada);
    }
     */

    @Test
    @Sql("classpath:CiudadesResidencia.sql")
    public void registrarCiudadTest()
    {
        //se crea una ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Armenia1");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

        //se comprueba de que si se haya guardado
        Assertions.assertNotNull(ciudadGuardada);
    }

    /*
    //metodo de prueba para eliminar una ciudad
    @Test
    public void eliminarCiudadTest()
    {
        //se crea una ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

        //se elimina el registro
        ciudadResidenciaRepo.delete(ciudadGuardada);

        //se verifica que si haya sido borrado
        CiudadResidencia ciudadEliminada = ciudadResidenciaRepo.findById(1).orElse(null);
        Assertions.assertNull(ciudadEliminada);
    }
     */

    @Test
    @Sql("classpath:CiudadesResidencia.sql")
    public void eliminarCiudadTest()
    {
        //se busca el registro a eliminar
        CiudadResidencia ciudad = ciudadResidenciaRepo.findById(4).orElse(null);

        //se elimina el registro
        ciudadResidenciaRepo.delete(ciudad);

        //se verifica que si haya sido borrado
        CiudadResidencia ciudadEliminada = ciudadResidenciaRepo.findById(4).orElse(null);
        Assertions.assertNull(ciudadEliminada);
    }

    /*
    //metodo de prueba para actualizar una ciudad
    @Test
    public void actualizarCiudadTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

        //se modifica el nombre de la ciudad
        ciudadGuardada.setNombreCiudadResidencia("Calarcho");

        //se guarda el registro
        ciudadResidenciaRepo.save(ciudadGuardada);

        //Por último, verificamos que si haya quedado actualizado
        CiudadResidencia buscado = ciudadResidenciaRepo.findById(1).orElse(null);
        Assertions.assertEquals("Calarcho", buscado.getNombreCiudadResidencia());
    }
    */

    @Test
    @Sql("classpath:CiudadesResidencia.sql")
    public void actualizarCiudadTest()
    {
        //se busca el registro a modificar
        CiudadResidencia ciudad = ciudadResidenciaRepo.findById(1).orElse(null);

        //se cambia el nombre de Armenia a Armenia1
        ciudad.setNombreCiudadResidencia("Armenia1");

        //se guarda el registro
        ciudadResidenciaRepo.save(ciudad);

        //Por último, verificamos que si haya quedado actualizado
        CiudadResidencia buscado = ciudadResidenciaRepo.findById(1).orElse(null);
        Assertions.assertEquals("Armenia1", buscado.getNombreCiudadResidencia());
    }

    /*
    //metodo de prueba para listar las ciudades
    @Test
    public void listarCiudadesTest()
    {
        //se crea una ciudad
        CiudadResidencia ciudad1 = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad1);

        //se crea una ciudad
        CiudadResidencia ciudad2 = new CiudadResidencia("Circacia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada1 = ciudadResidenciaRepo.save(ciudad2);

        //se crea una ciudad
        CiudadResidencia ciudad3 = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadGuardada2 = ciudadResidenciaRepo.save(ciudad3);

        //Obtenemos la lista de todas las ciudades
        List<CiudadResidencia> lista = ciudadResidenciaRepo.findAll();

        //Imprimimos la lista
        System.out.println(lista);
    }
     */

    @Test
    @Sql("classpath:CiudadesResidencia.sql")
    public void listarCiudadesTest()
    {
        //Obtenemos la lista de todas las ciudades
        List<CiudadResidencia> lista = ciudadResidenciaRepo.findAll();

        //Imprimimos la lista
        System.out.println(lista);
    }
}
