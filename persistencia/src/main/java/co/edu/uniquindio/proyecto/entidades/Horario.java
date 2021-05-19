package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
public class Horario implements Serializable
{
    //id del horario, primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //dia de la semana
    @Column(name = "dia", nullable = false, length = 100)
    private String dia;

    //hora de apertura
    @Column(name = "horaInicio", nullable = false)
    private Time horaInicio;

    //hora de cierre
    @Column(name = "horaFinal", nullable = false)
    private Time horaFinal;

    //local al que le hicieron el comentario
    @ManyToOne
    private Lugar lugar;

    //metodo super
    public Horario ()
    {
        super();
    }

    //metodo constructor
    public Horario(String dia, Time horaInicio, Time horaFinal, Lugar lugar) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.lugar = lugar;
    }

    //obtiene el id del horario
    public int getId() {
        return id;
    }

    //pone el id del horario
    public void setId(int id) {
        this.id = id;
    }

    //obtiene el dia al cual aplica el horario
    public String getDia() {
        return dia;
    }

    //pone el el dia al cual aplica el horario
    public void setDia(String dia) {
        this.dia = dia;
    }

    //obtiene la hora de apertura del local
    public Time getHoraInicio() {
        return horaInicio;
    }

    //pone la hora de apertura del local
    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    //obtiene la hora de cierre del local
    public Time getHoraFinal() {
        return horaFinal;
    }

    //pone la hora de cierre del local
    public void setHoraFinal(Time horaFinal) {
        this.horaFinal = horaFinal;
    }

    //obtiene el lugar al que le pertenece el horario
    public Lugar getLugar() {
        return lugar;
    }

    //pone el local al que le pertenece el horario
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    //metodo map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horario horario = (Horario) o;

        return id == horario.id;
    }

    //metodo hash
    @Override
    public int hashCode() {
        return id;
    }

    //metodo to string
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
