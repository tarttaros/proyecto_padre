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
public class ImagenTest
{
    @Autowired
    private ImagenRepo imagenRepo;
    @Autowired
    private LugarRepo lugarRepo;
    @Autowired
    private UsuarioRepo usuarioRepo;
    @Autowired
    private TipoLugarRepo tipoLugarRepo;
    @Autowired
    private CiudadResidenciaRepo ciudadResidenciaRepo;

    /*
    //metodo que agrega una imagen
    @Test
    public void agregarImagenTest()
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

        //se crea la imagen
        Imagen imagen = new Imagen(lugar,"https//lalaland:V.com");

        //se guarda el registro
        Imagen imagenGuardada = imagenRepo.save(imagen);

        //se guarda el registro
        Assertions.assertNotNull(imagenGuardada);
    }
     */

    @Test
    @Sql("classpath:Imagenes.sql")
    public void agregarImagenTest()
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

        //se crea la imagen
        Imagen imagen = new Imagen(lugar,"https//lalaland:V.com");

        //se guarda el registro
        Imagen imagenGuardada = imagenRepo.save(imagen);

        //se guarda el registro
        Assertions.assertNotNull(imagenGuardada);
    }

    /*
    //metodo que elimina una imagen
    @Test
    public void eliminarImagenTest()
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

        //se crea la imagen
        Imagen imagen = new Imagen(lugar,"https//lalaland:V.com");

        //se guarda el registro
        Imagen imagenGuardada = imagenRepo.save(imagen);

        //se elimina el registro
        imagenRepo.delete(imagenGuardada);

        //se verifica que si haya sido borrado
        Imagen imagenEliminada = imagenRepo.findById(1).orElse(null);
        Assertions.assertNull(imagenEliminada);
    }
     */

    @Test
    @Sql("classpath:Imagenes.sql")
    public void eliminarImagenTest()
    {
        //se busca el registro a eliminar
        Imagen imagen = imagenRepo.findById(1).orElse(null);

        //se elimina el registro
        imagenRepo.delete(imagen);

        //se verifica que si haya sido borrado
        Imagen imagenEliminada = imagenRepo.findById(1).orElse(null);
        Assertions.assertNull(imagenEliminada);
    }

    /*
    //metodo que actualiza una imagen
    @Test
    public void actualizarImagenTest()
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

        //se crea la imagen
        Imagen imagen = new Imagen(lugar,"https//lalaland:V.com");

        //se guarda el registro
        Imagen imagenGuardada = imagenRepo.save(imagen);

        //se actualiza la url de https//lalaland:V.com a https//lalaland2:v.com
        imagenGuardada.setUrl("https//lalaland2:v.com");

        //se guarda el registro
        imagenRepo.save(imagenGuardada);

        //Por último, verificamos que si haya quedado actualizado
        Imagen buscar = imagenRepo.findById(1).orElse(null);
        Assertions.assertEquals("https//lalaland2:v.com", buscar.getUrl());
    }
     */

    @Test
    @Sql("classpath:Imagenes.sql")
    public void actualizarImagenTest()
    {
        //se busca el registro a modificar
        Imagen imagen = imagenRepo.findById(1).orElse(null);

        //se actualiza la url de "hhtps//imagen1.com" a https//lalaland2:v.com
        imagen.setUrl("https//lalaland2:v.com");

        //se guarda el registro
        imagenRepo.save(imagen);

        //Por último, verificamos que si haya quedado actualizado
        Imagen buscar = imagenRepo.findById(1).orElse(null);
        Assertions.assertEquals("https//lalaland2:v.com", buscar.getUrl());
    }

    /*
    //metodo que lista las imagenes
    @Test
    public void listarImagenesTest()
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

        //se crea la imagen
        Imagen imagen = new Imagen(lugar,"https//lalaland:V.com");

        //se guarda el registro
        Imagen imagenGuardada = imagenRepo.save(imagen);

        //se crea la imagen
        Imagen imagen1 = new Imagen(lugar,"https//lalaland2:V.com");

        //se guarda el registro
        Imagen imagenGuardada1 = imagenRepo.save(imagen1);

        //se crea la imagen
        Imagen imagen2 = new Imagen(lugar,"https//lalaland3:V.com");

        //se guarda el registro
        Imagen imagenGuardada2 = imagenRepo.save(imagen2);

        //se buscan todas las imagenes
        List<Imagen> lista = imagenRepo.findAll();

        //se imprimen las imagenes
        System.out.println(lista);
    }
    */

    @Test
    @Sql("classpath:Imagenes.sql")
    public void listarImagenesTest()
    {
        //se buscan todas las imagenes
        List<Imagen> lista = imagenRepo.findAll();

        //se imprimen las imagenes
        System.out.println(lista);
    }
}
