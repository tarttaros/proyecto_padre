package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Favorito implements Serializable {
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //usuario que tiene una lista de favoritos
    @ManyToOne
    private Usuario usuario;

    //lugar añadido a la lista de favoritos de un usuario
    @ManyToOne
    private Lugar lugar;

    //metodo super
    public Favorito() {
        super();
    }

    //metodo constructor
    public Favorito(Usuario usuario, Lugar lugar) {
        this.usuario = usuario;
        this.lugar = lugar;
    }

    //obtiene el id
    public int getId() {
        return id;
    }

    //pone el id
    public void setId(int id) {
        this.id = id;
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

        return id == favorito.id;
    }

    //hash
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Favorito{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", lugar=" + lugar +
                '}';
    }
}
