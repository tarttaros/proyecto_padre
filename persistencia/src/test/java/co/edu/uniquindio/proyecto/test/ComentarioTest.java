package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.*;
import co.edu.uniquindio.proyecto.repositorios.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ComentarioTest
{
    @Autowired
    private ComentarioRepo comentarioRepo;
    @Autowired
    private LugarRepo lugarRepo;
    @Autowired
    private UsuarioRepo usuarioRepo;
    @Autowired
    private TipoLugarRepo tipoLugarRepo;
    @Autowired
    private CiudadResidenciaRepo ciudadResidenciaRepo;

    @Test
    public void agregarComentarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea la ciudad
        CiudadResidencia ciudad1 = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada1 = ciudadResidenciaRepo.save(ciudad1);

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

        //se crea el comentario
        Comentario comentario = new Comentario(lugar,usuario2,"muy bueno el lugar y cuenta con una excelente atencion",
                                            5);

        //se guarda el registro
        Comentario comentarioGuardado = comentarioRepo.save(comentario);

        //se comprueba que si se haya guardado
        Assertions.assertNotNull(comentarioGuardado);
    }

    @Test
    public void eliminarComentariotest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea la ciudad
        CiudadResidencia ciudad1 = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada1 = ciudadResidenciaRepo.save(ciudad1);

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

        //se crea el comentario
        Comentario comentario = new Comentario(lugar,usuario2,"muy bueno el lugar y cuenta con una excelente atencion",
                                            5);

        //se guarda el registro
        Comentario comentarioGuardado = comentarioRepo.save(comentario);

        //se elimina el registro
        comentarioRepo.delete(comentarioGuardado);

        //se verifica que si haya sido eliminado
        Comentario comentarioEliminado = comentarioRepo.findById(1).orElse(null);
        Assertions.assertNull(comentarioEliminado);
    }

    @Test
    public void actualizarComentarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea la ciudad
        CiudadResidencia ciudad1 = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada1 = ciudadResidenciaRepo.save(ciudad1);

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

        //se crea el comentario
        Comentario comentario = new Comentario(lugar,usuario2,"muy bueno el lugar y cuenta con una excelente atencion",
                                            5);

        //se guarda el registro
        Comentario comentarioGuardado = comentarioRepo.save(comentario);

        //se cambia la calificacion de 5 a 9
        comentarioGuardado.setCalificacion(9);

        //se guarda el registro
        comentarioRepo.save(comentarioGuardado);
    }

    @Test
    public void listarComentariosTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea la ciudad
        CiudadResidencia ciudad1 = new CiudadResidencia("Armenia");

        //se guarda el registro
        CiudadResidencia ciudadGuardada1 = ciudadResidenciaRepo.save(ciudad1);

        //se crea la ciudad
        CiudadResidencia ciudad2 = new CiudadResidencia("Circacia");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado2 = ciudadResidenciaRepo.save(ciudad2);

        //se crea la ciudad
        CiudadResidencia ciudad3 = new CiudadResidencia("Calarca");

        //se guarda el registro
        CiudadResidencia ciudadGuardada3 = ciudadResidenciaRepo.save(ciudad3);

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
        Usuario usuario3 = new Usuario("andre","pingui","pingui1","brrio 321",
                                    "pingui@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad1);

        //se guarda el registro
        Usuario usuarioGuardado3 = usuarioRepo.save(usuario3);

        //se crea el usuario
        Usuario usuario4 = new Usuario("hugo","pa","pa1","brrio 4321",
                                    "pa@blablabla",31, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado4 = usuarioRepo.save(usuario4);

        //se crea el usuario
        Usuario usuario5 = new Usuario("diego","pelota","pelota1","brrio 654321",
                                    "pelota@blablabla",24, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad1);

        //se guarda el registro
        Usuario usuarioGuardado5 = usuarioRepo.save(usuario5);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el tipo de lugar
        TipoLugar tipoLugar1 = new TipoLugar("Bar");

        //se guarda el registro
        TipoLugar tipoLugarGuardado1 = tipoLugarRepo.save(tipoLugar1);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                                "el mejor restaurante de comida europea","brrio 123",
                                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad2);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se crea el lugar
        Lugar lugar1 = new Lugar("el mirador","3155578423",
                                "el mejor bar de el area andina","brrio 321",
                                EstadoLugar.PENDIENTE,usuario2,usuario3,tipoLugar1,ciudad3);

        //se guarda el registro
        Lugar lugarGuardado1 = lugarRepo.save(lugar1);

        //se crea el comentario
        Comentario comentario = new Comentario(lugar,usuario4,"muy bueno el lugar y cuenta con una excelente atencion",
                5);

        //se guarda el registro
        Comentario comentarioGuardado = comentarioRepo.save(comentario);


        //se crea el comentario
        Comentario comentario1 = new Comentario(lugar1,usuario5,"muy bueno el bar,excelente",
                6);

        //se guarda el registro
        Comentario comentarioGuardado1 = comentarioRepo.save(comentario1);

        //se buscan todos los comentarios
        List<Comentario> lista = comentarioRepo.findAll();

        //se imprime la lista
        System.out.println(lista);
    }
}
