package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class CiudadResidencia implements Serializable
{
    @Id
    private int codigoCiudadResidencia;

    private String nombreCiudadResidencia;

    @OneToOne(mappedBy = "ciudadResidencia")
    private Usuarios usuario;

    public CiudadResidencia()
    {
        super();
    }

    public int getCodigoCiudadResidencia() {
        return codigoCiudadResidencia;
    }

    public void setCodigoCiudadResidencia(int codigoCiudadResidencia) {
        this.codigoCiudadResidencia = codigoCiudadResidencia;
    }

    public String getNombreCiudadResidencia() {
        return nombreCiudadResidencia;
    }

    public void setNombreCiudadResidencia(String nombreCiudadResidencia) {
        this.nombreCiudadResidencia = nombreCiudadResidencia;
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

        CiudadResidencia that = (CiudadResidencia) o;

        return codigoCiudadResidencia == that.codigoCiudadResidencia;
    }

    @Override
    public int hashCode() {
        return codigoCiudadResidencia;
    }
}
