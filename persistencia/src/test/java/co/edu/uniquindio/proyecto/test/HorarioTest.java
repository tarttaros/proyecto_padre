package co.edu.uniquindio.proyecto.test;

import co.edu.uniquindio.proyecto.entidades.*;
import co.edu.uniquindio.proyecto.repositorios.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class HorarioTest
{
    @Autowired
    private HorarioRepo horarioRepo;
    @Autowired
    private LugarRepo lugarRepo;
    @Autowired
    private UsuarioRepo usuarioRepo;
    @Autowired
    private TipoLugarRepo tipoLugarRepo;
    @Autowired
    private CiudadResidenciaRepo ciudadResidenciaRepo;

    /*
    //metodo de prueba del guardado de un horario de cierto local
    @Test
    public void agregarHorarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario 1
        Usuario usuario = new Usuario("yuliam", "nano", "nano1", "brrio 123",
                "nano@blablabla", 16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO, ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario 2
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
                "el mejor restaurant de comida europea","brrio 123",
                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se crea la hora de apertura
        Date horaInicial = Time.valueOf("08:00:00");

        //se crea la hora de cierre
        Date horaFinal = Time.valueOf("20:00:00");

        //se crea el registro
        Horario horario = new Horario("lunes",horaInicial,horaFinal,lugar);

        //se guarda el registro
        Horario horarioGuardado = horarioRepo.save(horario);

        //se verifica el guardado del registro
        Assertions.assertNotNull(horarioGuardado);
    }

    */

    @Test
    @Sql("classpath:Horarios.sql")
    public void agregarHorarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario 1
        Usuario usuario = new Usuario("yuliam", "nano", "nano1", "brrio 123",
                "nano@blablabla", 16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO, ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario 2
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
                "el mejor restaurant de comida europea","brrio 123",
                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se crea la hora de apertura
        Date horaInicial = Time.valueOf("08:00:00");

        //se crea la hora de cierre
        Date horaFinal = Time.valueOf("20:00:00");

        //se crea el registro
        Horario horario = new Horario("lunes",horaInicial,horaFinal,lugar);

        //se guarda el registro
        Horario horarioGuardado = horarioRepo.save(horario);

        //se verifica el guardado del registro
        Assertions.assertNotNull(horarioGuardado);
    }


    /*
    //metodo de prueba de la eliminacion de un horario de cierto local
    @Test
    public void eliminarHorarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario 1
        Usuario usuario = new Usuario("yuliam", "nano", "nano1", "brrio 123",
                "nano@blablabla", 16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO, ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario 2
        Usuario usuario1 = new Usuario("josh","apa","apa1","brrio 1234",
                "apa@blablabla",21, EstadoCuenta.ACTIVA, TipoUsuario.MODERADOR,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado1 = usuarioRepo.save(usuario1);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Restaurante");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                "el mejor restaurant de comida europea","brrio 123",
                EstadoLugar.APROBADO,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se crea la hora de apertura
        Date horaInicial = Time.valueOf("08:00:00");

        //se crea la hora de cierre
        Date horaFinal = Time.valueOf("20:00:00");

        //se crea el registro
        Horario horario = new Horario("lunes",horaInicial,horaFinal,lugar);

        //se guarda el registro
        Horario horarioGuardado = horarioRepo.save(horario);

        //se elimina el registro
        horarioRepo.delete(horarioGuardado);

        //se verifica que si haya sido borrado
        Horario horarioEliminado = horarioRepo.findById(1).orElse(null);
        Assertions.assertNull(horarioEliminado);
    }
    */
    //metodo de prueba de la eliminacion de un horario de cierto local
    @Test
    @Sql("classpath:Horarios.sql")
    public void eliminarHorarioTest()
    {
        //se busca el horario a eliminar
        Horario horarioGuardado = horarioRepo.findById(1).orElse(null);

        //se elimina el registro
        horarioRepo.delete(horarioGuardado);

        //se verifica que si haya sido borrado
        Horario horarioEliminado = horarioRepo.findById(1).orElse(null);
        Assertions.assertNull(horarioEliminado);
    }


    /*
    @Test
    public void actualizarHorarioTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario 1
        Usuario usuario = new Usuario("yuliam", "nano", "nano1", "brrio 123",
                "nano@blablabla", 16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO, ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario 2
        Usuario usuario1 = new Usuario("josh","apa","apa1","brrio 1234",
                "apa@blablabla",21, EstadoCuenta.ACTIVA, TipoUsuario.MODERADOR,ciudad);

        //se guarda el registro
        Usuario usuarioGuardado1 = usuarioRepo.save(usuario1);

        //se crea el tipo de lugar
        TipoLugar tipoLugar = new TipoLugar("Restaurante");

        //se guarda el registro
        TipoLugar tipoLugarGuardado = tipoLugarRepo.save(tipoLugar);

        //se crea el lugar
        Lugar lugar = new Lugar("5ta Sinfonia","3158589654",
                "el mejor restaurant de comida europea","brrio 123",
                EstadoLugar.APROBADO,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se crea la hora de apertura
        Date horaInicial = Time.valueOf("08:00:00");

        //se crea la hora de cierre
        Date horaFinal = Time.valueOf("20:00:00");

        //se crea el registro
        Horario horario = new Horario("lunes",horaInicial,horaFinal,lugar);

        //se guarda el registro
        Horario horarioGuardado = horarioRepo.save(horario);

        //se busca el registro a modificar
        Horario horarioEditar = horarioRepo.findById(1).orElse(null);

        //se modifica el horario
        horarioEditar.setDia("martes");

        //se guarda el registro
        horarioRepo.save(horarioEditar);

        //Por último, verificamos que si haya quedado actualizado
        Horario buscar = horarioRepo.findById(1).orElse(null);
        Assertions.assertEquals("martes", buscar.getDia());
    }
    */

    @Test
    @Sql("classpath:Horarios.sql")
    public void actualizarHorarioTest()
    {
        //se busca el registro a modificar
        Horario horarioEditar = horarioRepo.findById(1).orElse(null);

        //se modifica el horario
        horarioEditar.setDia("martes");

        //se guarda el registro
        horarioRepo.save(horarioEditar);

        //Por último, verificamos que si haya quedado actualizado
        Horario buscar = horarioRepo.findById(1).orElse(null);
        Assertions.assertEquals("martes", buscar.getDia());
    }


    /*
    @Test
    public void listarHorariosTest()
    {
        //se crea la ciudad
        CiudadResidencia ciudad = new CiudadResidencia("Montenegro");

        //se guarda el registro
        CiudadResidencia ciudadResidenciaGuardado = ciudadResidenciaRepo.save(ciudad);

        //se crea el usuario 1
        Usuario usuario = new Usuario("yuliam", "nano", "nano1", "brrio 123",
                "nano@blablabla", 16, EstadoCuenta.ACTIVA, TipoUsuario.USUARIO, ciudad);

        //se guarda el registro
        Usuario usuarioGuardado = usuarioRepo.save(usuario);

        //se crea el usuario 2
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
                "el mejor restaurant de comida europea","brrio 123",
                EstadoLugar.PENDIENTE,usuario,usuario1,tipoLugar,ciudad);

        //se guarda el registro
        Lugar lugarGuardado = lugarRepo.save(lugar);

        //se crea la hora de apertura
        Date horaInicial = Time.valueOf("08:00:00");

        //se crea la hora de cierre
        Date horaFinal = Time.valueOf("20:00:00");

        //se crea el registro
        Horario horario = new Horario("lunes",horaInicial,horaFinal,lugar);

        //se guarda el registro
        Horario horarioGuardado = horarioRepo.save(horario);

        //se crea el horario 2
        Horario horario1= new Horario("martes",horaInicial,horaFinal,lugar);

        //se guarda el horario 2
        Horario horarioGuardado1 = horarioRepo.save(horario1);

        //se crea el horario 3
        Horario horario2 = new Horario("miercoles",horaInicial,horaFinal,lugar);

        //se guarda el horario 3
        Horario horarioGuardado2 = horarioRepo.save(horario2);

        //se crea el horario 4
        Horario horario3 = new Horario("jueves",horaInicial,horaFinal,lugar);

        //se guarda el horario 4
        Horario horarioGuardado3 = horarioRepo.save(horario3);

        //se crea el horario 5
        Horario horario4 = new Horario("viernes",horaInicial,horaFinal,lugar);

        //se guarda el horario 5
        Horario horarioGuardado4 = horarioRepo.save(horario4);

        //se buscan todos los horarios
        List<Horario> lista = horarioRepo.findAll();

        //se imprimen todos los horarios
        System.out.println(lista);
    }
     */

    @Test
    @Sql("classpath:Horarios.sql")
    public void listarHorariosTest()
    {
        //se buscan todos los horarios
        List<Horario> lista = horarioRepo.findAll();

        //se imprimen todos los horarios
        System.out.println(lista);
    }

}
