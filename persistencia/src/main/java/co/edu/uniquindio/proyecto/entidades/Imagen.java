package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Imagen implements Serializable
{
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //lugar que posee las fotos
    @ManyToOne
    private Lugar lugar;

    //url de la foto
    @Column(name = "url", nullable = false, length = 100)
    private String url;

    //metoco super
    public Imagen()
    {
        super();
    }

    //metodo constructor
    public Imagen(Lugar lugar, String url) {
        this.lugar = lugar;
        this.url = url;
    }

    //obtiene el id
    public int getId() {
        return id;
    }

    //pone el id
    public void setId(int id) {
        this.id = id;
    }

    //obtiene la url de una imagen
    public String getUrl() {
        return url;
    }

    //pone la url de la imagen
    public void setUrl(String url) {
        this.url = url;
    }

    //obtiene un lugar
    public Lugar getLugar() {
        return lugar;
    }

    //pone un lugar
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    //map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Imagen imagen = (Imagen) o;

        return id == imagen.id;
    }

    //hash
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "id=" + id +
                ", lugar=" + lugar +
                ", url='" + url + '\'' +
                '}';
    }
}
