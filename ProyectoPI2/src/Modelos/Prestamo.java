/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Eider
 */
public class Prestamo {

    private String nombreResponsable;
    private String fechaSalida;
    private String fechaRetorno;
    private String lugarDestion;
    private String estadoEquipo;
    private String actividades;
    private String unEquipo;

    public Prestamo() {
        this.nombreResponsable = "";
        this.fechaSalida = "";
        this.fechaRetorno = "";
        this.lugarDestion = "";
        this.estadoEquipo = "";
        this.actividades = "";
        this.unEquipo = "";
    }

    public Prestamo(String nombreResponsable, String fechaSalida, String fechaRetorno, String lugarDestion, String estadoEquipo, String actividades, String unEquipo) {
        this.nombreResponsable = nombreResponsable;
        this.fechaSalida = fechaSalida;
        this.fechaRetorno = fechaRetorno;
        this.lugarDestion = lugarDestion;
        this.estadoEquipo = estadoEquipo;
        this.actividades = actividades;
        this.unEquipo = unEquipo;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(String fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public String getLugarDestion() {
        return lugarDestion;
    }

    public void setLugarDestion(String lugarDestion) {
        this.lugarDestion = lugarDestion;
    }

    public String getEstadoEquipo() {
        return estadoEquipo;
    }

    public void setEstadoEquipo(String estadoEquipo) {
        this.estadoEquipo = estadoEquipo;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getUnEquipo() {
        return unEquipo;
    }

    public void setUnEquipo(String unEquipo) {
        this.unEquipo = unEquipo;
    }

}
