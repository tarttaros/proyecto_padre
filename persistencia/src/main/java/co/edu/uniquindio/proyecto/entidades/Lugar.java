package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Lugar implements Serializable
{
    @Id
    private int id;

    private String nombre;

    private String numeroTelefonico;

    private String descripcion;

    private String direccion;

    private EstadoLugar estadoLugar;

    @ManyToOne
    private Usuario autor;

    @ManyToOne
    private Usuario moderador;

    @ManyToOne
    private TipoLugar tipoLugar;

    @ManyToOne
    private CiudadResidencia ciudadResidencia;

    @OneToMany(mappedBy = "lugar")
    private List<Favorito> favoritos;

    @OneToMany(mappedBy = "lugar")
    private List<Imagen> imagenes;

    public Lugar()
    {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Usuario getModerador() {
        return moderador;
    }

    public void setModerador(Usuario moderador) {
        this.moderador = moderador;
    }

    public TipoLugar getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(TipoLugar tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    public EstadoLugar getEstadoLugar() {
        return estadoLugar;
    }

    public void setEstadoLugar(EstadoLugar estadoLugar) {
        this.estadoLugar = estadoLugar;
    }

    public CiudadResidencia getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(CiudadResidencia ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public List<Favorito> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lugar lugar = (Lugar) o;

        return id == lugar.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
