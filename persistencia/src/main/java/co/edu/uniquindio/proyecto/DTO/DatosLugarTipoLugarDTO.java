package co.edu.uniquindio.proyecto.DTO;

import co.edu.uniquindio.proyecto.entidades.Lugar;

public class DatosLugarTipoLugarDTO
{
    Lugar lugar;

    long cantidadLugares;

    public DatosLugarTipoLugarDTO(Lugar lugar, long cantidadLugares)
    {
        this.lugar = lugar;
        this.cantidadLugares = cantidadLugares;
    }
    public Lugar getLugar()
    {
        return lugar;
    }

    public void setLugar(Lugar lugar)
    {
        this.lugar = lugar;
    }

    public long getCantidadLugares() {
        return cantidadLugares;
    }

    public void setCantidadLugares(long cantidadLugares) {
        this.cantidadLugares = cantidadLugares;
    }

    @Override
    public String toString() {
        return "DatosLugarTipoLugarDTO{" +
                "lugar=" + lugar +
                ", cantidadLugares=" + cantidadLugares +
                '}';
    }
}