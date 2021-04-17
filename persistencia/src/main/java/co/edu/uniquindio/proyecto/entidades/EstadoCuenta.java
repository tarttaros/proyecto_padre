package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class EstadoCuenta implements Serializable
{
    @Id
    private int codigoEstadoCuenta;

    private String nombreEstadoCuenta;

    @OneToOne(mappedBy = "estadoCuenta")
    private Usuarios usuario;

    public EstadoCuenta ()
    {
        super();
    }

    public int getCodigoEstadoCuenta() {
        return codigoEstadoCuenta;
    }

    public void setCodigoEstadoCuenta(int codigoEstadoCuenta) {
        this.codigoEstadoCuenta = codigoEstadoCuenta;
    }

    public String getNombreEstadoCuenta() {
        return nombreEstadoCuenta;
    }

    public void setNombreEstadoCuenta(String nombreEstadoCuenta) {
        this.nombreEstadoCuenta = nombreEstadoCuenta;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstadoCuenta that = (EstadoCuenta) o;

        return codigoEstadoCuenta == that.codigoEstadoCuenta;
    }

    @Override
    public int hashCode() {
        return codigoEstadoCuenta;
    }
}
