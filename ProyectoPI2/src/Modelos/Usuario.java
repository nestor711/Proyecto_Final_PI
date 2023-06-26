/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Eider
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String nick;
    private String contrasena;
    private String domicilio;
    private String telefono;
    private String correo;
    private String tipoUsuario;

    public Usuario() {
        this.nombre = "";
        this.apellido = "";
        this.nick = "";
        this.contrasena = "";
        this.domicilio = "";
        this.telefono = "";
        this.correo = "";
        this.tipoUsuario = "";
    }

    public Usuario(String nombre, String apellido, String nick, String contrasena, String domicilio, String telefono, String correo, String tipoUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.contrasena = contrasena;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
