package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.Favorito;
import co.edu.uniquindio.proyecto.entidades.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritoRepo extends JpaRepository<Favorito, Integer>
{
    @Query("select l from Favorito f, in (f.lugar) l where f.usuario.correo = :correoUsuario")
    List<Lugar> favoritosUsuario(@Param("correoUsuario") String correoUsuario);
}
