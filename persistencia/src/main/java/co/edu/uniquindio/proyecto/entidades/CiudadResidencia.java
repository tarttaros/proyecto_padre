package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class CiudadResidencia implements Serializable
{
    //codigo de la ciudad
    @Id
    @Column(name = "codigoCiudadResidencia", precision = 3)
    private int codigoCiudadResidencia;

    //nombre de la ciudad
    @Column(name = "nombreCiudadResidencia", length = 100)
    private String nombreCiudadResidencia;

    //inverso de la relacion ciudad-usuario
    @OneToMany(mappedBy = "ciudadResidencia")
    private List<Usuario> usuarios;

    //inverso de la relacion ciudad-lugar
    @OneToMany(mappedBy = "ciudadResidencia")
    private List<Lugar> lugares;

    //metodo constructor de ciudad
    public CiudadResidencia()
    {
        super();
    }

    //obtener el codigo de la ciudad
    public int getCodigoCiudadResidencia() {
        return codigoCiudadResidencia;
    }

    //poner el codigo de la ciudad
    public void setCodigoCiudadResidencia(int codigoCiudadResidencia) {
        this.codigoCiudadResidencia = codigoCiudadResidencia;
    }

    //obtener el nombre de la ciudad
    public String getNombreCiudadResidencia() {
        return nombreCiudadResidencia;
    }

    //poner el nombre de la ciudad
    public void setNombreCiudadResidencia(String nombreCiudadResidencia) {
        this.nombreCiudadResidencia = nombreCiudadResidencia;
    }

    //get del inverso de la relacion ciudad- usuario
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    //set del inverso de la relacion ciudad-usuario
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //get del inverso de la relacion ciudad-lugar
    public List<Lugar> getLugares() {
        return lugares;
    }

    //set del inverso de la relacion ciudad-lugar
    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    //map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CiudadResidencia that = (CiudadResidencia) o;

        return codigoCiudadResidencia == that.codigoCiudadResidencia;
    }

    //hash
    @Override
    public int hashCode() {
        return codigoCiudadResidencia;
    }
}
