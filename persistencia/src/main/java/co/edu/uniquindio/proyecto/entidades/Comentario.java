package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Comentario implements Serializable
{
    //local al que le hicieron el comentario, primary key
    @Id
    @ManyToOne
    private Lugar lugar;

    //usuario que hizo el comentario
    @ManyToOne
    private Usuario usuario;

    //comentario hecho al local
    @Column(name = "comentario", length = 150)
    private String comentario;

    //calificacion hecha al local
    @Column(name = "calificacion", precision = 1)
    private int calificacion;

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

        return lugar != null ? lugar.equals(that.lugar) : that.lugar == null;
    }

    //hash
    @Override
    public int hashCode() {
        return lugar != null ? lugar.hashCode() : 0;
    }
}
