package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.*;
import co.edu.uniquindio.proyecto.repositorios.CiudadResidenciaRepo;
import co.edu.uniquindio.proyecto.repositorios.LugarRepo;
import co.edu.uniquindio.proyecto.repositorios.TipoLugarRepo;
import co.edu.uniquindio.proyecto.repositorios.UsuarioRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LugarTest
{
    @Autowired
    private LugarRepo lugarRepo;
    @Autowired
    private UsuarioRepo usuarioRepo;
    @Autowired
    private TipoLugarRepo tipoLugarRepo;
    @Autowired
    private CiudadResidenciaRepo ciudadResidenciaRepo;

    /*
    //metodo que agrega un lugar
    @Test
    public void registrarLugarTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                                    "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario
        Usuario usuario1 = new Usuario("josh","apa","apa1","brrio 1234",
                                    "apa@blablabla",21, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado1 = usuarioRepo.save(usuario1);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                            "el mejor restaurante de comida europea","brrio 123",
                            EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se comprueba de que si se haya guardado
        Assertions.assertNotNull(lugarGuardado);
    }
     */

    @Test
    @Sql("classpath:Lugares.sql")
    public void registrarLugarTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario
        Usuario usuario1 = new Usuario("josh","apa","apa1","brrio 1234",
                "apa@blablabla",21, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado1 = usuarioRepo.save(usuario1);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                "el mejor restaurante de comida europea","brrio 123",
                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se comprueba de que si se haya guardado
        Assertions.assertNotNull(lugarGuardado);
    }

    /*
    //metodo que elimina lugares
    @Test
    public void eliminarLugarTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                                    "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario
        Usuario usuario1 = new Usuario("josh","apa","apa1","brrio 1234",
                                    "apa@blablabla",21, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado1 = usuarioRepo.save(usuario1);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                                "el mejor restaurante de comida europea","brrio 123",
                                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se elimina el registro
        lugarRepo.delete(lugarGuardado);

        //se verifica que si haya sido borrado
        Lugar lugarEliminado = lugarRepo.findById(1).orElse(null);
        Assertions.assertNull(lugarEliminado);
    }
     */

    @Test
    @Sql("classpath:Lugares.sql")
    public void eliminarLugarTest()
    {
        //se busca el registro a eliminar
        Lugar lugar = lugarRepo.findById(1).orElse(null);

        //se elimina el registro
        lugarRepo.delete(lugar);

        //se verifica que si haya sido borrado
        Lugar lugarEliminado = lugarRepo.findById(1).orElse(null);
        Assertions.assertNull(lugarEliminado);
    }

    /*
    //metodo que actualiza un lugar
    @Test
    public void actualizarLugarTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                                    "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario
        Usuario usuario1 = new Usuario("josh","apa","apa1","brrio 1234",
                                    "apa@blablabla",21, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado1 = usuarioRepo.save(usuario1);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                                "el mejor restaurante de comida europea","brrio 123",
                                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se cambia el estado del lugar de pendiente a aprobado
        lugarGuardado.setEstadoLugar(EstadoLugar.APROBADO);

        //se guarda el registro
        lugarRepo.save(lugarGuardado);

        //Por último, verificamos que si haya quedado actualizado
        Lugar buscar = lugarRepo.findById(1).orElse(null);
        Assertions.assertEquals(EstadoLugar.APROBADO, buscar.getEstadoLugar());
    }
     */

    @Test
    @Sql("classpath:Lugares.sql")
    public void actualizarLugarTest()
    {
        //se busca el registro a modiicar
        Lugar lugar = lugarRepo.findById(1).orElse(null);

        //se cambia el estado del lugar de pendiente a aprobado
        lugar.setEstadoLugar(EstadoLugar.APROBADO);

        //se guarda el registro
        lugarRepo.save(lugar);

        //Por último, verificamos que si haya quedado actualizado
        Lugar buscar = lugarRepo.findById(1).orElse(null);
        Assertions.assertEquals(EstadoLugar.APROBADO, buscar.getEstadoLugar());
    }

    /*
    //metodo que lista los lugares
    @Test
    public void listarLugarTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea la ciudad
        CiudadResidencia ciudad1 = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado1 = ciudadResidenciaRepo.save(ciudad1);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                                    "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario
        Usuario usuario1 = new Usuario("josh","apa","apa1","brrio 1234",
                                    "apa@blablabla",21, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado1 = usuarioRepo.save(usuario1);

        //se crea el usuario
        Usuario usuario2 = new Usuario("jhonatan","buche","buche1","brrio 12356",
                                    "buche@blablabla",24, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad1);

        //se guarda el registro
        Usuario usuarioGuardado2 = usuarioRepo.save(usuario2);

        //se crea el usuario
        Usuario usuario3 = new Usuario("duvan","calvo","calvo1","brrio 1234567",
                                    "calvo@blablabla",24, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad1);

        //se guarda el registro
        Usuario usuarioGuardado3 = usuarioRepo.save(usuario3);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el tipo de lugar
        TipoLugar tipoLugar1 = new TipoLugar("Restaurante");

        //se guarda el registro
        TipoLugar tipoLugarGuardado1 = tipoLugarRepo.save(tipoLugar1);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                "el mejor restaurante de comida europea","brrio 123",
                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar1,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se crea el lugar
        Lugar lugar1 = new Lugar("el atardecer","3154569858",
                "el mejor hotel de toda sur america","brrio 321",
                EstadoLugar.PENDIENTE,usuario2,usuario3,tipoLugar,ciudad1);

        //se guarda el registro
        Lugar lugarGuardado1 = lugarRepo.save(lugar1);

        //se buscan todos los lugares
        List<Lugar> lista = lugarRepo.findAll();

        //se imprimen los lugares
        System.out.println(lista);
    }
    */

    @Test
    @Sql("classpath:Lugares.sql")
    public void listarLugarTest()
    {
        //se buscan todos los lugares
        List<Lugar> lista = lugarRepo.findAll();

        //se imprimen los lugares
        System.out.println(lista);
    }
}
