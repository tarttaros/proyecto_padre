package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class CiudadResidencia implements Serializable
{
    @Id
    private int codigoCiudadResidencia;

    private String nombreCiudadResidencia;

    @OneToMany(mappedBy = "ciudadResidencia")
    private List<Usuario> usuarios;

    @OneToMany(mappedBy = "ciudadResidencia")
    private List<Lugar> lugares;

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

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
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

        CiudadResidencia that = (CiudadResidencia) o;

        return codigoCiudadResidencia == that.codigoCiudadResidencia;
    }

    @Override
    public int hashCode() {
        return codigoCiudadResidencia;
    }
}
