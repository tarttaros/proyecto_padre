package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.TipoUsuario;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer>
{
    @Query("select u from Usuario u where u.nombre = :nombreUsuario")
    List<Usuario> buscarPorNombre(@Param("nombreUsuario") String nombre);

    Usuario findUsuarioByCorreoAndContrasena(String correo, String contraseña);

    @Query("select u from Usuario u")
    List<Usuario> buscarUsuarios(Pageable pageable);

    @Query("select u from Usuario u")
    List<Usuario> buscarUsuariosOrdenado(Sort sort);

    @Query("select u from Usuario u where u.tipoUsuario = :tipoUsuario or u.tipoUsuario = :tipoUsuario1 ")
    List<Usuario> administradoresYModeradores(@Param("tipoUsuario")TipoUsuario tipoUsuario,@Param("tipoUsuario1")TipoUsuario tipoUsuario1);

    @Query("select u.correo, l from Usuario u left join u.lugaresCreados l ")
    List<Object[]> correosUsuariosAutores();
}
