package co.edu.uniquindio.proyecto.entidades;

import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class TipoLugar implements Serializable
{
    //codigo del tipo de local
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoTipoLugar")
    private int codigoTipoLugar;

    //nombre del tipo de local
    @Column(name = "nombreTipoLugar", nullable = false, length = 100)
    private String nombreTipoLugar;

    //inverso de la relacion tipolugar-lugar
    @OneToMany(mappedBy = "tipoLugar")
    private List<Lugar> lugares;

    //meotodo super
    public TipoLugar() {
        super();
    }

    //metodo constructor
    public TipoLugar(String nombreTipoLugar) {
        this.nombreTipoLugar = nombreTipoLugar;
    }

    //obtener el codigo del tipo de local
    public int getCodigoTipoLugar() {
        return codigoTipoLugar;
    }

    //poner el codigo del tipo de local
    public void setCodigoTipoLugar(int codigoTipoLugar) {
        this.codigoTipoLugar = codigoTipoLugar;
    }

    //obtener el nombre del tipo de local
    public String getNombreTipoLugar() {
        return nombreTipoLugar;
    }

    //poner el nombre del tipo de local
    public void setNombreTipoLugar(String nombreTipoLugar) {
        this.nombreTipoLugar = nombreTipoLugar;
    }

    //get del inverso de la relacion tipolugar-lugar
    public List<Lugar> getLugares() {
        return lugares;
    }

    //set del inverso de la relacion tipolugar-lugar
    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    //map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoLugar tipoLugar = (TipoLugar) o;

        return codigoTipoLugar == tipoLugar.codigoTipoLugar;
    }

    //hash
    @Override
    public int hashCode() {
        return codigoTipoLugar;
    }

    //metodo to String
    @Override
    public String toString() {
        return "TipoLugar{" +
                "codigoTipoLugar=" + codigoTipoLugar +
                ", nombreTipoLugar='" + nombreTipoLugar + '\'' +
                '}';
    }
}