package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
public class Horario implements Serializable
{
    //primary key
    @Id
    private int id;

    //dia de la semana
    private String dia;

    //hora de apertura
    @Temporal(TemporalType.TIME)
    private Time horaInicio;

    //hora de cierre
    @Temporal(TemporalType.TIME)
    private Time horaFinal;

    //local al que le hicieron el comentario
    @ManyToOne
    private Lugar lugar;

    public Horario ()
    {
        super();
    }

    public Horario(int id, String dia, Time horaInicio, Time horaFinal, Lugar lugar) {
        this.id = id;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.lugar = lugar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
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

        Horario horario = (Horario) o;

        return id == horario.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "id=" + id +
                ", dia='" + dia + '\'' +
                ", horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                ", lugar=" + lugar +
                '}';
    }
}
