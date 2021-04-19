package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.CiudadResidencia;
import co.edu.uniquindio.proyecto.entidades.EstadoCuenta;
import co.edu.uniquindio.proyecto.entidades.TipoUsuario;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.repositorios.CiudadResidenciaRepo;
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
public class UsuarioTest
{
    @Autowired
    private UsuarioRepo usuarioRepo;
    @Autowired
    private CiudadResidenciaRepo ciudadResidenciaRepo;

    /*
    //etodo que agrega un usuario
    @Test
    public void registrarUsuarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                                    "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se comprueba de que si se haya guardado
        Assertions.assertNotNull(usuarioGuardado);
    }
     */

    @Test
    @Sql("classpath:Usuarios.sql")
    public void registrarUsuarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se comprueba de que si se haya guardado
        Assertions.assertNotNull(usuarioGuardado);
    }

    /*
    //metodo que elimina un usuario
    @Test
    public void eliminarUsuarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                                     "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se elimina el registro
        usuarioRepo.delete(usuarioGuardado);

        //se verifica que si haya sido borrado
        Usuario usuarioEliminado = usuarioRepo.findById(1).orElse(null);
        Assertions.assertNull(usuarioEliminado);
    }
     */

    @Test
    @Sql("classpath:Usuarios.sql")
    public void eliminarUsuarioTest()
    {
        // se busca el registro a eliminar
        Usuario usuario = usuarioRepo.findById(1).orElse(null);

        //se elimina el registro
        usuarioRepo.delete(usuario);

        //se verifica que si haya sido borrado
        Usuario usuarioEliminado = usuarioRepo.findById(1).orElse(null);
        Assertions.assertNull(usuarioEliminado);
    }

    /*
    //metodo que actualiza la informacion de un usuario
    @Test
    public void actualizarUsuarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario
        Usuario usuario = new Usuario("yuliam","nano","nano1","brrio 123",
                                    "nano@blablabla",16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se cambia el estado de usuario a administrador
        usuarioGuardado.setTipoUsuario(TipoUsuario.ADMINISTRADOR);

        //se guarda el registro
        usuarioRepo.save(usuarioGuardado);

        //Por último, verificamos que si haya quedado actualizado
        Usuario buscado = usuarioRepo.findById(1).orElse(null);
        Assertions.assertEquals(TipoUsuario.ADMINISTRADOR, buscado.getTipoUsuario());
    }
     */

    @Test
    @Sql("classpath:Usuarios.sql")
    public void actualizarUsuarioTest()
    {
        //se busca el usuario a modificar por el id
        Usuario usuario = usuarioRepo.findById(1).orElse(null);

        //se modifica el correo del usuario 1
        usuario.setCorreo("321@lalala");

        //se guarda el registro
        usuarioRepo.save(usuario);

        //Por último, verificamos que si haya quedado actualizado
        Usuario buscado = usuarioRepo.findById(1).orElse(null);
        Assertions.assertEquals(TipoUsuario.USUARIO, buscado.getTipoUsuario());
    }

    /*
    //metodo que lista los usuarios
    @Test
    public void listarUsuariosTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadGuardada = ciudadResidenciaRepo.save(ciudad);

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

        //Obtenemos la lista de todos los usuarios
        List<Usuario> lista = usuarioRepo.findAll();

        //Imprimimos la lista
        System.out.println(lista);
    }
    */

    @Test
    @Sql("classpath:Usuarios.sql")
    public void listarUsuariosTest()
    {
        //Obtenemos la lista de todos los usuarios
        List<Usuario> lista = usuarioRepo.findAll();

        //Imprimimos la lista
        System.out.println(lista);
    }

}
