package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.*;
import co.edu.uniquindio.proyecto.repositorios.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class FavoritoTest
{
    @Autowired
    private FavoritoRepo favoritoRepo;
    @Autowired
    private LugarRepo lugarRepo;
    @Autowired
    private UsuarioRepo usuarioRepo;
    @Autowired
    private TipoLugarRepo tipoLugarRepo;
    @Autowired
    private CiudadResidenciaRepo ciudadResidenciaRepo;

    /*
    //metodo que agrega un favorito
    @Test
    public void agregarFavorito()
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

        //se crea el favorito
        Favorito favorito = new Favorito(usuario2,lugar);

        //se guarda el registro
        Favorito favoritoGuardado = favoritoRepo.save(favorito);

        //se comprueba que si se haya guardado
        Assertions.assertNotNull(favoritoGuardado);
    }
     */

    @Test
    @Sql("classpath:Favoritos.sql")
    public void agregarFavorito()
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

        //se crea el favorito
        Favorito favorito = new Favorito(usuario2,lugar);

        //se guarda el registro
        Favorito favoritoGuardado = favoritoRepo.save(favorito);

        //se comprueba que si se haya guardado
        Assertions.assertNotNull(favoritoGuardado);
    }

    /*
    //metodo que elimina un favorito
    @Test
    public void eliminarFavoritoTest()
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

        //se crea el favorito
        Favorito favorito = new Favorito(usuario2,lugar);

        //se guarda el registro
        Favorito favoritoGuardado = favoritoRepo.save(favorito);

        //se elimina el registro
        favoritoRepo.delete(favoritoGuardado);

        //se verifica que si haya sido eliminado
        Favorito favoritoEliminado = favoritoRepo.findById(1).orElse(null);
        Assertions.assertNull(favoritoEliminado);
    }
     */

    @Test
    @Sql("classpath:Favoritos.sql")
    public void eliminarFavoritoTest()
    {
        //se busca el registro a eliminar
        Favorito favorito = favoritoRepo.findById(1).orElse(null);

        //se elimina el registro
        favoritoRepo.delete(favorito);

        //se verifica que si haya sido eliminado
        Favorito favoritoEliminado = favoritoRepo.findById(1).orElse(null);
        Assertions.assertNull(favoritoEliminado);
    }

    /*
    //metodo que actualiza un favorito
    @Test
    public void actualizarFavoritoTest()
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

        //se crea el usuario
        Usuario usuario3 = new Usuario("duvan","calvo","calvo1","brrio 1234567",
                "calvo@blablabla",24, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad1);

        //se guarda el registro
        Usuario usuarioGuardado3 = usuarioRepo.save(usuario3);


        //se crea el usuario
        Usuario usuario4 = new Usuario("jhonatan","buche","buche1","brrio 12356",
                "buche@blablabla",24, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad1);

        //se guarda el registro
        Usuario usuarioGuardado4 = usuarioRepo.save(usuario4);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Hotel");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                "el mejor hotel con comida europea","brrio 123",
                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se crea el lugar
        Lugar lugar1 = new Lugar("el atardecer","3154569858",
                "el mejor hotel de toda sur america","brrio 321",
                EstadoLugar.PENDIENTE,usuario2,usuario3,tipoLugar,ciudad1);

        //se guarda el registro
        Lugar lugarGuardado1 = lugarRepo.save(lugar1);

        //se crea el favorito
        Favorito favorito = new Favorito(usuario2,lugar);

        //se guarda el registro
        Favorito favoritoGuardado = favoritoRepo.save(favorito);

        //se cambia el favorito de lugar a lugar1
        favoritoGuardado.setLugar(lugar1);

        //se guarda el registro
        favoritoRepo.save(favoritoGuardado);

        //Por último, verificamos que si haya quedado actualizado
        Favorito buscar = favoritoRepo.findById(1).orElse(null);
        Assertions.assertEquals(lugar1.getId(), buscar.getLugar().getId());
    }
     */


    @Test
    @Sql("classpath:Favoritos.sql")
    public void actualizarFavoritoTest()
    {
        //se busca el registro a modificar
        Favorito favorito = favoritoRepo.findById(1).orElse(null);

        //se cambia el id de 1 a10
        favorito.setId(10);

        //se guarda el registro
        favoritoRepo.save(favorito);

        //Por último, verificamos que si haya quedado actualizado
        Favorito buscar = favoritoRepo.findById(1).orElse(null);
        Assertions.assertEquals(10, buscar.getId());
    }

    /*
    //metodo que lista los favoritos
    @Test
    public void listarFavoritosTest()
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

        //se crea el favorito
        Favorito favorito = new Favorito(usuario2,lugar);

        //se guarda el registro
        Favorito favoritoGuardado = favoritoRepo.save(favorito);

        //se crea el favorito
        Favorito favorito1 = new Favorito(usuario3,lugar1);

        //se guarda el registro
        Favorito favoritoGuardado1 = favoritoRepo.save(favorito1);

        //se buscan todos los favoritos
        List<Favorito> lista = favoritoRepo.findAll();

        //se imprime la lista
        System.out.println(lista);
    }
     */

    @Test
    @Sql("classpath:Favoritos.sql")
    public void listarFavoritosTest()
    {
        //se buscan todos los favoritos
        List<Favorito> lista = favoritoRepo.findAll();

        //se imprime la lista
        System.out.println(lista);
    }
}
