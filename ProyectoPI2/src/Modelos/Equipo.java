/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Objects;

/**
 *
 * @author USER
 */
public class Equipo {

    private String codigoEquipo;
    private String responsable;
    private String frecuenciaMantenimiento;
    private String ultimoMantenimiento;
    private String proximoMantenimiento;
    private String ubicacionActual;
    private String FechaCompra;
    private String estado;

    public Equipo() {
       
    }

    public Equipo(String codigoEquipo, String responsable, String frecuenciaMantenimiento, String ultimoMantenimiento, String proximoMantenimiento, String ubicacionActual, String FechaCompra, String estado) {
        this.codigoEquipo = codigoEquipo;
        this.responsable = responsable;
        this.frecuenciaMantenimiento = frecuenciaMantenimiento;
        this.ultimoMantenimiento = ultimoMantenimiento;
        this.proximoMantenimiento = proximoMantenimiento;
        this.ubicacionActual = ubicacionActual;
        this.FechaCompra = FechaCompra;
        this.estado = estado;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getFrecuenciaMantenimiento() {
        return frecuenciaMantenimiento;
    }

    public String getUltimoMantenimiento() {
        return ultimoMantenimiento;
    }

    public String getProximoMantenimiento() {
        return proximoMantenimiento;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setFrecuenciaMantenimiento(String frecuenciaMantenimiento) {
        this.frecuenciaMantenimiento = frecuenciaMantenimiento;
    }

    public void setUltimoMantenimiento(String ultimoMantenimiento) {
        this.ultimoMantenimiento = ultimoMantenimiento;
    }

    public void setProximoMantenimiento(String proximoMantenimiento) {
        this.proximoMantenimiento = proximoMantenimiento;
    }

    public void setUbicacionActual(String ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        return Objects.equals(this.codigoEquipo, other.codigoEquipo);
    }
    
    
    
    

}
