package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Comentario implements Serializable
{
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //local al que le hicieron el comentario
    @ManyToOne
    private Lugar lugar;

    //usuario que hizo el comentario
    @ManyToOne
    private Usuario usuario;

    //comentario hecho al local
    @Column(name = "comentario", nullable = false, length = 150)
    private String comentario;

    //calificacion hecha al local (al imprimir este dato hay que sumar uno)
    @Column(name = "calificacion", nullable = false, precision = 1)
    private int calificacion;

    //metodo super
    public Comentario()
    {
        super();
    }

    //metodo constructor
    public Comentario(Lugar lugar, Usuario usuario, String comentario, int calificacion) {
        this.lugar = lugar;
        this.usuario = usuario;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    //obtiene el id
    public int getId() {
        return id;
    }

    //pone el id
    public void setId(int id) {
        this.id = id;
    }

    //obtiene el local al que le hicieron el comentario
    public Lugar getLugar() {
        return lugar;
    }

    //pone el local al que le van a hacer el comentario
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    //obtiene el usuario que hizo el comentario
    public Usuario getUsuario() {
        return usuario;
    }

    //pone el usuario que va a hacer el comentario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //obtiene el comentario
    public String getComentario() {
        return comentario;
    }

    //pone el comentario
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    //obtiene la calificacion del local
    public int getCalificacion() {
        return calificacion;
    }

    //pone la calificacion del local
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    //map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comentario that = (Comentario) o;

        return id == that.id;
    }

    //hash
    @Override
    public int hashCode() {
        return id;
    }

    //metodo to String
    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", lugar=" + lugar +
                ", usuario=" + usuario +
                ", comentario='" + comentario + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}
