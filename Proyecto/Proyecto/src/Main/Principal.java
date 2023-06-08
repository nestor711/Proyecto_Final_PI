/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controladores.ControladorVistaIngreso;
import Vistas.VistaDeOpciones;
import Vistas.VistaIngresoDeEquipo;
import Vistas.VistaModificarEquipos;
import Vistas.VistaIngresoDeUsuario;
import Vistas.VistaListaDeEquipos;
import Vistas.VistaRegistrarUsuarios;

/**
 *
 * @author Eider
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        VistaIngresoDeUsuario miVista= new VistaIngresoDeUsuario();
        ControladorVistaIngreso miControlador= new ControladorVistaIngreso(miVista);
        //VistaListaDeEquipos miLista = new VistaListaDeEquipos();
       
        
    }
    
}
