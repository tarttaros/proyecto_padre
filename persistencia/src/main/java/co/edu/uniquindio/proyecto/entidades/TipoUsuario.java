package co.edu.uniquindio.proyecto.entidades;

import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class TipoUsuario implements Serializable
{
    @Id
    private int codigoTipoUsuario;

    private String nombreTipoUsuario;

    @OneToOne(mappedBy = "tipoUsuario")
    private Usuarios usuario;

    public TipoUsuario ()
    {
        super();
    }

    public int getCodigoTipoUsuario() {
        return codigoTipoUsuario;
    }

    public void setCodigoTipoUsuario(int codigoTipoUsuario) {
        this.codigoTipoUsuario = codigoTipoUsuario;
    }

    public String getNombreTipoUsuario() {
        return nombreTipoUsuario;
    }

    public void setNombreTipoUsuario(String nombreTipoUsuario) {
        this.nombreTipoUsuario = nombreTipoUsuario;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoUsuario that = (TipoUsuario) o;

        return codigoTipoUsuario == that.codigoTipoUsuario;
    }

    @Override
    public int hashCode() {
        return codigoTipoUsuario;
    }
}
