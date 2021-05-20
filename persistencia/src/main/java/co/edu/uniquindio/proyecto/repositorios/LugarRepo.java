package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.DTO.datosLugarDadaHoraDTO;
import co.edu.uniquindio.proyecto.entidades.EstadoLugar;
import co.edu.uniquindio.proyecto.entidades.Lugar;
import co.edu.uniquindio.proyecto.entidades.TipoLugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LugarRepo extends JpaRepository<Lugar, Integer>
{
    @Query("select l from Lugar l where l.ciudadResidencia.nombreCiudadResidencia = :nombreCiudad")
    List<Lugar> lugaresPorCiudad(@Param("nombreCiudad")String NombreCiudad);

    @Query("select l from Lugar l where l.tipoLugar.nombreTipoLugar = :tipoLugar")
    List<Lugar> lugaresPorTipo(@Param("tipoLugar") String tipoLugar);

    @Query("select l from Lugar l where l.moderador.nombre = :nombreModerador and l.estadoLugar = :estadoLugar")
    List<Lugar> lugaresPorModerador(@Param("nombreModerador") String nombreModerador, @Param("estadoLugar") EstadoLugar estadoLugar);

    @Query("select l.tipoLugar from Lugar l where l.id = :id")
    List<TipoLugar> tipoLugarPorId(@Param("id") int id );

    @Query("select l,c from Lugar l left join l.comentarios c")
    List<Object[]> lugaresYComentarios();

    @Query("select l.nombre,l.descripcion,l.ciudadResidencia,l.tipoLugar from Lugar l where l.moderador.correo = :correoModerador and l.estadoLugar = :estadoLugar")
    List<Object[]> datosLugarAprobadoPorModerador(@Param("correoModerador") String correoModerador, @Param("estadoLugar") EstadoLugar estadoLugar);

    @Query("select new co.edu.uniquindio.proyecto.DTO.datosLugarDadaHoraDTO(l) from Lugar l join l.horario h where h.dia = :diaSemana and h.horaInicio < :hora and h.horaFinal > :hora1")
    List<datosLugarDadaHoraDTO> datosLugarDadaHora(@Param("diaSemana") String diaSemana, @Param("hora") Date hora, @Param("hora1") Date hora1);

}
