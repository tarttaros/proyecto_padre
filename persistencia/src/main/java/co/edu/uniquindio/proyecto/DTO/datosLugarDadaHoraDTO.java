package co.edu.uniquindio.proyecto.DTO;

import co.edu.uniquindio.proyecto.entidades.Lugar;

public class datosLugarDadaHoraDTO
{
    Lugar lugar;

    public datosLugarDadaHoraDTO(Lugar lugar)
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
