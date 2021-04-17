package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Usuario implements Serializable
{
    //id del usuario, primary key
    @Id
    private int id;

    //nombre del usuario
    @Column(name = "nombre", length = 100)
    private String nombre;

    //nickname del usuario
    @Column(name = "nickname", length = 100)
    private String nickname;

    //contraseña del usuario
    @Column(name = "contraseña", length = 20)
    private String contraseña;

    //direccion del usuario (para encontrar su ubicacion)
    @Column(name = "direccion", length = 100)
    private String direccion;

    //correo del usuario
    @Column(name = "correo", length = 25)
    private String correo;

    //edad del usuario
    @Column(name = "edad", precision = 2)
    private int edad;

    //estado de la cuenta de un usuario (activo - inactivo)
    private EstadoCuenta estadoCuenta;

    //tipo de usuario (administrador, moderador, usuario)
    private TipoUsuario tipoUsuario;

    //inverso de la relacion usuario-usuario
    @OneToMany(mappedBy = "listaUsuariosAdministrador")
    private List<Usuario> listaUsuarios;

    //inverso de la relacion usuario-lugar
    @OneToMany(mappedBy = "moderador")
    private List<Lugar> lugares;

    //inverso de la relacion usuario-lugar
    @OneToMany(mappedBy = "autor")
    private List<Lugar> lugaresCreados;

    //inverso de la relacion usuario-favorito
    @OneToMany(mappedBy = "usuario")
    private List<Favorito> favoritos;

    //lista de usuarios a los que tiene acceso el administrador
    @ManyToOne
    private Usuario listaUsuariosAdministrador;

    //ciudad de residencia del usuario
    @ManyToOne
    private CiudadResidencia ciudadResidencia;

    //metodo constructor de usuario
    public Usuario()
    {
        super();
    }

    //obtener el id
    public int getId() {
        return id;
    }

    //poner el id
    public void setId(int id) {
        this.id = id;
    }

    //obtener nombre
    public String getNombre() {
        return nombre;
    }

    //poner nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //obtener nickname
    public String getNickname() {
        return nickname;
    }

    //poner nickname
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    //obtener la contraseña
    public String getContraseña() {
        return contraseña;
    }

    //poner la contraseña
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //obtener la direccion
    public String getDireccion() {
        return direccion;
    }

    //poner la direccion
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //obtener el correo
    public String getCorreo() {
        return correo;
    }

    //poner le correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //obtener la edad
    public int getEdad() {
        return edad;
    }

    //poner la  edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //obtener la lista de todos los usuarios
    public Usuario getListaUsuariosAdministrador() {
        return listaUsuariosAdministrador;
    }

    //poner la lista de todos los usuarios
    public void setListaUsuariosAdministrador(Usuario listaUsuariosAdministrador) {
        this.listaUsuariosAdministrador = listaUsuariosAdministrador;
    }

    //obtener la ciudad de residencia
    public CiudadResidencia getCiudadResidencia() {
        return ciudadResidencia;
    }

    //poner la ciudad de residencia
    public void setCiudadResidencia(CiudadResidencia ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    //get del inverso de la relacion usuario-usuario
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    //set del inverso de la relacion usuario-usuario
    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    //obtener el tipo de usuario
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    //poner el tipo de usuario
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    //obtener el estado de la cuenta
    public EstadoCuenta getEstadoCuenta() {
        return estadoCuenta;
    }

    //poner el estado de la cuenta
    public void setEstadoCuenta(EstadoCuenta estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    //get del inverso de la relacion usuario-lugar
    public List<Lugar> getLugares() {
        return lugares;
    }

    //set del inverso de la relacion usuario-lugar
    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    //get del inverso de la relacion usuario-lugar
    public List<Lugar> getLugaresCreados() {
        return lugaresCreados;
    }

    //set del inverso de la relacion usuario-lugar
    public void setLugaresCreados(List<Lugar> lugaresCreados) {
        this.lugaresCreados = lugaresCreados;
    }

    //get del inverso de la relacion usuario-favorito
    public List<Favorito> getFavoritos() {
        return favoritos;
    }

    //set del inverso de la relacion usuario-favorito
    public void setFavoritos(List<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    //map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return id == usuario.id;
    }

    //hash
    @Override
    public int hashCode() {
        return id;
    }
}