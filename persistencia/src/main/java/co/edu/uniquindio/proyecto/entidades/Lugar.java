package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Lugar implements Serializable
{
    //id del lugar, primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //nombre del local
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    //numero telefonico del lugar
    @Column(name = "numeroTelefonico", nullable = false, length = 16)
    private String numeroTelefonico;

    //descripcion del lugar
    @Column(name = "descripcion", nullable = false, length = 150)
    private String descripcion;

    //direccion del lugar
    @Column(name = "direccion", nullable = false, length = 20)
    private String direccion;

    //estado del lugar ( activo, inactivo o pendiente)
    @JoinColumn(name = "estadoLugar", nullable = false)
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

    //inverso de la relacion lugar-horario
    @OneToMany(mappedBy = "lugar")
    private List<Horario> horario;

    //inverso de la relacion lugar-favorito
    @OneToMany(mappedBy = "lugar")
    private List<Favorito> favoritos;

    //inverso de la relacion lugar-imagenes
    @OneToMany(mappedBy = "lugar")
    private List<Imagen> imagenes;

    //inverso de la relacion lugar-comentario
    @OneToMany(mappedBy = "lugar")
    private List<Comentario> comentarios;

    //metodo super
    public Lugar()
    {
        super();
    }

    //metodo constructor
    public Lugar(String nombre, String numeroTelefonico, String descripcion, String direccion, EstadoLugar estadoLugar,
                 Usuario autor, Usuario moderador, TipoLugar tipoLugar, CiudadResidencia ciudadResidencia) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.estadoLugar = estadoLugar;
        this.autor = autor;
        this.moderador = moderador;
        this.tipoLugar = tipoLugar;
        this.ciudadResidencia = ciudadResidencia;
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

    //obtiene las imagenes del lugar
    public List<Imagen> getImagenes() {
        return imagenes;
    }

    //set del inverso de la relacion lugar-imagen
    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    //obtiene los favoritos en los que esta el lugar
    public List<Favorito> getFavoritos() {
        return favoritos;
    }

    //set del inverso de la relacion lugar-favorito
    public void setFavoritos(List<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    //obtiene los comentarios del lugar
    public List<Comentario> getComentarios() {
        return comentarios;
    }

    //set del inverso de la relacion lugar-comentario
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    //obtiene la lista de horarios del lugar
    public List<Horario> getHorario() {
        return horario;
    }

    //set del inverso de la relacion lugar-horario
    public void setHorario(List<Horario> horario) {
        this.horario = horario;
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

    //metodo to string
    @Override
    public String toString() {
        return "Lugar{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estadoLugar=" + estadoLugar +
                ", autor=" + autor +
                ", moderador=" + moderador +
                ", tipoLugar=" + tipoLugar +
                ", ciudadResidencia=" + ciudadResidencia +
                '}';
    }
}
