package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.Comentario;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComentarioRepo extends JpaRepository<Comentario, Integer>
{
    @Query("select c from Comentario c where c.calificacion >= :calificacion")
    List<Comentario> comentariosPorCalificacion(@Param("calificacion") int calificacion);

    @Query("select c from Comentario c where c.usuario.nombre = :nombreUsuario")
    List<Comentario> comentariosPorUsuario(@Param("nombreUsuario")String nombreUsuario);

    @Query("select c from Comentario c where c.lugar.nombre = :nombreLugar")
    List<Comentario> comentariosPorLugar(@Param("nombreLugar") String nombreLugar);

    @Query("select distinct u from Comentario c inner join c.usuario u where c.lugar.nombre = :nombreLugar")
    List<Usuario> usuariosComentaronLugar(@Param("nombreLugar") String nombreLugar);

    @Query("select count (c) from Comentario c where c.lugar.nombre = :nombreLocal")
    int cantidadComentariosLugar(@Param("nombreLocal") String nombreLocal);
}
