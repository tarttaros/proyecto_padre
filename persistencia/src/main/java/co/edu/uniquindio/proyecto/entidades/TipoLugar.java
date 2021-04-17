package co.edu.uniquindio.proyecto.entidades;

import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class TipoLugar implements Serializable
{
    @Id
    private int codigoTipoLugar;

    private String nombreTipoLugar;

    @OneToMany(mappedBy = "tipoLugar")
    private List<Lugar> lugares;

    public TipoLugar() {
        super();
    }

    public int getCodigoTipoLugar() {
        return codigoTipoLugar;
    }

    public void setCodigoTipoLugar(int codigoTipoLugar) {
        this.codigoTipoLugar = codigoTipoLugar;
    }

    public String getNombreTipoLugar() {
        return nombreTipoLugar;
    }

    public void setNombreTipoLugar(String nombreTipoLugar) {
        this.nombreTipoLugar = nombreTipoLugar;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoLugar tipoLugar = (TipoLugar) o;

        return codigoTipoLugar == tipoLugar.codigoTipoLugar;
    }

    @Override
    public int hashCode() {
        return codigoTipoLugar;
    }
}