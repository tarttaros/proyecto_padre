package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Lugar implements Serializable
{
    //id del lugar, primary key
    @Id
    private int id;

    //nombre del local
    @Column(name = "nombre", length = 100)
    private String nombre;

    //numero telefonico del lugar
    @Column(name = "numeroTelefonico", length = 16)
    private String numeroTelefonico;

    //descripcion del lugar
    @Column(name = "descripcion", length = 150)
    private String descripcion;

    //direccion del lugar
    @Column(name = "direccion", length = 20)
    private String direccion;

    //estado del lugar ( activo, inactivo o pendiente)
    private EstadoLugar estadoLugar;

    //usuario que creo el perfil del lugar
    @ManyToOne
    private Usuario autor;

    //moderador que aprobo o rechazo el lugar
    @ManyToOne
    private Usuario moderador;

    //tipo de lugar (hotel, cafeteria, retaurante, etc)
    @ManyToOne
    private TipoLugar tipoLugar;

    //ciudad en la que se encuentra el lugar
    @ManyToOne
    private CiudadResidencia ciudadResidencia;

    //inverso de la relacion lugar-favorito
    @OneToMany(mappedBy = "lugar")
    private List<Favorito> favoritos;

    //inverso de la relacion lugar-imagenes
    @OneToMany(mappedBy = "lugar")
    private List<Imagen> imagenes;

    //inverso de la relacion lugar-comentario
    @OneToMany(mappedBy = "lugar")
    private List<Comentario> comentarios;

    //metodo constructor de lugar
    public Lugar()
    {
        super();
    }

    //obtiene el nombre del lugar
    public String getNombre() {
        return nombre;
    }

    //pone el nombre del lugar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //obtiene el numero del telefono del lugar
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    //pone el numero de telefono al lugar
    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    //obtiene la descripcion del lugar
    public String getDescripcion() {
        return descripcion;
    }

    //pone la descripcion del lugar
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //obtiene la direccion del lugar
    public String getDireccion() {
        return direccion;
    }

    //pone la direccion del lugar
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //obtiene el autor del lugar
    public Usuario getAutor() {
        return autor;
    }

    //pone el autor del lugar
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    //obtiene el moderador del lugar
    public Usuario getModerador() {
        return moderador;
    }

    //pone el moderador del lugar
    public void setModerador(Usuario moderador) {
        this.moderador = moderador;
    }

    //obtiene el tipo de lugar
    public TipoLugar getTipoLugar() {
        return tipoLugar;
    }

    //pone el tipo de lugar
    public void setTipoLugar(TipoLugar tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    //obtiene el estado del lugar
    public EstadoLugar getEstadoLugar() {
        return estadoLugar;
    }

    //pone el estado del lugar
    public void setEstadoLugar(EstadoLugar estadoLugar) {
        this.estadoLugar = estadoLugar;
    }

    //obtiene la ciudad donde se ubica el local
    public CiudadResidencia getCiudadResidencia() {
        return ciudadResidencia;
    }

    //pone el lugar donde se ubica el local
    public void setCiudadResidencia(CiudadResidencia ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    //obtiene el id del lugar
    public int getId() {
        return id;
    }

    //pone el id del lugar
    public void setId(int id) {
        this.id = id;
    }

    //get del inverso de la relacion lugar-imagen
    public List<Imagen> getImagenes() {
        return imagenes;
    }

    //set del inverso de la relacion lugar-imagen
    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    //get del inverso de la relacion lugar-favorito
    public List<Favorito> getFavoritos() {
        return favoritos;
    }

    //set del inverso de la relacion lugar-favorito
    public void setFavoritos(List<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    //get del inverso de la relacion lugar-comentario
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    //set del inverso de la relacion lugar-comentario
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    //map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lugar lugar = (Lugar) o;

        return id == lugar.id;
    }

    //hash
    @Override
    public int hashCode() {
        return id;
    }
}
