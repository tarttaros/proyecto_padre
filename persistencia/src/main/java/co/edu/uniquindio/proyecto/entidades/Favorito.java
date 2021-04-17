package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Favorito implements Serializable
{
    @Id
    private int id;
    
    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Lugar lugar;

    public Favorito()
    {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Favorito favorito = (Favorito) o;

        return id == favorito.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
