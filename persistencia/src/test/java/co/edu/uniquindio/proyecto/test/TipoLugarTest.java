package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.TipoLugar;
import co.edu.uniquindio.proyecto.entidades.TipoUsuario;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.repositorios.TipoLugarRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TipoLugarTest
{
    @Autowired
    private TipoLugarRepo tipoLugarRepo;

    @Test
    public void agregarTipoLugarTest()
    {
        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardar = tipoLugarRepo.save(tipoLugar);

        //se comprueba de que si se haya guardado
        Assertions.assertNotNull(tipoLugarGuardar);
    }

    @Test
    public void eliminarTipoLugarTest()
    {
        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardar = tipoLugarRepo.save(tipoLugar);

        //se elimina el registro
        tipoLugarRepo.delete(tipoLugar);

        //se verifica que si haya sido borrado
        TipoLugar tipoLugarEliminado = tipoLugarRepo.findById(1).orElse(null);
        Assertions.assertNull(tipoLugarEliminado);
    }

    @Test
    public void actualizarTipoLugarTest()
    {
        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardar = tipoLugarRepo.save(tipoLugar);

        //se cambia el tipo de hotel a restaurante
        tipoLugar.setNombreTipoLugar("Restaurante");

        //se guarda el registro
        tipoLugarRepo.save(tipoLugar);

        //Por último, verificamos que si haya quedado actualizado
        TipoLugar tipolugarBuscar = tipoLugarRepo.findById(1).orElse(null);
        Assertions.assertEquals("Restaurante", tipolugarBuscar.getNombreTipoLugar());
    }

    @Test
    public void listarTipoLugarTest()
    {
        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardar = tipoLugarRepo.save(tipoLugar);

        //se crea el tipo de lugar
        TipoLugar tipoLugar1 = new TipoLugar("Restaurante");

        //se guarda el registro
        TipoLugar tipoLugarGuardar1 = tipoLugarRepo.save(tipoLugar1);

        //se crea el tipo de lugar
        TipoLugar tipoLugar2 = new TipoLugar("Cafeteria");

        //se guarda el registro
        TipoLugar tipoLugarGuardar2 = tipoLugarRepo.save(tipoLugar2);

        //se obtienen todos los tipos de lugares
        List<TipoLugar> lista = tipoLugarRepo.findAll();

        //se imprimen todos los tipos de lugares
        System.out.println(lista);
    }
}
