package co.edu.uniquindio.proyecto.DTO;

import co.edu.uniquindio.proyecto.entidades.Lugar;

public class DatosLugarDTO
{
    Lugar lugar;

    public DatosLugarDTO(Lugar lugar)
    {
        this.lugar = lugar;
    }

    public Lugar getLugar()
    {
        return lugar;
    }

    public void setLugar(Lugar lugar)
    {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "datosLugarDadaHoraDTO{" +
                "lugar=" + lugar +
                '}';
    }
}