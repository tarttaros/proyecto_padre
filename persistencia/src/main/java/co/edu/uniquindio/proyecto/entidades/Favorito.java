package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Favorito implements Serializable
{
    //usuario que tiene una lista de favoritos, primary key
    @Id
    @ManyToOne
    private Usuario usuario;

    //lugar añadido a la lista de favoritos de un usuario
    @ManyToOne
    private Lugar lugar;

    //metodo super
    public Favorito()
    {
        super();
    }

    //metodo constructor
    public Favorito(Usuario usuario, Lugar lugar) {
        this.usuario = usuario;
        this.lugar = lugar;
    }

    //obtiene un usuario de la lista
    public Usuario getUsuario() {
        return usuario;
    }

    //pone un usario en la lista
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //obtiene un lugar de la lista
    public Lugar getLugar() {
        return lugar;
    }

    //pone un lugar en la lista
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    //map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Favorito favorito = (Favorito) o;

        return usuario != null ? usuario.equals(favorito.usuario) : favorito.usuario == null;
    }

    //hash
    @Override
    public int hashCode() {
        return usuario != null ? usuario.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Favorito{" +
                "usuario=" + usuario +
                ", lugar=" + lugar +
                '}';
    }
}
