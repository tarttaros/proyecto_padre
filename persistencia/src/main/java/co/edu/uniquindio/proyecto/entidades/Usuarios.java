package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Usuarios implements Serializable
{
    @Id
    private int id;

    private String nombre;
    private String nickname;
    private String contraseña;
    private String direccion;
    private String correo;
    private int edad;

    @OneToMany(mappedBy = "administrador")
    private List<Usuarios> listaUsuarios;

    @OneToOne
    private TipoUsuario tipoUsuario;

    @OneToOne
    private EstadoCuenta estadoCuenta;

    @ManyToOne
    private Usuarios administrador;

    @OneToOne
    private CiudadResidencia ciudadResidencia;

    public Usuarios ()
    {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Usuarios getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuarios administrador) {
        this.administrador = administrador;
    }

    public CiudadResidencia getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(CiudadResidencia ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public List<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public EstadoCuenta getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(EstadoCuenta estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuarios usuarios = (Usuarios) o;

        return id == usuarios.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
