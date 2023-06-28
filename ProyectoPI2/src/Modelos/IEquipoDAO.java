/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author Eider
 */
public interface IEquipoDAO {
    
    int grabarEquipo(Equipo e);
    int borrarEquipo(String codigo);
    int modificarEquipo(Equipo e);
    int modificarEstadoEquipo(Equipo e);
    
    ArrayList<Equipo> listadoEquipos(String codigoEquipo);
    ArrayList<Equipo> listadoEquiposDisponible(String ubicacion);
}
