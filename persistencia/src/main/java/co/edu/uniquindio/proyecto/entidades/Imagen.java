package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Imagen implements Serializable
{
    //lugar que posee las fotos, primary key
    @Id
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

        return lugar != null ? lugar.equals(imagen.lugar) : imagen.lugar == null;
    }

    //hash
    @Override
    public int hashCode() {
        return lugar != null ? lugar.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "lugar=" + lugar +
                ", url='" + url + '\'' +
                '}';
    }
}
