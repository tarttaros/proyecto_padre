package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Imagen implements Serializable
{
    @Id
    private String url;

    @ManyToOne
    private Lugar lugar;

    public Imagen()
    {
        super();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

        Imagen imagen = (Imagen) o;

        return url.equals(imagen.url);
    }

    @Override
    public int hashCode() {
        return url.hashCode();
    }
}
