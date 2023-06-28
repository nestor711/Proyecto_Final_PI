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
public interface IPrestamoDAO {
    int grabarPrestamo(Prestamo p,Equipo e);
    int borrarPrestamo(String codigo);
    boolean buscarPrestamo(String id);
    
    ArrayList<Prestamo> listadoPrestamo(String nombreRespon);
}
